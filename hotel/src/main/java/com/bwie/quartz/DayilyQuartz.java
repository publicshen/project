package com.bwie.quartz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bwie.entity.Account;
import com.bwie.entity.Human;

import mapper.AccountMapper;
import mapper.NightAuditorMapper;

/**
 * ҹ��
 * @author ����ǿ
 *
 */
@Component
public class DayilyQuartz {
	
	@Autowired private NightAuditorMapper nightAuditorMapper;

	public void run() {
		// 查询房间价格和账户余额	
		try {
			List<Human> list = nightAuditorMapper.findPriceAndBalance();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
