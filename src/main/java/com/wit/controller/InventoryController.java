package com.wit.controller;

import com.github.pagehelper.PageInfo;
import com.wit.pojo.Inventory;
import com.wit.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/ops")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @RequestMapping("/showAllInventories")
    public String show(Model model, @RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "3") Integer pageSize){
        PageInfo<Inventory> pageInventories =inventoryService.selectAllInventories(pageNum,pageSize);
        model.addAttribute("pageNum",pageInventories.getPageNum());

        model.addAttribute("pageSize",pageInventories.getPageSize());

        model.addAttribute("isFirstPage", pageInventories.isIsFirstPage());
        //获得总页数
        model.addAttribute("totalPages", pageInventories.getPages());
        //是否是最后一页
        model.addAttribute("isLastPage", pageInventories.isIsLastPage());
        model.addAttribute("inventories",pageInventories.getList());
        return "inventoryShow";
    }
}
