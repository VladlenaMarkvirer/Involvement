package com.sibur.involvement.server.controller;

import com.sibur.involvement.server.entity.Part;
import com.sibur.involvement.server.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PartController {
    @Autowired
    private PartService partService;

    @RequestMapping(value = "/parts", method = RequestMethod.GET)
    @ResponseBody
    public List<Part> getAllParts() {
        return partService.getAll();
    }

    @RequestMapping(value = "/parts/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Part getPart(@PathVariable("id") long partID) {
        return partService.getByID(partID);
    }

    @RequestMapping(value = "/parts", method = RequestMethod.POST)
    @ResponseBody
    public Part savePart(@RequestBody Part part) {
        return partService.save(part);
    }

    @RequestMapping(value = "/parts/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deletePart(@PathVariable("id") long partID) {
        partService.remove(partID);
    }
}
