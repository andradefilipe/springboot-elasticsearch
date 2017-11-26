package com.andrade.email.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.andrade.email.model.Email;

import java.util.List;

public interface EmailRepository extends ElasticsearchRepository<Email, String> {

	List<Email> findByText(String text);

	List<Email> findBySender(String text);

}