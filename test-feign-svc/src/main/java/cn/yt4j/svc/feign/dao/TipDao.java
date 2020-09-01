package cn.yt4j.svc.feign.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.yt4j.api.entity.Tip;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Tip)表数据库访问层
 *
 * @author gyv12345@163.com
 * @since 2020-05-21 14:15:12
 */
@Mapper
public interface TipDao extends BaseMapper<Tip> {

}