package com.bjpowernode.servlet;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class MyServlet02 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("接收到了浏览器请求。");
        String path=req.getServletPath();
        if("/myServlet02".equals(path)){
            //执行查询操作
            select(req,resp);
        }else  if ("/myServlet03".equals(path)){
            //执行添加操作
            insert(req,resp);
        }else  if ("/myServlet04".equals(path)){
            //执行修改操作
            update(req,resp);
        }else  if ("/myServlet05".equals(path)){
            //执行删除操作
            delete(req,resp);
        }
    }

    private void delete(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("执行了学习信息删除操作");
    }

    private void update(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("执行了学习信息修改操作");
    }

    private void insert(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("执行了学习信息添加操作");
    }

    private void select(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("执行了学习信息查询操作");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
