package com.test.dao;

import com.test.bo.BJg0101;

public interface Bjg0101Dao {
	//此处方法名称必须和select 的id一致  方法参数需要和parameterType类型一致  返回值与resultType一致
	public BJg0101 findBjByPk(String jzgbh);
}
