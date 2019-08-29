package com.sibur.involvement.server.service;

import com.sibur.involvement.server.entity.Attachment;

import java.util.List;

public interface AttachmentService {
    List<Attachment> getAll();
    Attachment getByID(long id);
    Attachment save(Attachment entity);
    void remove(long id);
}
