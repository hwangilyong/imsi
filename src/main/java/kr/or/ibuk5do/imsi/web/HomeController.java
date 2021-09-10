package kr.or.ibuk5do.imsi.web;

import kr.or.ibuk5do.imsi.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class HomeController {
    @Resource(name = "userService")
    private UserService userService;

    @GetMapping("/")
    public String home() throws Exception {
        return "/home";
    }

    @GetMapping("/join")
    public String joinForm() throws Exception {
        return "/user/user_join";
    }

    @PostMapping("/join")
    public String join() throws Exception {
        return "redirect:/home";
    }
}
