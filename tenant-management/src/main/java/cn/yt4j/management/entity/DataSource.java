package cn.yt4j.management.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author gyv12345@163.com
 */
@TableName("tenant_datasource")
@Data
public class DataSource {

    @TableId(type=IdType.AUTO)
    private Integer id;

    private String poolName;

    private String url;

    @TableField("driver_name")
    private String driverClassName;

    private String username;

    private String password;
}
