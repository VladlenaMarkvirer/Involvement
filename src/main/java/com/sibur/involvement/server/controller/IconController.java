package com.sibur.involvement.server.controller;

import com.sibur.involvement.server.entity.Icon;
import com.sibur.involvement.server.service.IconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IconController {
    @Autowired
    private IconService iconService;

    @RequestMapping(value = "/icons", method = RequestMethod.GET)
    @ResponseBody
    public List<Icon> getAllIcons() {
        return iconService.getAll();
    }

    @RequestMapping(value = "/icons/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Icon getIcon(@PathVariable("id") long iconID) {
        return iconService.getByID(iconID);
    }

    @RequestMapping(value = "/icons", method = RequestMethod.POST)
    @ResponseBody
    public Icon saveIcon(@RequestBody Icon icon) {
        return iconService.save(icon);
    }

    @RequestMapping(value = "/icons/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteIcon(@PathVariable("id") long iconID) {
        iconService.remove(iconID);
    }
}
