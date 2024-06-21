package com.atguigu.gmall.ums.mapper;

import com.atguigu.gmall.ums.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author wuhao
 * @email wuhao@qq.com
 * @date 2024-06-21 11:25:11
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
	
}
