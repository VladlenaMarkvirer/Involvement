package com.sibur.involvement.server.repository;

import com.sibur.involvement.server.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}
