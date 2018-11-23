package org.snowolf.chipmunk.dao;


import org.apache.ibatis.annotations.Mapper;
import org.snowolf.chipmunk.domain.User;

@Mapper
public interface UserDao {
    public User readByUsername(String username);

    public User read(long id);

    public void delete(long id);

    public void create(User user);

    public void updateStatus(User user);

    public void updatePassword(User user);
}
