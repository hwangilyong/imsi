package kr.or.ibuk5do.imsi.board.web;

import kr.or.ibuk5do.imsi.board.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/sample")
public class BoardController {
    @Resource(name = "boardService")
    private BoardService boardService;

    @GetMapping("/list")
    public String boardList(Model model) throws Exception {

        return "";
    }

    @GetMapping("/add")
    public String boardAddForm(Model model) throws Exception {
        return "";
    }

    @PostMapping("/add")
    public String boardAdd() throws Exception {
        return "";
    }

    @GetMapping("/de/{boardSn}")
    public String boardDe(@PathVariable("boardSn")String boardSn, Model model) throws Exception {

        return "";
    }

}
