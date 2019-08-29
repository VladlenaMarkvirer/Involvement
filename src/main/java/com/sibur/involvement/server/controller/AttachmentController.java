package com.sibur.involvement.server.controller;

import com.sibur.involvement.server.entity.Attachment;
import com.sibur.involvement.server.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AttachmentController {
    @Autowired
    private AttachmentService attachmentService;

    @RequestMapping(value = "/attachments", method = RequestMethod.GET)
    @ResponseBody
    public List<Attachment> getAllAttachments() {
        return attachmentService.getAll();
    }

    @RequestMapping(value = "/attachments/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Attachment getAttachment(@PathVariable("id") long attachmentID) {
        return attachmentService.getByID(attachmentID);
    }

    @RequestMapping(value = "/attachments", method = RequestMethod.POST)
    @ResponseBody
    public Attachment saveAttachment(@RequestBody Attachment attachment) {
        return attachmentService.save(attachment);
    }

    @RequestMapping(value = "/attachments/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteAttachment(@PathVariable("id") long attachmentID) {
        attachmentService.remove(attachmentID);
    }
}
