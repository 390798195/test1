package com.bjpowernode.servlet;

import com.bjpowernode.domain.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("servlet01 Running....");
        response.setContentType("type=text/html;charset=utf-8");
        //{"id":"?","name":"?","email":"?","age":"?"}
        //{"s1":{"id":"?","name":"?","email":"?","age":"?"},"s2":{"id":"?","name":"?","email":"?","age":"?"}}
        Student s1=new Student(1001,"zhangsan","zhangsan@1223.com",21);
        Student s2=new Student(1002,"lisi","lisi@123.com",22);
        String s="{\"s1\":{\"id\":\""+s1.getId()
                +"\",\"name\":\""+s1.getName()
                +"\",\"email\":\""+s1.getEmail()
                +"\",\"age\":\""+s1.getAge()
                +"\"},\"s2\":{\"id\":\""+s2.getId()
                +"\",\"name\":\""+s2.getName()
                +"\",\"email\":\""+s2.getEmail()
                +"\",\"age\":\""+s2.getAge()+"\"}}";
        PrintWriter pw=response.getWriter();
        pw.println(s);
        pw.flush();
        pw.close();
    }
}
