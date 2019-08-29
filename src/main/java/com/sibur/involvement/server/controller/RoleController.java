package com.sibur.involvement.server.controller;

import com.sibur.involvement.server.entity.Role;
import com.sibur.involvement.server.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/roles", method = RequestMethod.GET)
    @ResponseBody
    public List<Role> getAllRoles() {
        return roleService.getAll();
    }

    @RequestMapping(value = "/roles/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Role getRole(@PathVariable("id") long roleID) {
        return roleService.getByID(roleID);
    }

    @RequestMapping(value = "/roles", method = RequestMethod.POST)
    @ResponseBody
    public Role saveRole(@RequestBody Role role) {
        return roleService.save(role);
    }

    @RequestMapping(value = "/roles/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteRole(@PathVariable("id") long roleID) {
        roleService.remove(roleID);
    }
}
