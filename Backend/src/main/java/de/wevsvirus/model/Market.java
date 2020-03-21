package de.wevsvirus.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity(name = "market")
@Table(name = "market")
public class Market {

    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @Column(name = "str_hno")
    @Size(max = 150)
    private String street_homenr;

    @Column(name = "postcode")
    @Size(max = 5)
    private String postcode;

    @Column(name = "city")
    @Size(max = 150)
    private String city;

    @ManyToOne
    @JoinColumn(name = "franchiseId", referencedColumnName = "id")
    private Franchise franchise;

    @OneToMany(mappedBy = "market")
    private List<History> histories;

    public Market() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet_homenr() {
        return street_homenr;
    }

    public void setStreet_homenr(String street_homenr) {
        this.street_homenr = street_homenr;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Franchise getFranchise() {
        return franchise;
    }

    public void setFranchise(Franchise franchise) {
        this.franchise = franchise;
    }

    public List<History> getHistories() {
        return histories;
    }

    public void setHistories(List<History> histories) {
        this.histories = histories;
    }
}
