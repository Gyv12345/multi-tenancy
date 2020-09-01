package cn.yt4j.management.controller;

import cn.yt4j.management.entity.DataSource;
import cn.yt4j.management.service.DataSourceService;
import lombok.AllArgsConstructor;
import org.apache.rocketmq.common.message.MessageConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gyv12345@163.com
 */
@RestController
@RequestMapping("tenant")
@AllArgsConstructor
public class TenantDataSourceController {

    private final DataSourceService dataSourceService;

    @Autowired
    private MessageChannel output;

    @PostMapping("add")
    public boolean add(@RequestBody DataSource source) {
        Map<String, Object> headers = new HashMap<>(16);
        headers.put(MessageConst.PROPERTY_TAGS, "tagStr");
        Message message = MessageBuilder.createMessage(source, new MessageHeaders(headers));
        output.send(message);
        return this.dataSourceService.save(source);
    }
}
