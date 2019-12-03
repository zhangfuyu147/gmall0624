package com.atguigu.gmall.usermanage.service;

import com.atguigu.gmall.usermanage.bean.UserInfo;

import java.util.List;

public interface UserManageService {

    /**
     * 查询所有用户的数据
     * @return
     */
    List<UserInfo> findAll();
}
