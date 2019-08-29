package com.sibur.involvement.server.service;

import com.sibur.involvement.server.entity.Package;
import com.sibur.involvement.server.repository.PackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackageServiceImpl implements PackageService {

    @Autowired
    private PackageRepository packageRepository;

    @Override
    public List<Package> getAll() {
        return packageRepository.findAll();
    }

    @Override
    public Package getByID(long id) {
        return packageRepository.findById(id).get();
    }

    @Override
    public Package save(Package _package) {
        return packageRepository.saveAndFlush(_package);
    }

    @Override
    public void remove(long id) {
        packageRepository.deleteById(id);
    }
}
