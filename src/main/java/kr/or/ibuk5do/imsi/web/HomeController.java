package kr.or.ibuk5do.imsi.web;

import kr.or.ibuk5do.imsi.user.service.UserService;
import kr.or.ibuk5do.imsi.user.vo.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    @Resource(name = "userService")
    private UserService userService;

    @GetMapping("/")
    public String home() throws Exception {
        return "/home.tile";
    }

    @GetMapping("/join")
    public String joinForm() throws Exception {
        return "/user/join.tile";
    }

    @PostMapping("/join")
    public String join(UserVO userVO) throws Exception {
        userService.addUser(userVO);
        return "redirect:/";
    }

    @GetMapping("/login")
    public String loginForm() throws Exception {
        return "/user/login.tile";
    }

    @PostMapping("/login")
    public String login(HttpSession session, UserVO userVO) throws Exception {
        UserVO userAuth = userService.getUser(userVO);
        if (userAuth == null) {
            return "forward:/login";
        }
        session.setAttribute("userAuth", userAuth);
        session.setMaxInactiveInterval(500);

        return "redirect:/";
    }
}
