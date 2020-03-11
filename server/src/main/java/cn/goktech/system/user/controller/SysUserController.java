package cn.goktech.system.user.controller;


import cn.goktech.system.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author duany
 * @since 2020-03-11
 */
@RestController
@RequestMapping("/user/sysUser")
public class SysUserController {
	@Autowired
	private SysUserService sysUserService;

	@GetMapping("")
	public String getUser(Long id) {
		return sysUserService.getUser(id);
	}
}

