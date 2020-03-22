package de.wevsvirus.repository;

import de.wevsvirus.model.Market;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MarketRepository extends JpaRepository<Market, Long> {

    List<Market> findAllByCityOrPostcode(String city, String postcode);

}
