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
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
        model.addAttribute("boardVOList", boardService.getBoardList(new BoardVO()));
        return "/board/board_list.tile";
    }

    @GetMapping("/add")
    public String boardAddForm(Model model) throws Exception {
        return "/board/board_add.tile";
    }

    @ResponseBody
    @PostMapping("/add")
    public boolean boardAdd(HttpSession session, BoardVO boardVO, MultipartFile[] files) throws Exception {
        UserVO userAuth = (UserVO) session.getAttribute("userAuth");
        if (userAuth == null) {
            return false;
        }
        boardVO.setUserSn(userAuth.getUserSn());
        long boardSn = boardService.addBoard(boardVO);

        if (files != null) {
            for (MultipartFile file : files) {
                FileVO fileVO = new FileVO();
                fileVO.setBoardSn(boardSn);
                fileVO.setFileOrglNm(file.getOriginalFilename());
                fileVO.setFileNm(fileService.generateFileUploader(file));

                fileService.addFile(fileVO);
            }
        }

        return true;
    }

    @GetMapping("/de/{boardSn}")
    public String boardDe(@PathVariable("boardSn") long boardSn, Model model) throws Exception {
        FileVO fileVO = new FileVO();
        BoardVO boardVO = new BoardVO();

        fileVO.setBoardSn(boardSn);
        boardVO.setBoardSn(boardSn);

        model.addAttribute("boardVO", boardService.getBoard(boardVO));
        model.addAttribute("fileVOList", fileService.getFileList(fileVO));

        return "board/board_detail.tile";
    }

    @PostMapping("/de/file")
    public void fileDownload(@RequestParam long fileSn, HttpServletRequest request, HttpServletResponse response) throws Exception {
        FileVO fileVO = new FileVO();
        fileVO.setFileSn(fileSn);

        fileVO = fileService.getFile(fileVO);
        fileService.generateFileDownloader(request, response, fileVO.getFileNm());
    }
}
