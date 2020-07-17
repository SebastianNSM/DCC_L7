package com.cenfotec.mongobasico.service;

import java.util.List;

import com.cenfotec.mongobasico.domain.Journal;

/**
 * JournalService
 */
public interface JournalService {
    public List<Journal> getAllJournals();

    public void saveJournal(Journal journal);

    public List<Journal> findJournalsByTitle(String title);

    public void deleteAllJournals();
}
