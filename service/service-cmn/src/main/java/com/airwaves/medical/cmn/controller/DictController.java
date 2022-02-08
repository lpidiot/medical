package com.airwaves.medical.cmn.controller;

import com.airwaves.medical.cmn.service.DictService;
import com.airwaves.medical.common.result.Result;
import com.airwaves.medical.model.cmn.Dict;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author airwaves
 * @create 2022-02-08 下午7:39
 * @description
 **/
@Api("数据字典接口")
@CrossOrigin
@RestController
@RequestMapping("/admin/cmn/dict")
public class DictController {
    @Autowired
    private DictService dictService;

    @ApiOperation("根据id查询子数据列表")
    @GetMapping("findChildData/{id}")
    public Result findChildData(@PathVariable Long id){
        List<Dict> list=dictService.findChildData(id);
        return Result.ok(list);
    }

    @ApiOperation("导出数据字典")
    @GetMapping("exportData")
    public void exportData(HttpServletResponse response){
        dictService.exportDictData(response);
    }

    @ApiOperation("导入数据字典")
    @PostMapping("importData")
    public void importData(MultipartFile file){
        dictService.importDictData(file);
    }
}
