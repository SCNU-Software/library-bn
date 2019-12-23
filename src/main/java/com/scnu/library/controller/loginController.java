package com.scnu.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * @Author: Fisher
 * @Date: 2019/12/22 22:43
 */

@Controller
public class loginController {

    @RequestMapping("/")
    public void root(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Writer writer = response.getWriter();
        writer.write("This is root page");
    }

    @RequestMapping("/hello")
    public void hello(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Writer writer = response.getWriter();
        writer.write("This is hello page");
    }

    @RequestMapping("/login")
    public void test(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Writer writer = response.getWriter();
        writer.write("This is login page");
    }

}
