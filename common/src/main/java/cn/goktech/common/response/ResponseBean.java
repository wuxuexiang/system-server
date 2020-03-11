package cn.goktech.common.response;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * @Classname ResponseBean
 * @Description 统一返回对象
 * @Date 2020/3/11 15:33
 * @Created by duanyu
 */
@Data
@ApiModel("统一返回对象")
public class ResponseBean<T extends Serializable> {

	private int code;
	private String msg;
	private T date;
}
