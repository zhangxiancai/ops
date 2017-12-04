package com.wit.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wit.pojo.Log;
import com.wit.service.OpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/ops")
public class OpsController {


    @Autowired
    private OpsService opsService;
    @RequestMapping("/orderout")
    String OrderOut(){
        return  opsService.orderOut("1001");

    }
    @RequestMapping("showAllLog")
    public String showAllLog(Model model, @RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "3") Integer pageSize){
        PageInfo<Log> pagelogs =opsService.findAllLog(pageNum,pageSize);
        model.addAttribute("pageNum",pagelogs.getPageNum());

        model.addAttribute("pageSize",pagelogs.getPageSize());

        model.addAttribute("isFirstPage", pagelogs.isIsFirstPage());
        //获得总页数
        model.addAttribute("totalPages", pagelogs.getPages());
        //是否是最后一页
        model.addAttribute("isLastPage", pagelogs.isIsLastPage());
        model.addAttribute("logs",pagelogs.getList());


        return "showLogs";
    }
}
