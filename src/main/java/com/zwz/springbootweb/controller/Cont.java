package com.zwz.springbootweb.controller;

import com.zwz.springbootweb.dao.ReglisterDao;
import com.zwz.springbootweb.domain.Regilster;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class Cont {
    @Autowired
    private ReglisterDao reglisterDao;
    @RequestMapping("/")
    public String index() {
        return "login";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/fail")
    public String test() {
        return "fail";
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }
    @RequestMapping("/index")
    public String toIndex(HttpSession  session,Model model) {
        if(session.getAttribute("Reglister")!=null){
            return "goods";
        }else{
            model.addAttribute("msg","请先登录!");
            return "login";
        }
    }

    @RequestMapping("/goods")
    public String goods(HttpSession  session,Model model) {
       /* if(session.getAttribute("Reglister")!=null){
            return "goods";
        }else{
            model.addAttribute("msg","请先登录!");
            return "login";
        }*/

        return "goods";

    }

    @RequestMapping("/turnlogin")
    public String turnlogin(){
        return "login";
    }

    @RequestMapping("/turnregister")
    public String tuenregister(){
        return "register";
    }




    @RequestMapping(value = "/loginjudge", method = RequestMethod.POST)   // false to new page.  success to new page.
    public String loginjudge( Regilster regilster, HttpSession  session, Model model) {
        String username = regilster.getUsername();
        String password = regilster.getPassword();


        System.out.println(username + password);


        Regilster result = reglisterDao.selectReglister(username, password);
        System.out.println(result);
        if (result != null) {
            session.setAttribute("Reglister", regilster);
            return "index";

        } else {
            model.addAttribute("msg", "账号或者密码错误请检查或者注册");
            return "login";
        }

    }


    @RequestMapping("/retolo")
    public String retolo( Regilster regilster,HttpSession  session,Model model){
        String username = regilster.getUsername();
        String password = regilster.getPassword();


        System.out.println(username + password);

        Regilster result = reglisterDao.selectReglister(username, password);
        System.out.println(result);
        if (result != null) {
            session.setAttribute("Reglister", regilster);
            return "index";

        } else {
            model.addAttribute("msg", "账号或者密码错误请检查");
            return "login";
        }
    }

    @RequestMapping(value = "/registerjudge", method = RequestMethod.POST)
    public String register(HttpServletRequest request,Model model) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String password2 = request.getParameter("password2");
        System.out.println(password.equals(password2));
        System.out.println(password+"和"+password2);

        if(!password.equals(password2)){
            model.addAttribute("msg","俩次输入的密码不一样");
            return "register";
        } else{
            int i = reglisterDao.insertReglister(username, password);
            System.out.println(i + "row changed");
            model.addAttribute("msg","注册成功!");
            return "register";
        }






    }

    @RequestMapping(value = "/lotore", method = RequestMethod.POST)
    public String register2(HttpServletRequest request,Model model) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String password2 = request.getParameter("password2");
        System.out.println(password.equals(password2));
        System.out.println(password+"和"+password2);


        if(!password.equals(password2)){
            model.addAttribute("msg","俩次输入的密码不一样");
            return "register";
        }


        else{
            int i = reglisterDao.insertReglister(username, password);
            System.out.println(i + "row changed");
            model.addAttribute("msg","注册成功!");
            return "register";
        }

    }
}
