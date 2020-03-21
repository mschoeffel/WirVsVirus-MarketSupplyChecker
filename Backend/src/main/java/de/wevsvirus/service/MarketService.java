package de.wevsvirus.service;

import de.wevsvirus.model.Market;
import de.wevsvirus.repository.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class MarketService {

    private MarketRepository marketRepository;

    @Autowired
    public MarketService(MarketRepository marketRepository){
        this.marketRepository = marketRepository;
    }

    public Market getMarketById(Long id){
        return marketRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public List<Market> getAllMarkets(){
        return marketRepository.findAll();
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
