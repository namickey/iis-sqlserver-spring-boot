package com.example.demo.web.master.item;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Item;
import com.example.demo.entity.ItemMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemRegistService {
    
    private final ItemMapper mapper;

    public void regist(Item item) {
        mapper.regist(item);
    }
}
