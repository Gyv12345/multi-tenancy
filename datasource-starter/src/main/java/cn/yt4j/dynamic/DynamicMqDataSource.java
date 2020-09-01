package cn.yt4j.dynamic;

import cn.yt4j.constants.DataSourceConstants;
import com.alibaba.fastjson.JSON;
import com.baomidou.dynamic.datasource.DynamicRoutingDataSource;
import com.baomidou.dynamic.datasource.creator.DataSourceCreator;
import com.baomidou.dynamic.datasource.spring.boot.autoconfigure.DataSourceProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import javax.sql.DataSource;
import java.util.Map;

/**
 * @author gyv12345@163.com
 */
@Slf4j
public class DynamicMqDataSource {
    @Autowired
    private DataSource dataSource;

    @Autowired
    private DataSourceCreator dataSourceCreator;

    @StreamListener(Sink.INPUT)
    public void listen(String in) {
        DynamicRoutingDataSource ds = (DynamicRoutingDataSource) dataSource;
        Map<String,String> map= JSON.parseObject(in, Map.class);
        DataSourceProperty property=new DataSourceProperty();
        property.setUsername(map.get(DataSourceConstants.DS_USER_NAME));
        property.setPassword(map.get(DataSourceConstants.DS_USER_PWD));
        property.setUrl(map.get(DataSourceConstants.DS_JDBC_URL));
        log.info(property.toString());
        DataSource dataSource = dataSourceCreator.createDataSource(property);
        ds.addDataSource(map.get(DataSourceConstants.POOL_NAME), dataSource);
        log.info(ds.getCurrentDataSources().toString());
        log.info("in:{}",in);
    }
}
