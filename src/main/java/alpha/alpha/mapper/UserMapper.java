package alpha.alpha.mapper;

import alpha.alpha.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    boolean isExistsEmail(String email);

    void insertUser(UserDTO user);


}
