package com.example.pengeluaranNew.vo;

import lombok.Data;

@Data
public class ResultVO{

    private Integer status;
    private String message;
    private Object results;
    // constructor
    public ResultVO(){}
   
}