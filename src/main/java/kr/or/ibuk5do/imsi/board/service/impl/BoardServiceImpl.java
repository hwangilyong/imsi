package kr.or.ibuk5do.imsi.board.service.impl;

import kr.or.ibuk5do.imsi.board.service.BoardService;
import kr.or.ibuk5do.imsi.board.vo.BoardVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
    @Resource(name = "boardMapper")
    private BoardMapper boardMapper;

    @Override
    public String addBoard(BoardVO boardVO) throws Exception {
        return boardMapper.addBoard(boardVO);
    }

    @Override
    public BoardVO getBoard(BoardVO boardVO) throws Exception {
        return boardMapper.getBoard(boardVO);
    }

    @Override
    public List<BoardVO> getBoardList(BoardVO boardVO) throws Exception {
        return boardMapper.getBoardList(boardVO);
    }
}
