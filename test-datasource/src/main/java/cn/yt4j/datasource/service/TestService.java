package cn.yt4j.datasource.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.yt4j.datasource.entity.Test;

/**
 * @author gyv12345@163.com
 */
public interface TestService extends IService<Test> {

    Boolean seata(Test test);
}
