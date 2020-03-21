package de.wevsvirus.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "ID")
  private Integer productCategoryId;

  @Size(max = 50)
  private String name;


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

  public Integer getProductCategoryId() {
    return productCategoryId;
  }

  public void setProductCategoryId(Integer productCategoryId) {
    this.productCategoryId = productCategoryId;
  }
}
