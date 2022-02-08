package com.airwaves.medical;

import com.airwaves.medical.entity.User;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.Map;

/**
 * @author airwaves
 * @create 2022-02-08 下午9:11
 * @description
 **/
public class ExcelListener extends AnalysisEventListener<User> {
    //一行一行读 第二行开始
    @Override
    public void invoke(User user, AnalysisContext analysisContext) {
        System.out.println(user);
    }

    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        System.out.println("表头"+headMap);
    }

    //读之后执行
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
