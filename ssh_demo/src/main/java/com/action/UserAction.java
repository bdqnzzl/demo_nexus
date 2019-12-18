package com.action;

import com.bdqn.utils.ArrayUtil;
import com.entity.User;
import org.omg.PortableInterceptor.SUCCESSFUL;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller("userAction")
@Scope("prototype")
public class UserAction {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String login() {
        System.out.println(user.getUserName());
        return "success";
    }

}
