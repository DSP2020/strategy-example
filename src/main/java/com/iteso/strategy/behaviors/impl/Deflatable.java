package com.iteso.strategy.behaviors.impl;

import com.iteso.strategy.behaviors.iDeflateBehavior;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/7/13
 * Time: 6:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Deflatable implements iDeflateBehavior {
    @Override
    public String deflate() {
        return "I'm deflating!";
    }

    @Override
    public String inflate() {
        return "I'm inflating!";
    }
}
