package de.wevsvirus.service;

import de.wevsvirus.model.*;
import de.wevsvirus.repository.MarketRepository;
import jdk.vm.ci.code.site.Mark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class MarketService {

    private MarketRepository marketRepository;
    private HistoryService historyService;

    @Autowired
    public MarketService(MarketRepository marketRepository, HistoryService historyService){
        this.marketRepository = marketRepository;
        this.historyService = historyService;
    }

    public Market getMarketById(Long id){
        return marketRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public List<Market> getAllMarkets(){
        return marketRepository.findAll();
    }

    public List<Market> getAllMarketsByOrtOrPlz(String data){
        return marketRepository.findAllByCityOrPostcode(data, data);
    }

    public List<SearchResultObject> getSupply(SearchObject search){
        List<SearchResultObject> result = new ArrayList<>();
        List<Market> markets = getAllMarketsByOrtOrPlz(search.getCityOrPostcode());
        for (Market market : markets){
            SearchResultObject resultObject = new SearchResultObject();
            resultObject.setMarket(market);
            result.add(resultObject);
            List<History> histories = historyService.findAllByMarketOrderByTimestamp(market);
            for(History history: histories){
                if(search.getProducts().contains(history.getProduct().getName())){
                    Supply supply = new Supply();
                    supply.setProduct(history.getProduct());
                    supply.setQuantity(history.getQuantity());
                    resultObject.addSupply(supply);
                    search.getProducts().remove(history.getProduct().getName());
                }
            }
        }
        return result;
    }

    @Transactional
    public Market createMarket(Market market){
        market.setId(null);
        return marketRepository.save(market);
    }

    @Transactional
    public Market updateMarket(Long id, Market market){
        market.setId(id);
        return marketRepository.save(market);
    }

    public void deleteMarketById(Long id){
        marketRepository.deleteById(id);
    }
}
