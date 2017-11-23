package com.andrade.email.service;

import com.andrade.email.model.Email;
import com.andrade.email.repository.EmailRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailServiceImpl implements EmailService {

    private EmailRepository emailRepository;

    @Autowired
    public void setEmailRepository(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    public Email save(Email email) {
        return emailRepository.save(email);
    }

    public void delete(Email email) {
        emailRepository.delete(email);
    }

    public Email findOne(String id) {
        return emailRepository.findOne(id);
    }

    public Iterable<Email> findAll() {
        return emailRepository.findAll();
    }

	public List<Email> findByText(String text) {
		return emailRepository.findByText(text);
	}

}