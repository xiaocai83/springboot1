package com.cjs.dao;

import com.cjs.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:cjs
 * @Description:
 * @Date:Created in 18:47 2021/2/25
 * @Modified by:
 */
@Mapper
@Repository
public interface HelloDao {
    public List<Account> queryAll();


}
