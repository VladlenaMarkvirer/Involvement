package com.sibur.involvement.server.service;

import com.sibur.involvement.server.entity.Gallery;

import java.util.List;

public interface GalleryService {
    List<Gallery> getAll();
    Gallery getByID(long id);
    Gallery save(Gallery gallery);
    void remove(long id);
}
