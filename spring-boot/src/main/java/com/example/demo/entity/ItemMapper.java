package com.example.demo.entity;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ItemMapper {
    @Select("select * from item")
    List<Item> selectAll();

    @Insert("insert into item(id, item_name, price) values(#{id}, #{itemName}, #{price})")
    void regist(Item item);
}
