package cn.edu.zjut.bean;
//import lombok.data;
//@Data
public class UserBean {
    private String username="";
    private String password="";
    private String[] hobby;//兴趣爱好
    private String[] friends;//朋友
    private String carrer;
    private String houseRegister;
    private String remark;
    private Integer page;
    public String getUsername() { return username; }
    public void setUsername(String username) {
        this.username= username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getCarrer() {
        return carrer;
    }

    public String getHouseRegister() {
        return houseRegister;
    }

    public String getRemark() {
        return remark;
    }

    public String[] getFriends() {
        return friends;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public void setFriends(String[] friends) {
        this.friends = friends;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public void setHouseRegister(String houseRegister) {
        this.houseRegister = houseRegister;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }
}
