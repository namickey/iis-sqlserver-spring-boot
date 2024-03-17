package com.example.demo.web.master.item;

import org.springframework.beans.BeanUtils;

import com.example.demo.entity.Item;

import lombok.Data;

@Data
public class ItemForm {
    
    private Integer id;
    private String itemName;
    private Integer price;

    public Item toItem() {
        Item item = new Item();
        BeanUtils.copyProperties(this, item);
        return item;
    }
}
