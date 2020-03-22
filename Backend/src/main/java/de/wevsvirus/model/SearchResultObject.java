package de.wevsvirus.model;

import java.util.ArrayList;
import java.util.List;

public class SearchResultObject {
    private Market market;
    private List<Supply> supplies;

    public SearchResultObject() {
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public List<Supply> getSupplies() {
        return supplies;
    }

    public void setSupplies(List<Supply> supplies) {
        this.supplies = supplies;
    }

    public void addSupply(Supply supply){
        if(supplies == null){
            supplies = new ArrayList<>();
        }
        supplies.add(supply);
    }
}
