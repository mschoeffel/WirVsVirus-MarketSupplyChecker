package de.wevsvirus.model;

import java.util.List;

public class SearchObject {

    private String cityOrPostcode;
    private List<String> products;

    public SearchObject() {
    }

    public String getCityOrPostcode() {
        return cityOrPostcode;
    }

    public void setCityOrPostcode(String cityOrPostcode) {
        this.cityOrPostcode = cityOrPostcode;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }
}
