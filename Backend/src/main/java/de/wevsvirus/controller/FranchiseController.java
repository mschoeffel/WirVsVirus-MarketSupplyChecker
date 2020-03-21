package de.wevsvirus.controller;

import de.wevsvirus.model.Franchise;
import de.wevsvirus.service.FranchiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/franchise")
public class FranchiseController {

  private FranchiseService franchiseService;

  @Autowired
  public FranchiseController(FranchiseService franchiseService) {
    this.franchiseService = franchiseService;
  }

  @GetMapping()
  public List<Franchise> findAll() {
    return franchiseService.findAll();
  }

  @GetMapping("/{id}")
  public Franchise getFranchiseById(@PathVariable Long id) {
    return franchiseService.findById(id);
  }

  @PostMapping()
  public Franchise createFranchise(@RequestBody Franchise franchise) {
    return franchiseService.createFranchise(franchise);
  }

  @PutMapping("/{id}")
  public Franchise updateFranchise(@RequestBody Franchise franchise, @PathVariable Long id) {
    return franchiseService.updateFranchise(franchise, id);
  }

  @DeleteMapping("/{id}")
  public void deleteFranchise(@PathVariable Long id) {
    franchiseService.deleteFranchise(id);
  }
}
