package cn.edu.zjut.controller;
import cn.edu.zjut.bean.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class TestController {
//    接收页面请求的JSON数据，并返回JSON格式的结果
    @RequestMapping("/testJson")
    @ResponseBody
    public UserBean testJson(@RequestBody UserBean user){
        //打印接收的JSON格式数据
        System.out.println("username="+user.getUsername()+",password="+user.getPassword()+",page="+user.getPage());
        //返回JSON格式的响应
        return user;
    }
}
