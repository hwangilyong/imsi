package kr.or.ibuk5do.imsi.board.service.impl;

import kr.or.ibuk5do.imsi.board.vo.BoardVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("boardMapper")
public interface BoardMapper {
    public long addBoard(BoardVO boardVO) throws Exception;
    public BoardVO getBoard(BoardVO boardVO) throws Exception;
    public List<BoardVO> getBoardList(BoardVO boardVO) throws Exception;
}
