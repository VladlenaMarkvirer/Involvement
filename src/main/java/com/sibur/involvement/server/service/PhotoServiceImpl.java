package com.sibur.involvement.server.service;

import com.sibur.involvement.server.entity.Photo;
import com.sibur.involvement.server.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoServiceImpl implements PhotoService{

    @Autowired
    private PhotoRepository photoRepository;

    @Override
    public List<Photo> getAll() {
        return photoRepository.findAll();
    }

    @Override
    public Photo getByID(long id) {
        return photoRepository.findById(id).get();
    }

    @Override
    public Photo save(Photo photo) {
        return photoRepository.saveAndFlush(photo);
    }

    @Override
    public void remove(long id) {
        photoRepository.deleteById(id);
    }
}
