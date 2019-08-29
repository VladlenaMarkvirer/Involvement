package com.sibur.involvement.server.service;

import com.sibur.involvement.server.entity.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAll();
    Role getByID(long id);
    Role save(Role role);
    void remove(long id);
}
