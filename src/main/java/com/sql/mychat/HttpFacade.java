package com.sql.mychat;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Maps;

import java.util.Map;


@Controller
@RequestMapping("/1.0/")
public class HttpFacade {
    static {
        System.out.println("get in...");
    }
    @RequestMapping(value = "/{event}/{method}", method = RequestMethod.POST)
    @ResponseBody
    public String risklevel(@PathVariable("event") String event, @PathVariable("method") String method,
                            @RequestBody Map<String,Object> params) {
        Map<String, Object> requestLog = Maps.newHashMap(params);

        System.out.println(requestLog);
        return "ok, we got the request";
    }
}
