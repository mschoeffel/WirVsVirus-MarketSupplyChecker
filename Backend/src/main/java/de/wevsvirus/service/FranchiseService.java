package de.wevsvirus.service;

import de.wevsvirus.model.Franchise;
import de.wevsvirus.repository.FranchiseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class FranchiseService {

  private FranchiseRepository franchiseRepository;

  @Autowired
  public FranchiseService(FranchiseRepository franchiseRepository) {
    this.franchiseRepository = franchiseRepository;
  }

  public List<Franchise> findAll() {
    return franchiseRepository.findAll();
  }

  public Franchise findById(Long id) {
    return franchiseRepository.findById(id).orElseThrow(EntityNotFoundException::new);
  }

  @Transactional
  public Franchise createFranchise(Franchise franchise) {
    return franchiseRepository.save(franchise);
  }

  @Transactional
  public Franchise updateFranchise(Franchise newFranchise, Long id) {
    return franchiseRepository.findById(id)
            .map(franchise -> {
              franchise.setName(newFranchise.getName());
              return franchiseRepository.save(franchise);
            }).orElseGet(() -> {
              newFranchise.setId(id);
              return franchiseRepository.save(newFranchise);
            });
  }

  @Transactional
  public void deleteFranchise(@PathVariable Long id) {
    franchiseRepository.deleteById(id);
  }
}
