package kr.or.ibuk5do.imsi.board.vo;

import kr.or.ibuk5do.imsi.cmm.vo.DefaultVO;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("BoardVO")
public class BoardVO extends DefaultVO {
    public long boardSn;

    public String boardTitle;
    public String boardContnet;
    public String boardClCode;
    public String boardClCn;
}
