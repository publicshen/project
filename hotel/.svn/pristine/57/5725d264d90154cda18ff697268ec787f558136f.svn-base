package com.bwie.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bwie.entity.Human;
import com.bwie.entity.Page;
import com.bwie.service.HumanService;
import com.bwie.util.PageUtil;

@Controller
public class HumanController {

	@Resource
	private HumanService humanService;
	
	//到列表页面
	@RequestMapping("/tohumanlist")
	public ModelAndView tohumanlist(){
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/main/humanlist");
		
		return mav;
	}
	
	//列表
	@ResponseBody
	@RequestMapping("/humanlist")
	public Map<String, Object> getHumanList(HttpServletRequest request){
		
		Integer page=request.getParameter("page") == null ? 1 : Integer.parseInt(request.getParameter("page"));
		Integer pageSize = request.getParameter("rows") == null ? 5 : Integer.parseInt(request.getParameter("rows"));
		
		Page p = new Page();
		p.setPage((page-1)*pageSize);
		p.setPageSize(pageSize);
		List<Human> rows = humanService.getHumanList(p);
		int total = humanService.listCount();
		
		Map<String, Object> map = new HashMap<String, Object>();
	
		map.put("rows", rows);
		map.put("total", total);
		
		return map;
	}
	
	

	//删除
	@RequestMapping("/deleteHuman")
	public String deleteHuman(int humanId){
		
		humanService.deleteHuman(humanId);;
		return "redirect:humanlist.do";
	}
	
	//添加跳转
	@RequestMapping("/toaddHuman")
	public ModelAndView toaddHuman(){
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/main/addHuman");
		
		return mav;
	}
	
	//折线图
	@RequestMapping("/tonumber")
	public ModelAndView tonumber(){
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/main/number");
		
		return mav;
	}
	
	//添加
	@RequestMapping("/addHuman")
	public String insertHuman(Human human){
		
		humanService.insertHuman(human);
		return "redirect:humanlist.do";
	}
	
	//根据ID找对象
	@RequestMapping("/toupdateHuman")
	public ModelAndView toupdateHuman(int humanId){
		
		Human human = humanService.getById(humanId);
		ModelAndView mav = new ModelAndView();
		mav.addObject("human", human);
		mav.setViewName("/main/updateHuman");
		
		return mav;
	}
	
	//修改
	@RequestMapping("/updateHuman")
	public String updateHuman(Human human){
		
		humanService.updateHuman(human);
		return "redirect:humanlist.do";
	}
	
}
