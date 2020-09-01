package cn.yt4j.datasource.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author gyv12345@163.com
 */
@Data
@TableName("t")
public class Test {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String content;
}
