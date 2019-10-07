package com.arash.edu.price.model;

import lombok.Data;
import lombok.val;

@Data
public class FooPriceDto {

    private String foo;
    private String bar;
    private String bus;

    public static FooPriceDto mock() {
        val result = new FooPriceDto();
        result.foo = "foo";
        result.bar = "bar";
        result.bus = "bus";
        return result;
    }
}
