package cn.yt4j.config;

import com.baomidou.dynamic.datasource.processor.DsProcessor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author gyv12345@163.com
 */
public class HeardDsProcessor extends DsProcessor {

	private static final String YSG_PREFIX = "#yt4j";

	/**
	 * 抽象匹配条件 匹配才会走当前执行器否则走下一级执行器
	 *
	 * @param key DS注解里的内容
	 * @return 是否匹配
	 */
	@Override
	public boolean matches(String key) {
		return key.startsWith(YSG_PREFIX);
	}

	/**
	 * 抽象最终决定数据源
	 *
	 * @param invocation 方法执行信息
	 * @param key        DS注解里的内容
	 * @return 数据源名称
	 */
	@Override
	public String doDetermineDatasource(MethodInvocation invocation, String key) {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		return "ds-"+request.getHeader(key.substring(5));
	}
}
