package com.sibur.involvement.server.controller;

import com.sibur.involvement.server.entity.Package;
import com.sibur.involvement.server.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PackageController {
    @Autowired
    private PackageService packageService;

    @RequestMapping(value = "/packages", method = RequestMethod.GET)
    @ResponseBody
    public List<Package> getAllPackages() {
        return packageService.getAll();
    }

    @RequestMapping(value = "/packages/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Package getPackage(@PathVariable("id") long packageID) {
        return packageService.getByID(packageID);
    }

    @RequestMapping(value = "/packages", method = RequestMethod.POST)
    @ResponseBody
    public Package savePackage(@RequestBody Package _package) {
        return packageService.save(_package);
    }

    @RequestMapping(value = "/packages/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deletePackage(@PathVariable("id") long packageID) {
        packageService.remove(packageID);
    }
}
