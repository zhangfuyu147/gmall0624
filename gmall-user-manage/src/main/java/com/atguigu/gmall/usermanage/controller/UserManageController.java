package com.atguigu.gmall.usermanage.controller;

import com.atguigu.gmall.usermanage.bean.UserInfo;
import com.atguigu.gmall.usermanage.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserManageController {

    @Autowired
    private UserManageService userManageService;

    @ResponseBody
    @RequestMapping("findAll")
    public List<UserInfo> findAll() {
        return userManageService.findAll();
    }
}
