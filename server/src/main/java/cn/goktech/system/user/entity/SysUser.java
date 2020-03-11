package cn.goktech.system.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author duany
 * @since 2020-03-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "SysUser对象", description = "用户信息表")
public class SysUser implements Serializable {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "用户ID")
	@TableId(value = "id", type = IdType.AUTO)
	private Long id;

	@ApiModelProperty(value = "部门ID")
	private Long deptId;

	@ApiModelProperty(value = "登录账号")
	private String loginName;

	@ApiModelProperty(value = "用户昵称")
	private String userName;

	@ApiModelProperty(value = "用户邮箱")
	private String email;

	@ApiModelProperty(value = "手机号码")
	private String phoneNumber;

	@ApiModelProperty(value = "用户性别")
	private String gender;

	@ApiModelProperty(value = "职位")
	private Long position;

	@ApiModelProperty(value = "密码")
	private String password;

	@ApiModelProperty(value = "盐加密")
	private String salt;

	@ApiModelProperty(value = "帐号状态")
	private String status;

	@ApiModelProperty(value = "删除标志")
	private String delFlag;

	@ApiModelProperty(value = "最后登陆IP")
	private String loginIp;

	@ApiModelProperty(value = "最后登陆时间")
	private LocalDateTime loginDate;

	@ApiModelProperty(value = "创建者")
	private Long createBy;

	@ApiModelProperty(value = "创建时间")
	private LocalDateTime createTime;

	@ApiModelProperty(value = "更新者")
	private Long updateBy;

	@ApiModelProperty(value = "更新时间")
	private LocalDateTime updateTime;

	@ApiModelProperty(value = "备注")
	private String remark;

	@ApiModelProperty(value = "jwt标识")
	private String token;


}
