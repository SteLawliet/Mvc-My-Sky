package sky.mapper;

import java.util.List;

import sky.pojo.User;

/**
 * Created by Stelawliet on 18/3/24.
 */
public interface UserMapper {
    User idFindUser(Integer integer);
    List<User>  FindUser();
    List<User>  FindUserLike(String s);


}
