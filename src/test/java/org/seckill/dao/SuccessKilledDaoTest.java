package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {

	@Autowired
	private SuccessKilledDao successKilledDao;
	
	/**
	 * org.apache.ibatis.binding.BindingException: Invalid bound statement (not found): org.seckill.dao.SuccessKilledDao.insertSucessKilled
	 */
	@Test
	public void testInsertSuccessKilled() {
		/*
		 * 第一次 insertCount = 1
		 * 第二次 insertCount = 0
		 */
		long id = 1000L;
		long phone = 15365717169L;
		int insertCount = successKilledDao.insertSuccessKilled(id, phone);
		System.out.println(insertCount);
	}

	@Test
	public void testQueryByIdWithSeckill() {
		long id = 1000L;
		long phone = 15365717169L;
		SuccessKilled seckill = successKilledDao.queryByIdWithSeckill(id, phone);
		System.out.println(seckill);
		System.out.println(seckill.getSeckill());
	}

}
