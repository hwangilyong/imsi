package kr.or.ibuk5do.imsi.user.vo;


import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Getter
@Setter
@Alias("UserVO")
public class UserVO{
    private long userSn;
    private String userId;
    private String userPassword;
    private String userDeptCode;
    private String auth;
    private String useAt;
    private Date registDt;
    private Date updtDt;
}
