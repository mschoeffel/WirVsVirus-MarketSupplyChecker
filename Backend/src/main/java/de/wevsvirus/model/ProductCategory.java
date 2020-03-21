package de.wevsvirus.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity(name = "productcategory")
@Table(name = "productcategory")
public class ProductCategory {

    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @Column(name = "Name")
    @Size(max = 255)
    private String name;

    public ProductCategory() {
    }

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
}
