package com.aq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName SpringbootApplication
 * @Description :
 * @Author YaoAqiang
 * @Date 2019/10/8 15:33
 * @Version 1.0
 **/

@SpringBootApplication
@Controller
public class SpringbootApplication {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "hello world";
    }


    public static void main(String[] args) {

        SpringApplication.run(SpringbootApplication.class,args);

    }
}
