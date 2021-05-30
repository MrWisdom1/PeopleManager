package com.cdp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@Controller
public class IndexController {
    @Value("classpath:init.json")
    private Resource resource;

    /**
     * 跳转到首页
     * @return
     */
    @RequestMapping("/index")
    public String index(){
        return "admin/index";
    }

    /**
     * 解析json数据
     * @param response
     */
    @GetMapping("/menu")
    @ResponseBody
    public void menu(HttpServletResponse response){

        try {
            File file = resource.getFile();
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str;
            StringBuffer stringBuffer = new StringBuffer();
            while ((str = bufferedReader.readLine()) != null){
                stringBuffer.append(str);
            }
            bufferedReader.close();
            fileReader.close();
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().println(stringBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 跳转到first页面
     * @return
     */
    @GetMapping("/first")
    public String first(){
        return "admin/first";
    }

    /**
     * 跳转到部门页面
     * @return
     */
    @GetMapping("/department")
    public String department(){
        return "admin/PM-department";
    }
}
