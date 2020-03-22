package de.wevsvirus.controller;

import de.wevsvirus.model.Quantity;
import de.wevsvirus.service.QuantityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("/api/quantity")
public class QuantityController {

  private QuantityService quantityService;

  @Autowired
  public QuantityController(QuantityService quantityService) {
    this.quantityService = quantityService;
  }

  @GetMapping()
  public List<Quantity> findAll() {
    return quantityService.findAll();
  }

  @GetMapping("/{id}")
  public Quantity findById(@PathVariable Long id) {
    return quantityService.findById(id);
  }

  @PostMapping()
  public Quantity createQuantity(@RequestBody Quantity quantity) {
    return quantityService.createQuantity(quantity);
  }

  @PostMapping("/multiple")
  public List<Quantity> createMultipleQuantity(@RequestBody List<Quantity> quantities) {
    List<Quantity> result = new ArrayList<>();
    for(Quantity quantity : quantities) {
      result.add(quantityService.createQuantity(quantity));
    }
    return result;
  }

  @PutMapping("/{id}")
  public Quantity updateQuantity(@RequestBody Quantity quantity, @PathVariable Long id) {
    return quantityService.updateQuantity(quantity, id);
  }

  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable Long id) {
    quantityService.deleteById(id);
  }
}
