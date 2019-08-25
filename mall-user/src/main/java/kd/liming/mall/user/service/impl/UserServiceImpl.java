package kd.liming.mall.user.service.impl;

import kd.liming.mall.user.mapper.UserMapper;
import kd.liming.mall.user.model.User;
import kd.liming.mall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;


	@Override
	public List<User> getAll() {
		return userMapper.selectAll();
	}
}
