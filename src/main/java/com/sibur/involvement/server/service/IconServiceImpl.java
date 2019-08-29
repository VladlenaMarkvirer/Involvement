package com.sibur.involvement.server.service;

import com.sibur.involvement.server.entity.Icon;
import com.sibur.involvement.server.repository.IconRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IconServiceImpl implements IconService{

    @Autowired
    private IconRepository iconRepository;

    @Override
    public List<Icon> getAll() {
        return iconRepository.findAll();
    }

    @Override
    public Icon getByID(long id) {
        return iconRepository.findById(id).get();
    }

    @Override
    public Icon save(Icon icon) {
        return iconRepository.saveAndFlush(icon);
    }

    @Override
    public void remove(long id) {
        iconRepository.deleteById(id);
    }
}
