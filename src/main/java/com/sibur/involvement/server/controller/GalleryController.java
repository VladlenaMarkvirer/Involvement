package com.sibur.involvement.server.controller;

import com.sibur.involvement.server.entity.Gallery;
import com.sibur.involvement.server.service.GalleryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GalleryController {
    @Autowired
    private GalleryService galleryService;

    @RequestMapping(value = "/galleries", method = RequestMethod.GET)
    @ResponseBody
    public List<Gallery> getAllGalleries() {
        return galleryService.getAll();
    }

    @RequestMapping(value = "/galleries/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Gallery getGallery(@PathVariable("id") long galleryID) {
        return galleryService.getByID(galleryID);
    }

    @RequestMapping(value = "/galleries", method = RequestMethod.POST)
    @ResponseBody
    public Gallery saveGallery(@RequestBody Gallery gallery) {
        return galleryService.save(gallery);
    }

    @RequestMapping(value = "/galleries/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteGallery(@PathVariable("id") long galleryID) {
        galleryService.remove(galleryID);
    }
}
