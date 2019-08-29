package com.sibur.involvement.server.controller;

import com.sibur.involvement.server.entity.Photo;
import com.sibur.involvement.server.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PhotoController {
    @Autowired
    private PhotoService photoService;

    @RequestMapping(value = "/photos", method = RequestMethod.GET)
    @ResponseBody
    public List<Photo> getAllPhotos() {
        return photoService.getAll();
    }

    @RequestMapping(value = "/photos/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Photo getPhoto(@PathVariable("id") long photoID) {
        return photoService.getByID(photoID);
    }

    @RequestMapping(value = "/photos", method = RequestMethod.POST)
    @ResponseBody
    public Photo savePhoto(@RequestBody Photo photo) {
        return photoService.save(photo);
    }

    @RequestMapping(value = "/photos/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deletePhoto(@PathVariable("id") long photoID) {
        photoService.remove(photoID);
    }
}
