package com.cenfotec.mongobasico.repository;

import java.util.List;

import com.cenfotec.mongobasico.domain.Journal;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * JournalRepository
 */
public interface JournalRepository extends MongoRepository<Journal, String> {
    public List<Journal> findByTitleLike(String word);
}
