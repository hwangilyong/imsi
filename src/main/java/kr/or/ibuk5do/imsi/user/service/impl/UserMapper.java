package kr.or.ibuk5do.imsi.user.service.impl;

import kr.or.ibuk5do.imsi.user.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("userMapper")
public interface UserMapper {
    public void addUser(UserVO userVO) throws Exception;
    public UserVO getUser(UserVO userVO) throws Exception;
}
