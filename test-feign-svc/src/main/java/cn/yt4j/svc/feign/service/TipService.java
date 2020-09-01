package cn.yt4j.svc.feign.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.yt4j.api.entity.Tip;

/**
 * (Tip)表服务接口
 *
 * @author gyv12345@163.com
 * @since 2020-05-21 14:15:13
 */
public interface TipService extends IService<Tip> {

    Boolean add(Tip tip);

}