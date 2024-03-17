package com.example.demo.web.master.item;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Item;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class RegistController {
    
    private final ItemRegistService itemRegistService;

    @GetMapping("/master/item/regist/index")
    public String index(ItemForm form) {
        
        return "master/item/index";
    }

    @PostMapping("/master/item/regist/confirm")
    public String confirm(ItemForm form) {
        
        return "master/item/confirm";
    }

    @PostMapping("/master/item/regist/regist")
    public String regist(ItemForm form) {
        Item item = form.toItem();
        itemRegistService.regist(item);
        return "redirect:/master/item/regist/complete";
    }

    @GetMapping("/master/item/regist/complete")
    public String complete() {
        
        return "master/item/complete";
    }
}
