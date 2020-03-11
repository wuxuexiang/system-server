package cn.goktech.system.user.service;

import cn.goktech.system.user.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author duany
 * @since 2020-03-11
 */
public interface SysUserService extends IService<SysUser> {
	String getUser(Long id);
}
