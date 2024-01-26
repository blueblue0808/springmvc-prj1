//package cn.edu.zjut.controller;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import java.util.HashMap;
//import java.util.List;
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import cn.edu.zjut.bean.UserBean;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;
//import cn.edu.zjut.service.IUserService;
//
//import java.lang.annotation.Annotation;
////import org.springframework.stereotype.Controller;
//import org.springframework.beans.factory.annotation.Autowired;
//@org.springframework.stereotype.Controller
//@RequestMapping("/user")
//public class UserController{
////    public class UserController implements Controller{
//    //得到一个用来记录日志的对象，这样在打印信息的时候能够标记打印的是哪个类的信息
//    private static final Log logger=LogFactory.getLog(UserController.class);
//    @Autowired
//    @Qualifier("userServ")
//    private IUserService userServ;
//    //第三题
//    @RequestMapping(value = "/input")
//    public String inputUser(Model model){
//        HashMap<String, String> hobbys=new HashMap<String,String>();
//        hobbys.put("篮球","篮球");
//        hobbys.put("乒乓球","乒乓球");
//        hobbys.put("电玩","电玩");
//        hobbys.put("游泳","游泳");
//        //如果model中没有user属性，userAdd.jsp会抛出异常，因为表单标签无法找到modelAttribute属性制定的form backing object
//        model.addAttribute("user",new UserBean());
//        model.addAttribute("hobbys",hobbys);
//        model.addAttribute("carrers",new String[] {"教师","学生","coding搬运工","IT民工","其他"});
//        model.addAttribute("houseRegisters",new String[] {"北京","上海","广州","深圳","其他"});
//        return "userAdd";
//    }
//    @RequestMapping(value = "/save")
//    public String addUser(@ModelAttribute UserBean user,Model model){
//        if(userServ.addUser(user)){
//            logger.info("成功");
//            return "redirect:/user/list";
//        }else {
//            logger.info("失败");
//            HashMap<String,String> hobbys=new HashMap<String,String>();
//            hobbys.put("篮球","篮球");
//            hobbys.put("乒乓球","乒乓球");
//            hobbys.put("电玩","电玩");
//            hobbys.put("游泳","游泳");
//            //这里不需要model.addAttribute("user",new UserBean())，因为@ModelAttribute指定form backing object
//            model.addAttribute("user",user);
//            model.addAttribute("hobbys",hobbys);
//            model.addAttribute("carrers",new String[] {"教师","学生","coding搬运工","IT民工","其他"});
//            model.addAttribute("houseRegisters",new String[] {"北京","上海","广州","深圳","其他"});
//            return "userAdd";
//        }
//    }
//    @RequestMapping(value = "/list")
//    public String listUsers(Model model){
//        List<UserBean> users=userServ.getUsers();
//        model.addAttribute("users",users);
//        return "userList";
//    }
//
//    //第二题
////    public void setUserServ(IUserService userServ) {
////        this.userServ=userServ;}
////    @RequestMapping("/login")
////    public String login(UserBean user, Model model) {
////        if (userServ.login(user)) {
////            model.addAttribute("uname", user.getUsername());
////            return "loginSuccess";
////        }
////        else return "login";
////    }
////    @RequestMapping("/login")
////    //暴露为模型数据
////    public String login( @ModelAttribute("user") UserBean user) {
////        if (userServ.login(user)) {
////            //model.addAttribute("user", user);
////            return "loginSuccess";
////        }
////        else return "login";
////    }
////    @RequestMapping("/login")
////    public String login( String username, String password, Model model) {
////        if (username.equals(password)) {
////            model.addAttribute("uname", username);
////            return "loginSuccess";
////        }
////        else return "login";
////    }
////    @RequestMapping("/login")
////    public String login( @RequestParam String username,
////                         @RequestParam String password, Model model) {
////        if (username.equals(password)) {
////            model.addAttribute("uname", username);
////            return "loginSuccess";
////        }
////        else return "login";
////    }
////    @RequestMapping("/login")
////    public String login( HttpServletRequest req, Model model) {
////        String username=req.getParameter("username");
////        String password=req.getParameter("password");
////        if (username.equals(password)) {
////            model.addAttribute("uname", username);
////            return "loginSuccess";
////        }
////        else return "login";
////    }
//    @RequestMapping(value="/login/{uname}/{upass}",
//            method= RequestMethod.GET)
//    public String login( @PathVariable String uname,
//                         @PathVariable String upass, Model model) {
//        if (uname.equals(upass)) {
//            model.addAttribute("uname", uname);
//            return "loginSuccess";
//        }
//        else return "login";
//    }
////    public ModelAndView handleRequest(HttpServletRequest arg0,
////                                      HttpServletResponse arg1) throws Exception {
//////        return new ModelAndView("/loginSuccess.jsp");
////        return new ModelAndView("loginSuccess");
////    }
//}