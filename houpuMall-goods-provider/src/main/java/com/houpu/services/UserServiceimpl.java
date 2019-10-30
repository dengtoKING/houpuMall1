package com.houpu.services;

import com.houpu.mapper.UserMapper;
import com.houpu.model.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<Brand> queryById(){
		return userMapper.selectAll();
	}
}
