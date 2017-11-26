package com.andrade.email.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.andrade.email.model.Email;

public interface EmailService {

    Email save(Email email);

    void delete(Email email);

    Email findOne(String id);

    Iterable<Email> findAll();

    List<Email> findByText(String title);

    List<Email> findBySender(String title);

}