package com.wit.service;

import com.github.pagehelper.PageInfo;
import com.wit.pojo.Log;

import java.util.List;

public interface OpsService {

    String orderOut(String id);

    PageInfo<Log> findAllLog(Integer page, Integer pageSize);
}