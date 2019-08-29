package com.sibur.involvement.server.service;

import com.sibur.involvement.server.entity.Part;

import java.util.List;

public interface PartService {
    List<Part> getAll();
    Part getByID(long id);
    Part save(Part part);
    void remove(long id);
}
