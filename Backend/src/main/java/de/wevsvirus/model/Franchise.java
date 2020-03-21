package de.wevsvirus.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Franchise {

  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  private Long id;

  private String name;

  @OneToMany(mappedBy = "franchise")
  private List<Market> markets;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Market> getMarkets() {
    return markets;
  }

  public void setMarkets(List<Market> markets) {
    this.markets = markets;
  }
}
