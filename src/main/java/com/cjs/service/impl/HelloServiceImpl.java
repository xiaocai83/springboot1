package com.cjs.service.impl;

import com.cjs.dao.HelloDao;
import com.cjs.domain.Account;
import com.cjs.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:cjs
 * @Description:
 * @Date:Created in 18:46 2021/2/25
 * @Modified by:
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private HelloDao helloDao;

    @Override
    public List<Account> queryAll() {
        System.out.println("service中");
        return helloDao.queryAll();
    }
}
