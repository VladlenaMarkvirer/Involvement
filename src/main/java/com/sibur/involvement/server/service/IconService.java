package com.sibur.involvement.server.service;

import com.sibur.involvement.server.entity.Icon;

import java.util.List;

public interface IconService {
    List<Icon> getAll();
    Icon getByID(long id);
    Icon save(Icon icon);
    void remove(long id);
}
