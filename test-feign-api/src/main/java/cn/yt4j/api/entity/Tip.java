package cn.yt4j.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author gyv12345@163.com
 */
@Data
public class Tip {
    @TableId(type=IdType.AUTO)
    private Integer id;

    private String title;
}
