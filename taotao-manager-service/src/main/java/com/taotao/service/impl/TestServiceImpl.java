package com.taotao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.mapper.TestMapper;
import com.taotao.service.TestService;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	TestMapper testMapper;
	
	@Override
	public String queryNow() {
		//注入mapper
		//调用mapper的方法 返回
		return testMapper.queryNow();
	}

}
