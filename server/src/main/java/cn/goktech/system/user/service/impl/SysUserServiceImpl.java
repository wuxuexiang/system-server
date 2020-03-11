package cn.goktech.system.user.service.impl;

import cn.goktech.system.user.entity.SysUser;
import cn.goktech.system.user.mapper.SysUserMapper;
import cn.goktech.system.user.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author duany
 * @since 2020-03-11
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
	@Autowired
	SysUserMapper mapper;

	@Override
	public String getUser(Long id) {
		return mapper.getUser(id);
	}
}
