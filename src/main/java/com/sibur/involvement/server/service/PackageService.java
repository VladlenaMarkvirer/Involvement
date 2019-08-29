package com.sibur.involvement.server.service;

import com.sibur.involvement.server.entity.Package;

import java.util.List;

public interface PackageService {
    List<Package> getAll();
    Package getByID(long id);
    Package save(Package _package);
    void remove(long id);
}
