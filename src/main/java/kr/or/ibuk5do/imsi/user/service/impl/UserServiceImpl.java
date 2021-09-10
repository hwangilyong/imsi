package kr.or.ibuk5do.imsi.user.service.impl;

import kr.or.ibuk5do.imsi.user.service.UserService;
import kr.or.ibuk5do.imsi.user.vo.UserVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name = "userMapper")
    private UserMapper userMapper;
    @Override
    public void addUser(UserVO userVO) throws Exception {
        userMapper.addUser(userVO);
    }

    @Override
    public UserVO getUser(UserVO userVO) throws Exception {
        return userMapper.getUser(userVO);
    }
}
