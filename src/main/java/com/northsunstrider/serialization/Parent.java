package com.northsunstrider.serialization;

import java.io.Serializable;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月3日 上午10:23:53
 */
public class Parent implements Serializable {
    int a = 100;

    public Parent() {
        super();
    }

    public Parent(int a) {
        super();
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

}
