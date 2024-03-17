package com.example.demo.web.menu;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Item;
import com.example.demo.entity.ItemMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemFindService {

    private final ItemMapper mapper;

    public List<Item> findAllItems() {
        return mapper.selectAll();
    }
}
