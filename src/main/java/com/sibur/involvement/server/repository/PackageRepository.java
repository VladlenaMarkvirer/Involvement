package com.sibur.involvement.server.repository;

import com.sibur.involvement.server.entity.Package;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepository extends JpaRepository<Package, Long> {
}
