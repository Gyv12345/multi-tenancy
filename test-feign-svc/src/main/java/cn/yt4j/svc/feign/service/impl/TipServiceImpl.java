package cn.yt4j.svc.feign.service.impl;

import cn.yt4j.svc.feign.dao.TipDao;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.yt4j.api.entity.Tip;
import cn.yt4j.svc.feign.service.TipService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (Tip)表服务实现类
 *
 * @author gyv12345@163.com
 * @since 2020-05-21 14:15:14
 */
@DS("#yt4j.tenant")
@Service("tipService")
public class TipServiceImpl extends ServiceImpl<TipDao, Tip> implements TipService {

    @DS("#yt4j.tenant")
    @GlobalTransactional
    @Override
    public Boolean add(Tip tip) {
        throw new NullPointerException("测试");
    }
}