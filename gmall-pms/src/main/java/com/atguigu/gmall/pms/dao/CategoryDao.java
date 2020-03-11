package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhongzheng
 * @email 1036731185@atguigu.com
 * @date 2020-03-11 17:15:29
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
