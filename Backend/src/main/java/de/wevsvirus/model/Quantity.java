package de.wevsvirus.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Quantity {

  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  private Long id;

  @Size(max = 50)
  private String name;

  @JsonIgnore
  @OneToMany(mappedBy = "quantity")
  private List<History> histories;

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

  public List<History> getHistories() {
    return histories;
  }

  public void setHistories(List<History> histories) {
    this.histories = histories;
  }
}
