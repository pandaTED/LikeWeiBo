package cn.panda.action;

import cn.panda.domain.User;
import cn.panda.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by cn.panda on 2016/2/2 0002.
 */
@Controller
public class UserAction {

    private UserService userService;

    @Resource(name = "userServiceId")
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "login.do", method = RequestMethod.POST)
    public String login(String username, String password, HttpSession session) {
        username = username.trim();
        password = password.trim();
        if (!username.equals("") && !password.equals("")) {
            User user = userService.login(username, password);
            if (user != null) {
                session.setAttribute("user", user);
                return "redirect:listWeibo.do";
            } else {
                return "fail";
            }
        } else {
            return "fail";
        }

    }

    @RequestMapping(value = "register.do", method = RequestMethod.POST)
    public String register(User user) {

        String id = UUID.randomUUID().toString();
        Date registerDate = new Date();
        System.out.println("姓名为" + user.getName());
        user.setId(id);
        user.setRegisterDate(registerDate);
        userService.register(user);
        return "success";
    }

    @RequestMapping(value = "findAll.do")
    public String findAll(Model model) {
        List<User> userlist = userService.findAll();
        model.addAttribute("userlist", userlist);
        return "userlist";
    }

    @RequestMapping(value = "delete.do")
    public String deleteUser(String id) {
        userService.delete(id);
        return "redirect:findAll.do";
    }

    @RequestMapping(value = "findById.do")
    public String findById(Model model, String id) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "detail";
    }

    @RequestMapping(value = "update.do")
    public String update(User user) {
        userService.update(user);
        return "redirect:findAll.do";
    }
}
