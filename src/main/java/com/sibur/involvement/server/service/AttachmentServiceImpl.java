package com.sibur.involvement.server.service;

import com.sibur.involvement.server.entity.Attachment;
import com.sibur.involvement.server.repository.AttachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachmentServiceImpl implements AttachmentService {

    @Autowired
    private AttachmentRepository attachmentRepository;

    @Override
    public List<Attachment> getAll() {
        return attachmentRepository.findAll();
    }

    @Override
    public Attachment getByID(long id) {
        return attachmentRepository.findById(id).get();
    }

    @Override
    public Attachment save(Attachment attachment) {
        return attachmentRepository.saveAndFlush(attachment);
    }

    @Override
    public void remove(long id) {
        attachmentRepository.deleteById(id);
    }
}
