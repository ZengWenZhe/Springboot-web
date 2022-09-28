package com.zwz.springbootweb.controller;

import org.apache.tomcat.util.http.parser.Cookie;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ParamterController {
/*//http://localhost:8080/user/1/owner/zz?age=15&inters=playbasketball&inters=watchmoving
   @GetMapping("/user/{id}/owner/{username}")
    public Map<String,Object> getUser(@PathVariable("id") String id,  //获取路径中的id
                                      @PathVariable("username") String username,  //获取路径中的username
                                      @RequestHeader("User-Agent") String header,  //获取的单个User-Agent头信息
                                      @RequestHeader Map<String,String> headers,  //获取 所有的头信息
                                      @RequestParam("age") String age,   //获取请求参数中age的值
                                      @RequestParam("inters") List<String> inters,  //获取请求参数中inters值
                                      @RequestParam Map<String,String> params,     //获取请求所有的参数的值
                                      @CookieValue("_ga") String _ga,        //获取_ga的Cookie的值
                                      @CookieValue("_ga") Cookie cookies){           //获取所有_ga的Cookie的值

        HashMap<String, Object> map = new HashMap<>();
        map.put("id",id);
        map.put("username",username);
        map.put("header",header);
        map.put("headers",headers);

        map.put("age",age);
        map.put("inters",inters);
        map.put("params",params);

        map.put("_ga",_ga);
        map.put("cookies",cookies);

        //System.out.println(cookies);
        return map;
    }*/

}
