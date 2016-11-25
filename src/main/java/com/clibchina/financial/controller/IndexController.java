package com.clibchina.financial.controller;


import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by changlifeng on 16/11/25.
 */

public class IndexController {

    public Map<String, Object> index() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("a","1");
        Map<String, Object> result = new HashMap<>();
        result.put("status", "ok");
        result.put("data", jsonObject);
        return result;
    }

}
