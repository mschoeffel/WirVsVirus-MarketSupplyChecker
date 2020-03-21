package de.wevsvirus.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class History {

  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "marketId", referencedColumnName = "id")
  private Market market;

  @ManyToOne
  @JoinColumn(name = "productId", referencedColumnName = "id")
  private Product product;

  @ManyToOne
  @JoinColumn(name = "quantityId", referencedColumnName = "id")
  private Quantity quantity;

  @CreationTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  private Date timestamp;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Market getMarket() {
    return market;
  }

  public void setMarket(Market market) {
    this.market = market;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Quantity getQuantity() {
    return quantity;
  }

  public void setQuantity(Quantity quantity) {
    this.quantity = quantity;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }
}
