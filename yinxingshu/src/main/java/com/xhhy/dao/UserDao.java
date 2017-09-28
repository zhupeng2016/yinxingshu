package com.xhhy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.xhhy.bean.UserBean;

@Repository
public interface UserDao {
	public UserBean login(@Param("ln")String loginName,@Param("ps")String password);

	
	public void update(int userId);
}
