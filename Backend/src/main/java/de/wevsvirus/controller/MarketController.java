package de.wevsvirus.controller;

import de.wevsvirus.model.Market;
import de.wevsvirus.model.Product;
import de.wevsvirus.model.SearchObject;
import de.wevsvirus.model.SearchResultObject;
import de.wevsvirus.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/market")
public class MarketController {

    private MarketService marketService;

    @Autowired
    public MarketController(MarketService marketService){
        this.marketService = marketService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Market getMarketById(@PathVariable(name = "id") Long id){
        try{
            return marketService.getMarketById(id);
        } catch(EntityNotFoundException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "market.notfound");
        }
    }

    @RequestMapping(value = "search/{data}", method = RequestMethod.GET)
    public List<Market> getMarketByOrtOrPlz(@PathVariable(name = "data") String data){
        return marketService.getAllMarketsByOrtOrPlz(data);
    }

    @PostMapping("/supply")
    public List<SearchResultObject> findSupply(@RequestBody SearchObject search) {
        return marketService.getSupply(search);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Market> getAllMarkets(){
        return marketService.getAllMarkets();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Market createMarket(@RequestBody Market market){
        return marketService.createMarket(market);
    }

    @PostMapping("/multiple")
    public List<Market> createMultipleMarket(@RequestBody List<Market> markets) {
        List<Market> result = new ArrayList<>();
        for(Market market : markets) {
            result.add(marketService.createMarket(market));
        }
        return result;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Market updateMarket(@PathVariable(name = "id") Long id, @RequestBody Market market){
        return marketService.updateMarket(id, market);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteMarket(@PathVariable(name = "id") Long id){
        marketService.deleteMarketById(id);
    }




}
