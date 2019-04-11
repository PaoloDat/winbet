package ge.vazisu.winbet.repository;

import ge.vazisu.winbet.domain.League;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * LeagueRepository.
 *
 * @author Pavel_Datunashvili
 */
@Repository
public interface LeagueRepository extends JpaRepository<League, Long> {
}
