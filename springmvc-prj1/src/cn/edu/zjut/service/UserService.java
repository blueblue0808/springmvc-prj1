package cn.edu.zjut.service;
import cn.edu.zjut.bean.UserBean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("userServ")
public class UserService implements IUserService{
    public boolean login(UserBean loginUser) {
        if (loginUser.getUsername().equals(loginUser.getPassword())){
            return true;
        }
        return false;
    }
    //使用静态集合变量users模拟数据库
    private static ArrayList<UserBean> users=new ArrayList<UserBean>();
    @Override
    public boolean addUser(UserBean u) {
        if(!"IT民工".equals(u.getCarrer())){//不允许添加IT民工
            users.add(u);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<UserBean> getUsers() {
        return users;
    }
}
