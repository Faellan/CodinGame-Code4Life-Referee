package com.codingame.code4life;

/**
 * Created by hwang on 13/05/2017.
 */
class Translatable {
    String code;
    Object[] values;

    public Translatable(String code, Object... values) {
        this.code = code;
        this.values = values;
    }
}
