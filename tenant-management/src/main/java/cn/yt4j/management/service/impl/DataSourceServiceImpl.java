package cn.yt4j.management.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.yt4j.management.dao.DataSourceMapper;
import cn.yt4j.management.entity.DataSource;
import cn.yt4j.management.service.DataSourceService;
import org.springframework.stereotype.Service;

/**
 * @author gyv12345@163.com
 */
@Service
public class DataSourceServiceImpl extends ServiceImpl<DataSourceMapper, DataSource> implements DataSourceService {
}
