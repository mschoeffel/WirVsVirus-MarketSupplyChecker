package de.wevsvirus.service;

import de.wevsvirus.model.History;
import de.wevsvirus.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class HistoryService {

  private HistoryRepository historyRepository;

  @Autowired
  public HistoryService(HistoryRepository historyRepository) {
    this.historyRepository = historyRepository;
  }

  public List<History> findAll() {
    return historyRepository.findAll();
  }

  public History findById(Long id) {
    return historyRepository.findById(id).orElseThrow(EntityNotFoundException::new);
  }

  @Transactional
  public History createHistory(History history) {
    return historyRepository.save(history);
  }

  @Transactional
  public void deleteById(Long id) {
    historyRepository.deleteById(id);
  }
}
