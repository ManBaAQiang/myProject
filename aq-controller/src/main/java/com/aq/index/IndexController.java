package com.aq.index;

import com.aq.sunrise.manager.IndexManager;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description :
 * @Date 2019/12/22 23:00
 **/

@RestController
public class IndexController {

    @Autowired
    private IndexManager indexManager;

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "welcome com my vueProject";
    }

    @RequestMapping("test")
    @ResponseBody
    public JSONObject testGet() {

        return indexManager.queryHotData();
    }

}
