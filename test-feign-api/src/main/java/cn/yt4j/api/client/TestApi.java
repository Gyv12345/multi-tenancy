package cn.yt4j.api.client;

import cn.yt4j.api.entity.Tip;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author gyv12345@163.com
 */
@FeignClient(name = "test-feign")
public interface TestApi {
    /**
     * 添加
     * @param tip
     * @return
     */
    @RequestMapping(value = "/tip/insert",method = RequestMethod.POST)
    Boolean add(@RequestBody Tip tip);


    /**
     * 添加
     * @param tip
     * @return
     */
    @RequestMapping(value = "/tip/add",method = RequestMethod.POST)
    Boolean save(@RequestBody Tip tip);
}
