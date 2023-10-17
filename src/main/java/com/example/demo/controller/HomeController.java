package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Controller  // @ : Annotation 주석, 부가설명, java컴파일러에게 알려줌 * // : 사람에게 알려주는 주석
@Slf4j
public class HomeController {
    @RequestMapping("/")
    public String home() {
        log.debug("debug");
        log.warn("warn");
        log.error("error");
        System.out.println("print");
        return "home"; // home.html을 작성해야 Whitelabel Error Page가 발생 안함
    }
    @RequestMapping("/home2")
    public String home2() {
        return "home"; // 응답결과 -> HTML
    }
    @RequestMapping("/home3")   //   @RequestMapping("/home3", "/home4", ...)으로도 작성 가능
    @ResponseBody // json을 출력하기 위함
    public List<String> home3() {  // 응답할 형식을 지정해야 함
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");  // json 형식으로 
        list.add("C");
        
        return list; // 응답결과 -> json []
    }
}
