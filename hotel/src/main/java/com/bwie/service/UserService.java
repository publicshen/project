package com.bwie.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mapper.UserMapper;

@Service
public class UserService {

	@Resource
	private UserMapper userMapper;
	
	
}
