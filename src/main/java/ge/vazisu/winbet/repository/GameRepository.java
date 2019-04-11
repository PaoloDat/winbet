package ge.vazisu.winbet.repository;

import ge.vazisu.winbet.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * GameRepository.
 *
 * @author Pavel_Datunashvili
 */
public interface GameRepository extends JpaRepository<Game, Long> {

    Game findTopByOrderByIdDesc();

    List<Game> findByDrawNumberGreaterThanAndIdGreaterThanOrderByDrawNumberDesc(int drawNumber, Integer id);

    List<Game> findAllByDrawNumberAndIdGreaterThan(int drawNumber, Integer id);

    List<Game> findAllByTournamentNameOrderByIdDesc(String tournamentName);

    List<Game> findAllByHomeTeamNameOrderByIdDesc(String homeTeamName);

    List<Game> findAllByAwayTeamNameOrderByIdDesc(String awayTeamName);

    List<Game> findAllByHomeTeamNameAndAwayTeamNameOrderByIdDesc(String homeTeamName, String awayTeamName);

    List<Game> findAllByFonHomeAndFonDrawAndFonAwayOrderByIdDesc(double fonHome, double fonDraw, double fonAway);

    List<Game> findAllByFonHomeAndFonDrawAndFonAwayAndTournamentNameOrderByIdDesc(double fonHome, double fonDraw, double fonAway, String tournamentName);

    List<Game> findAllByFonHomeGreaterThanEqualAndFonHomeLessThanEqualOrderByIdDesc(double min, double max);

    List<Game> findAllByFonHomeGreaterThanEqualAndFonHomeLessThanEqualAndTournamentNameOrderByIdDesc(double min, double max, String name);

    List<Game> findAllByFonAwayGreaterThanEqualAndFonAwayLessThanEqualAndTournamentNameOrderByIdDesc(double min, double max, String name);

    List<Game> findAllByFonDrawGreaterThanEqualAndFonDrawLessThanEqualAndTournamentNameOrderByIdDesc(double min, double max, String name);

    List<Game> findAllByManHomeGreaterThanAndManHomeLessThanAndManDrawGreaterThanAndManDrawLessThanAndManAwayGreaterThanAndManAwayLessThanOrderByIdDesc(
            double homeMin, double homeMax, double drawMin, double drawMax, double awayMin, double awayMax);

    List<Game> findAllByManHomeGreaterThanAndManHomeLessThanAndManDrawGreaterThanAndManDrawLessThanAndManAwayGreaterThanAndManAwayLessThanAndTournamentNameOrderByIdDesc(
            double homeMin, double homeMax, double drawMin, double drawMax, double awayMin, double awayMax, String name);

    @Query("select g from Game g where g.fonHome>g.fonAway and g.manHome<g.manAway and g.tournamentName = :comp")
    List<Game> findWithFonHomeAndManAwayAndCompName(@Param("comp") String comp);

    @Query("select g from Game g where g.fonHome<g.fonAway and g.manHome>g.manAway and g.tournamentName = :comp")
    List<Game> findWithFonAwayAndManHomeAndCompName(@Param("comp") String comp);

}
