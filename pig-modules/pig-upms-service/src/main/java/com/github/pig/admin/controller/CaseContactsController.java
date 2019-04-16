package com.github.pig.admin.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pig.admin.model.entity.CaseContacts;
import com.github.pig.admin.service.CaseContactsService;
import com.github.pig.common.util.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 联系人前端控制器
 */
@RestController
@RequestMapping("/admin/caseContacts")
public class CaseContactsController {
    @Autowired
    CaseContactsService caseContactsService;


    /**
     * 分页查询联系人
     * 根据cid查询
     * @return
     */
    @RequestMapping("/page")
    public Page page(int page,int limit,String cid){
        return caseContactsService.selectPage(new Page<CaseContacts>(page,limit)
                ,new EntityWrapper<CaseContacts>()
                        .eq("cid",cid));
    }

}
