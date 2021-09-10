package kr.or.ibuk5do.imsi.board.service;

import kr.or.ibuk5do.imsi.board.vo.BoardVO;

import java.util.List;

public interface BoardService {
    public void addBoard(BoardVO boardVO) throws Exception;
    public BoardVO getBoard(BoardVO boardVO) throws Exception;
    public List<BoardVO> getBoardList(BoardVO boardVO) throws Exception;
}
