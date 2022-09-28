package com.zwz.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BodyController {


/*
    @ResponseBody
    @RequestMapping("/loginjudge11")
    public Map<String, Object> reBody(@RequestBody String content) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("content", content);
        return map;
    }


    @RequestMapping("/loginjudge")
    public String gotoSuccess(HttpServletRequest request) {
        request.setAttribute("msg", "zwz");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username+"--"+password);
        return "forward:/success";
    }

    @ResponseBody
    @RequestMapping("/success")
    public  Map<String,Object> success(HttpServletRequest request){
        Object msg = request.getAttribute("msg");
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg",msg);
        return map;
    }

    //user/1;name=zwz;inters=basketball,football
    @ResponseBody
    @GetMapping("/user/{id}")
    public Map carsSell(@MatrixVariable("name") String name,
                        @MatrixVariable("inters") List<String> inters,
                        @PathVariable("id") Integer id){
        Map<String,Object> map = new HashMap<>();

        map.put("name",name);
        map.put("inters",inters);
        map.put("id",id);
        return map;
    }*/
}
