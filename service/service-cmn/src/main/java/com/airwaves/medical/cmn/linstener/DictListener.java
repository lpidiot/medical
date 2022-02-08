package com.airwaves.medical.cmn.linstener;

import com.airwaves.medical.cmn.mapper.DictMapper;
import com.airwaves.medical.model.cmn.Dict;
import com.airwaves.medical.vo.cmn.DictEeVo;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import org.springframework.beans.BeanUtils;

/**
 * @author airwaves
 * @create 2022-02-08 下午10:01
 * @description
 **/
public class DictListener extends AnalysisEventListener<DictEeVo> {

    private DictMapper dictMapper;

    public DictListener(DictMapper dictMapper) {
        this.dictMapper = dictMapper;
    }

    @Override
    public void invoke(DictEeVo dictEeVo, AnalysisContext analysisContext) {
        Dict dict = new Dict();
        BeanUtils.copyProperties(dictEeVo,dict);
        dict.setIsDeleted(0);
        dictMapper.insert(dict);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
