package org.seckill.service;

import java.util.List;

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;
import org.seckill.exception.SeckillException;

/**
 * 业务接口：站在“使用者”角度设计接口
 * 三个方法：方法定义粒度，参数，返回类型（return 类型/异常）
 * 
 * @author hzl
 *
 */
public interface SeckillService {
	
	/**
	 * 查询所有的秒杀记录
	 * @return
	 */
	List<Seckill> getSeckillList();
	
	/**
	 * 查询单个秒杀记录
	 * @param seckillId
	 * @return
	 */
	Seckill getByID(long seckillId);
	
	/**
	 * 秒杀开始时输出秒杀接口地址，否则输出系统时间和秒杀时间
	 * @param seckillId
	 */
	Exposer exportSeckillUrl(long seckillId);
	
	/**
	 * 执行秒杀
	 * @param seckillId
	 * @param userPhone
	 * @param md5
	 */
	SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
		throws SeckillException, SeckillCloseException, RepeatKillException;
	 
	/**
	 * 执行秒杀 by 存儲過程
	 * @param seckillId
	 * @param userPhone
	 * @param md5
	 */
	SeckillExecution executeSeckillProcedure(long seckillId, long userPhone, String md5);
	
}
