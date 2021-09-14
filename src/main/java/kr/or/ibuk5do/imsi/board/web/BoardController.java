package kr.or.ibuk5do.imsi.board.web;

import kr.or.ibuk5do.imsi.board.service.BoardService;
import kr.or.ibuk5do.imsi.board.vo.BoardVO;
import kr.or.ibuk5do.imsi.user.vo.UserVO;
import kr.or.ibuk5do.imsi.util.file.service.FileService;
import kr.or.ibuk5do.imsi.util.file.vo.FileVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {
    private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

    @Resource(name = "boardService")
    private BoardService boardService;

    @Resource(name = "fileService")
    private FileService fileService;

    @GetMapping("/list")
    public String boardList(Model model) throws Exception {
        //model.addAttribute("boardVOList", boardService.getBoardList(null));
        return "/board/board_list.tile";
    }

    @GetMapping("/add")
    public String boardAddForm(Model model) throws Exception {
        return "/board/board_add.tile";
    }

    @PostMapping("/add")
    public String boardAdd(HttpSession session, BoardVO boardVO, MultipartFile[] uploadFile) throws Exception {
        UserVO userAuth = (UserVO)session.getAttribute("userAuth");
        if (userAuth == null) {
            return "redirect:/login";
        }
        boardVO.setUserSn(userAuth.getUserSn());
        long boardSn = boardService.addBoard(boardVO);

        for (MultipartFile file : uploadFile) {
            if (file != null) {
                FileVO fileVO = new FileVO();
                fileVO.setBoardSn(boardSn);
                fileVO.setFileOrglNm(file.getOriginalFilename());
                fileVO.setFileNm(fileService.generateFileUploader(file));

                fileService.addFile(fileVO);
            }
        }

        return "redirect:/board/list";
    }

    @GetMapping("/de/{boardSn}")
    public String boardDe(@PathVariable("boardSn")String boardSn, Model model) throws Exception {

        return "";
    }
}
