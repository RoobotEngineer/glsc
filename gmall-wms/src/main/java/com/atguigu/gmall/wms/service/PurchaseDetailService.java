package com.atguigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.wms.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author wuhao
 * @email wuhao@qq.com
 * @date 2024-06-21 11:27:02
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

