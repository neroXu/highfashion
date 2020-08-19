package com.hf;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by Machenike-Pc on 2019/7/12.
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Result implements Serializable{
    private boolean status;
    private String msg;

}
