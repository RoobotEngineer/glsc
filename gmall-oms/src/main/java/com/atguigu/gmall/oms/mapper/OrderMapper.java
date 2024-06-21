package com.atguigu.gmall.oms.mapper;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wuhao
 * @email wuhao@qq.com
 * @date 2024-06-21 11:13:53
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {
	
}
