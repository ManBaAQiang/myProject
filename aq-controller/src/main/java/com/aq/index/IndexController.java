package com.aq.index;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description :
 * @Date 2019/12/22 23:00
 **/

@RestController
public class IndexController {

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "welcome com my vueProject";
    }

    @RequestMapping("test")
    @ResponseBody
    public JSONObject testGet() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","yaq");
        jsonObject.put("age",25);
        jsonObject.put("sex","man");
        return jsonObject;
    }

}
