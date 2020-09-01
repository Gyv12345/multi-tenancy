package cn.yt4j.datasource.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.yt4j.datasource.entity.Test;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author gyv12345@163.com
 */
@Mapper
public interface TestMapper extends BaseMapper<Test> {
}
