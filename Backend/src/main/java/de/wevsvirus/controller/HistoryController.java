package de.wevsvirus.controller;

import de.wevsvirus.model.History;
import de.wevsvirus.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/history")
public class HistoryController {

  private HistoryService historyService;

  @Autowired
  public HistoryController(HistoryService historyService) {
    this.historyService = historyService;
  }

  @GetMapping()
  public List<History> findAll() {
    return historyService.findAll();
  }

  @GetMapping("/{id}")
  public History findById(@PathVariable Long id) {
    return historyService.findById(id);
  }

  @PostMapping()
  public History createHistory(@RequestBody History history) {
    return historyService.createHistory(history);
  }

  @PostMapping("/multiple")
  public List<History> createMultipleHistory(@RequestBody List<History> histories) {
    List<History> result = new ArrayList<>();
    for(History history : histories) {
      result.add(historyService.createHistory(history));
    }
    return result;
  }

  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable Long id) {
    historyService.deleteById(id);
  }
}
