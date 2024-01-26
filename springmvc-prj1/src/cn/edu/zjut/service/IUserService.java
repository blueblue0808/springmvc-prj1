package cn.edu.zjut.service;
import java.util.ArrayList;
import cn.edu.zjut.bean.UserBean;

public interface IUserService {
    public boolean login(UserBean loginUser);
    public boolean addUser(UserBean u);
    public ArrayList<UserBean> getUsers();
}
