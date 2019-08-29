package com.wangfeng.domain;

public class Account {

    private Integer uid;

    private Integer id;

    private Double money;

    //该账户关联的用户(一个账户对应一个用户)
    private User user;



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
//
//    @Override
//    public String toString() {
//        return "Account{" +
//                "uid=" + uid +
//                ", id=" + id +
//                ", money=" + money +
//                ", user=" + user +
//                '}';
//    }

//    @Override
//    public String toString() {
//        return "Account{" +
//                "id=" + id +
//                ", money=" + money +
//                ", user=" + user +
//                '}';
//    }
}
