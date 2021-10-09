package com.algorithm.yanolja;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InverterTest {
    private String invert(String value){
        if (value != null || value.equals("")){
            return "";
        }

        return new StringBuilder(value).reverse().toString();
    }
    @Test
    public void shouldInvert(){
        String inverted = Inverter.invert(null);

        Assert.fail();
    }

}