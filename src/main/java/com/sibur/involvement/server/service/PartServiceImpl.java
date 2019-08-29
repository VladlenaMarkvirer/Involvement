package com.sibur.involvement.server.service;

import com.sibur.involvement.server.entity.Part;
import com.sibur.involvement.server.repository.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartServiceImpl implements PartService {

    @Autowired
    private PartRepository partRepository;

    @Override
    public List<Part> getAll() {
        return partRepository.findAll();
    }

    @Override
    public Part getByID(long id) {
        return partRepository.findById(id).get();
    }

    @Override
    public Part save(Part part) {
        return partRepository.saveAndFlush(part);
    }

    @Override
    public void remove(long id) {
        partRepository.deleteById(id);
    }
}
