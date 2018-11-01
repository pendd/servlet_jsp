package com.king.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by pd on 2018/10/24 17:03
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bank {

    private String username;
    private double balance;
}
