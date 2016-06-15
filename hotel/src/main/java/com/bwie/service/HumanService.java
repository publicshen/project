package com.bwie.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bwie.entity.Human;
import com.bwie.entity.Page;

import mapper.HumanMapper;

@Service
public class HumanService {

	@Resource
	private HumanMapper humanMapper;
	
	//列表
	public List<Human> getHumanList(Page page){
				
		return humanMapper.getHumanList(page);
	}
		
		//总数
		public int listCount(){
			
			return humanMapper.listCount();
		}
		
		//删除
		public void deleteHuman(int humanId){
			
			humanMapper.deleteHuman(humanId);
		}
		
		//添加
		public void insertHuman(Human human){
			
			humanMapper.insertHuman(human);
		}
		
		//根据ID找对象
		public Human getById(int humanId){
			
			return humanMapper.getById(humanId);
		}
		
		//修改
		public void updateHuman(Human human){
			
			humanMapper.updateHuman(human);
		}
}
