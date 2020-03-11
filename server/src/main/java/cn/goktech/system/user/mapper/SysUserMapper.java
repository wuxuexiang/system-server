package cn.goktech.system.user.mapper;

import cn.goktech.system.user.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author duany
 * @since 2020-03-11
 */
@Repository
public interface SysUserMapper extends BaseMapper<SysUser> {

	String getUser(Long id);
}
