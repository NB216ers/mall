package kd.liming.mall.user.controller;

import kd.liming.mall.user.model.User;
import kd.liming.mall.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
@Slf4j
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping(path = "/",params = "!=username")
	public List<User> getAll(){
		return userService.getAll();
	}
}
