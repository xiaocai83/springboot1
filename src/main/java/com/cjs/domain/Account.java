package com.cjs.domain;

import java.io.Serializable;

/**
 * @Author:cjs
 * @Description:
 * @Date:Created in 16:39 2021/2/24
 * @Modified by:
 */
public class Account implements Serializable {
    private Integer id;
    private String name;
    private Double money;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", money=").append(money);
        sb.append('}');
        return sb.toString();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
