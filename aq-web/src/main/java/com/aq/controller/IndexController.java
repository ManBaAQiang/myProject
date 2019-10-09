package com.aq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName IndexController
 * @Description :
 * @Author YaoAqiang
 * @Date 2019/10/9 15:25
 * @Version 1.0
 **/

@RestController
public class IndexController {

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "welcome com my web";
    }

}
