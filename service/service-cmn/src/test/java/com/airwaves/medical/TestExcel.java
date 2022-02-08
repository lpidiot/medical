package com.airwaves.medical;

import com.airwaves.medical.entity.User;
import com.alibaba.excel.EasyExcel;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

/**
 * @author airwaves
 * @create 2022-02-08 下午8:59
 * @description
 **/
@SpringBootTest
public class TestExcel {

    @Test
    public void testWrite(){
        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setUid(i);
            user.setUsername("test"+i);
            users.add(user);
        }
        String fileName="/home/idiot/office/test/01.xlsx";
        EasyExcel.write(fileName, User.class).sheet("用户信息").doWrite(users);
    }
    @Test
    public void testRead(){
        String fileName="/home/idiot/office/test/01.xlsx";
        EasyExcel.read(fileName,User.class,new ExcelListener()).sheet().doRead();
    }
}
