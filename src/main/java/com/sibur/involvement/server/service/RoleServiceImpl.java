package com.sibur.involvement.server.service;

import com.sibur.involvement.server.entity.Role;
import com.sibur.involvement.server.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> getAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role getByID(long id) {
        return roleRepository.findById(id).get();
    }

    @Override
    public Role save(Role role) {
        return roleRepository.saveAndFlush(role);
    }

    @Override
    public void remove(long id) {
        roleRepository.deleteById(id);
    }
}
