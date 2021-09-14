package kr.or.ibuk5do.imsi.cmm.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DefaultVO {
    private String useAt;

    private long userSn;
    private String updtId;
    private Date registDt;
    private Date updtDt;
}
