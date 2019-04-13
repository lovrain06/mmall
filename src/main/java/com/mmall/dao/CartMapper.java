package com.mmall.dao;

import com.mmall.pojo.Cart;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);
    //根据主键查询
    Cart selectByPrimaryKey(Integer id);
    //根据主键更新 字段的空判断
    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
}