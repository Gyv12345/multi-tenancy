package cn.yt4j.svc.feign.controller;

import cn.yt4j.svc.feign.service.TipService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.yt4j.api.entity.Tip;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Tip)表控制层
 *
 * @author gyv12345@163.com
 * @since 2020-05-21 14:15:14
 */
@RestController
@RequestMapping("tip")
public class TipController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private TipService tipService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param tip 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Tip> page, Tip tip) {
        return success(this.tipService.page(page, new QueryWrapper<>(tip)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.tipService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param tip 实体对象
     * @return 新增结果
     */
    @PostMapping("insert")
    public Boolean insert(@RequestBody Tip tip) {
        return this.tipService.save(tip);
    }

    @PostMapping("add")
    public Boolean add (@RequestBody Tip tip){
        return this.tipService.add(tip);
    }

    /**
     * 修改数据
     *
     * @param tip 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Tip tip) {
        return success(this.tipService.updateById(tip));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.tipService.removeByIds(idList));
    }
}