package com.iteso.strategy;

import com.iteso.strategy.behaviors.iBounceBehavior;
import com.iteso.strategy.behaviors.iDeflateBehavior;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/7/13
 * Time: 6:14 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Ball {
    private iBounceBehavior iBounceBehavior;
    private iDeflateBehavior iDeflateBehavior;
    private String type;

    public Ball() {
    }

    public String roll() {
        return getType() + " is rolling!";
    }

    public String performBounce() {
        return getiBounceBehavior().bounce();
    }

    public String performDeflate() {
        return getiDeflateBehavior().deflate();
    }

    public String performInflate() {
        return getiDeflateBehavior().inflate();
    }

    public iBounceBehavior getiBounceBehavior() {
        return iBounceBehavior;
    }

    public void setiBounceBehavior(iBounceBehavior iBounceBehavior) {
        this.iBounceBehavior = iBounceBehavior;
    }

    public iDeflateBehavior getiDeflateBehavior() {
        return iDeflateBehavior;
    }

    public void setiDeflateBehavior(iDeflateBehavior iDeflateBehavior) {
        this.iDeflateBehavior = iDeflateBehavior;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
