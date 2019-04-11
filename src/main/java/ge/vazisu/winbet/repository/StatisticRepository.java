package ge.vazisu.winbet.repository;

import ge.vazisu.winbet.domain.Statistic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * StatisticRepository.
 *
 * @author Pavel_Datunashvili
 */
@Repository
public interface StatisticRepository extends JpaRepository<Statistic, Long> {
}
