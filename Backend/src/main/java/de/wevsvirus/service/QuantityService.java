package de.wevsvirus.service;

import de.wevsvirus.model.Quantity;
import de.wevsvirus.repository.QuantityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class QuantityService {

  private QuantityRepository quantityRepository;

  @Autowired
  public QuantityService(QuantityRepository quantityRepository) {
    this.quantityRepository = quantityRepository;
  }

  public List<Quantity> findAll() {
    return this.quantityRepository.findAll();
  }

  public Quantity findById(Long id) {
    return this.quantityRepository.findById(id).orElseThrow(EntityNotFoundException::new);
  }

  @Transactional
  public Quantity createQuantity(Quantity quantity) {
    return this.quantityRepository.save(quantity);
  }

  @Transactional
  public Quantity updateQuantity(Quantity newQuantity, Long id) {
    return quantityRepository.findById(id)
            .map(quantity -> {
              quantity.setName(newQuantity.getName());
              return quantityRepository.save(quantity);
            }).orElseGet(() -> {
              newQuantity.setId(id);
              return quantityRepository.save(newQuantity);
            });
  }

  @Transactional
  public void deleteById(Long id) {
    quantityRepository.deleteById(id);
  }
}
