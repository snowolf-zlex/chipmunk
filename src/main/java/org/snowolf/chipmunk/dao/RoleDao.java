package org.snowolf.chipmunk.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.snowolf.chipmunk.domain.Role;

@Mapper
public interface RoleDao {

    List<Role> readListByUsernameWithAllEnabledRoles(String username);
}
