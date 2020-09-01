package cn.yt4j.datasource.controller;

import cn.yt4j.datasource.service.TestService;
import cn.yt4j.api.client.TestApi;
import cn.yt4j.api.entity.Tip;
import cn.yt4j.datasource.entity.Test;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gyv12345@163.com
 */
@AllArgsConstructor
@RestController
@RequestMapping("test")
public class TestController {
    private final TestService testService;

    @Autowired
    private TestApi testApi;


    @PostMapping("add")
    public boolean add(@RequestBody Test test) {
        return testService.save(test);
    }

    @PostMapping("addTip")
    public boolean add(@RequestBody Tip tip) {
        return testApi.add(tip);
    }

    @PostMapping("seata")
    public Boolean seata(@RequestBody Test test){
        return this.testService.seata(test);
    }
}
