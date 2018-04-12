package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

public interface SuccessKilledDao {
	
	/**
	 * 插入购买明细, 可过滤重复
	 * @param sucessKillId
	 * @param userPhone
	 * @return 插入的结果及数量
	 */
	
	int insertSuccessKilled(@Param("sucessKillId") long sucessKillId, @Param("userPhone") long userPhone);
	
	/**
	 * 查询SucessKilled并携带秒杀产品对象
	 * @param seckillId
	 * @return
	 */
	SuccessKilled queryByIdWithSeckill(@Param("sucessKillId") long sucessKillId, @Param("userPhone") long userPhone);

}
