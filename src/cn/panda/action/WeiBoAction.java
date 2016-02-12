package cn.panda.action;

import cn.panda.domain.User;
import cn.panda.domain.WeiBo;
import cn.panda.service.UserService;
import cn.panda.service.WeiBoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by panda on 16-2-12
 */


@Controller
@SessionAttributes("user")
public class WeiBoAction {

    private WeiBoService weiBoService;
    private UserService userService;

    @Resource(name = "weiBoServiceId")
    public void setWeiBoService(WeiBoService weiBoService) {
        this.weiBoService = weiBoService;
    }

    @Resource(name = "userServiceId")
    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping(value = "FaWeiBo.do")
    public String addWeiBo(String text, User user) {
        //Test
        System.out.println("微博内容为：" + text);

        //新建空weiBo
        WeiBo weiBo = new WeiBo();

        //生成id和发表时间
        String weiboId = UUID.randomUUID().toString();
        Date doDate = new Date();
        //获取User
        // User user = (User) session.getAttribute("user");

        //Test
        System.out.println("用户为：" + user.getName());

        //加入发表时间/id/内容/发表人等信息
        weiBo.setDoDate(doDate);
        weiBo.setId(weiboId);
        weiBo.setText(text);
        weiBo.setUserId(user.getId());
        weiBo.setUserName(user.getName());

        System.out.println("打印微博实体：" + weiBo);
        System.out.println("打印微博内容：" + weiBo.getId() + "//" + weiBo.getText() + "//" + weiBo.getDoDate() + "//" + weiBo.getUserId());
        //service处理
        //Test
        System.out.println("验证微博内容：" + weiBo.getText());

        weiBoService.addWeiBo(weiBo);

        return "redirect:listWeibo.do";

    }

    @RequestMapping(value = "listWeibo.do")
    public String listWeiBo(Model model, User user) {
        //查询自己的和关注的人的微博
        List<WeiBo> weiBoList = weiBoService.findByUser(user);
        //查询用户列表
        List<User> userList = userService.findAll();
        //Test
        //System.out.println("验证dao里查询出的结果："+weiBoList.size());

        model.addAttribute("weiboList", weiBoList);
        model.addAttribute("userList", userList);

        //Test
        System.out.println("listWeiBo执行了！");
        return "weiboList";
    }

    @RequestMapping(value = "delWeiBo")
    public String delWeiBo(String id) {
        System.out.println("id===>" + id);
        weiBoService.delWeiBo(id);

        return "redirect:listWeibo.do";
    }
}
