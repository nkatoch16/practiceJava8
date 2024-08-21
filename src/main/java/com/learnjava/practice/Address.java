package com.learnjava.practice;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Address {
    private String city;
    private String state;
    private Integer postalCode;
}
