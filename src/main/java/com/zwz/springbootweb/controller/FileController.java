package com.zwz.springbootweb.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Slf4j
@Controller
public class FileController {
   /* @RequestMapping("/file")
    public String intoFileLoad(){
        return "fileLoad";
    }
    @PostMapping("/fileLoad")
    public String fileLoad(@RequestParam("username") String username,
                           @RequestParam("password") String password,
                           @RequestPart("photo") MultipartFile photo,
                           @RequestPart("photos") MultipartFile[] photos) throws IOException {

        log.info(username);
        log.info(password);

        if(!photo.isEmpty()){
            String filename = photo.getOriginalFilename();
            photo.transferTo(new File("E:\\ideaCache\\"+filename));
        }
        for (MultipartFile pho : photos) {
            if(!pho.isEmpty()){
                String filename = pho.getOriginalFilename();
                pho.transferTo(new File("E:\\ideaCache\\"+filename));
            }
        }

        return "fileInputSuccess";

    }*/
}
