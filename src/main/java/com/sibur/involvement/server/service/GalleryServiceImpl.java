package com.sibur.involvement.server.service;

import com.sibur.involvement.server.entity.Gallery;
import com.sibur.involvement.server.repository.GalleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GalleryServiceImpl implements GalleryService{

    @Autowired
    private GalleryRepository galleryRepository;

    @Override
    public List<Gallery> getAll() {
        return galleryRepository.findAll();
    }

    @Override
    public Gallery getByID(long id) {
        return galleryRepository.findById(id).get();
    }

    @Override
    public Gallery save(Gallery gallery) {
        return galleryRepository.saveAndFlush(gallery);
    }

    @Override
    public void remove(long id) {
        galleryRepository.deleteById(id);
    }
}
