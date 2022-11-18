package com.example.practice01.user;

import com.example.practice01.user.model.User;
import com.example.practice01.user.model.UserFromDatabase;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
    List<UserFromDatabase> getUsers();

    List<UserFromDatabase> getSearchUser(String firstName, String lastName);
    Integer insertUser(UserFromDatabase userFromDatabase);

    Integer updateUser(UserFromDatabase userFromDatabase);
}
