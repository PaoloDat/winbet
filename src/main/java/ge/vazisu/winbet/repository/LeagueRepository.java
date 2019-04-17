package ge.vazisu.winbet.repository;

import ge.vazisu.winbet.domain.League;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

/**
 * LeagueRepository.
 *
 * @author Pavel_Datunashvili
 */
@Repository
public interface LeagueRepository extends JpaRepository<League, Long> {

    @Query("select l from League l where (l.homeTeamName = :homeTeamName or l.awayTeamName = :awayTeamName) " +
            "and l.date < :gameDate order by l.date desc")
    List<League> findAllWDLStat(@Param("homeTeamName") String homeTeamName,
                                @Param("awayTeamName") String awayTeamName,
                                @Param("gameDate") LocalDate date,
                                Pageable pageable);

    @Query("select l from League l where l.homeTeamName = :homeTeamName and l.date < :gameDate order by l.date desc")
    List<League> findHomeWDLStat(@Param("homeTeamName") String homeTeamName,
                                 @Param("gameDate") LocalDate date,
                                 Pageable pageable);

    @Query("select l from League l where l.awayTeamName = :awayTeamName and l.date < :gameDate order by l.date desc")
    List<League> findAwayWDLStat(@Param("awayTeamName") String awayTeamName,
                                 @Param("gameDate") LocalDate date,
                                 Pageable pageable);

    @Query("select l from League l where (l.homeTeamName = :homeTeamName and l.awayTeamName = :awayTeamName) " +
            "and l.date < :gameDate order by l.date desc")
    List<League> findH2HWDLStat(@Param("homeTeamName") String homeTeamName,
                                @Param("awayTeamName") String awayTeamName,
                                @Param("gameDate") LocalDate date,
                                Pageable pageable);

    League findByHomeTeamNameAndAwayTeamNameAndDate(String homeTeamName, String awayTeamName, LocalDate date);


    List<League> findAllByDate(LocalDate date);


}
