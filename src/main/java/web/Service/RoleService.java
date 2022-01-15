package web.Service;

import web.model.Role;

import java.util.HashSet;
import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();

    void addRole(Role role);

    Role getRoleById(Long id);

    Role getRoleByRoleName(String name);

    Role getAuthByName(String role);

    HashSet<Role> getSetOfRoles(String[] roleNames);
}
