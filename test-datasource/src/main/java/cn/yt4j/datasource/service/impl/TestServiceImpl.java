package cn.yt4j.datasource.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.yt4j.api.client.TestApi;
import cn.yt4j.api.entity.Tip;
import cn.yt4j.datasource.dao.TestMapper;
import cn.yt4j.datasource.entity.Test;
import cn.yt4j.datasource.service.TestService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gyv12345@163.com
 */
@Service
@DS("#ysg.tenant")
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestService {

    @Autowired
    private TestApi testApi;


    @DS("#ysg.tenant")
    @GlobalTransactional
    @Override
    public Boolean seata(Test test) {
        this.baseMapper.insert(test);
        Tip tip=new Tip();
        tip.setTitle("全局事务");
        testApi.save(tip);
        return Boolean.TRUE;
    }
}
