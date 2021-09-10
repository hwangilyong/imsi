package kr.or.ibuk5do.imsi.util.file.vo;

import kr.or.ibuk5do.imsi.cmm.vo.DefaultVO;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("FileVO")
public class FileVO extends DefaultVO {
    private long fileSn;
    private String fileNm;
    private String fileOrglNm;
    private long fileSize;

    private long boardSn;
}
