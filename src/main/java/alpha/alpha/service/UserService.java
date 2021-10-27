package alpha.alpha.service;

import alpha.alpha.Exception.EmailExistsException;
import alpha.alpha.dto.UserDTO;
import alpha.alpha.mapper.UserMapper;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserService {

    // 왜 private final로 선언하는가?
    private UserMapper userMapper;

    public void signUp(UserDTO user){

       boolean emailExistsResult = isExistsEmail(user.getEmail());

       if(emailExistsResult){
            throw new EmailExistsException("이미 존재하는 이메일입니다.");
       }
       userMapper.insertUser(user);
    }

    public boolean isExistsEmail(String email){
        return userMapper.isExistsEmail(email);
    }
}
