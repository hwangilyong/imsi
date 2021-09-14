package kr.or.ibuk5do.imsi.user.service;

import kr.or.ibuk5do.imsi.user.vo.UserVO;

public interface UserService {
    public UserVO login(UserVO userVO) throws Exception;
    public void addUser(UserVO userVO) throws Exception;
    public UserVO getUser(UserVO userVO) throws Exception;
}
