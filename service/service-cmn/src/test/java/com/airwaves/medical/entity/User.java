package com.airwaves.medical.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author airwaves
 * @create 2022-02-08 下午9:00
 * @description
 **/
@Data
public class User {
    @ExcelProperty(value = "用户编号",index = 0)
    private int uid;
    @ExcelProperty(value = "用户名称",index = 1)
    private String username;
}
