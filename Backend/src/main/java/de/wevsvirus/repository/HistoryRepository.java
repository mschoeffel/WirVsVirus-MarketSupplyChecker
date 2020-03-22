package de.wevsvirus.repository;

import de.wevsvirus.model.History;
import de.wevsvirus.model.Market;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HistoryRepository extends JpaRepository<History, Long> {

    List<History> findAllByMarketOrderByTimestamp(Market market);
}
