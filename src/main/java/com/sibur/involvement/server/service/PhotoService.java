package com.sibur.involvement.server.service;

import com.sibur.involvement.server.entity.Photo;

import java.util.List;

public interface PhotoService {
    List<Photo> getAll();
    Photo getByID(long id);
    Photo save(Photo photo);
    void remove(long id);
}
