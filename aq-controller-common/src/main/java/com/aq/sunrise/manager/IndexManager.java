package com.aq.sunrise.manager;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

/**
 * @ClassName IndexManager
 * @Description :
 * @Date 2020/3/23 9:56
 **/

@Component
public class IndexManager {

    public JSONObject queryHotData(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","yaq");
        jsonObject.put("age",25);
        jsonObject.put("sex","man");
        return jsonObject;
    }

}
