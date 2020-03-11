package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhongzheng
 * @email 1036731185@atguigu.com
 * @date 2020-03-11 20:41:45
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
