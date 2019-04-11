package ge.vazisu.winbet.service;

import ge.vazisu.winbet.domain.Game;
import ge.vazisu.winbet.repository.GameRepository;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * TeamStatisticService.
 *
 * @author Pavel_Datunashvili
 */
@Service
@AllArgsConstructor
public class TeamStatisticService {

    private GameRepository repository;

    public List<Game> getHomeTeamStatistic(String name) {
        return repository.findAllByHomeTeamNameOrderByIdDesc(name);
    }

    public List<Game> getAwayTeamStatistic(String name) {
        return repository.findAllByAwayTeamNameOrderByIdDesc(name);
    }

    public List<Game> getH2Hstatistic(String homeName, String awayName) {
        if (Strings.isNotEmpty(homeName) && Strings.isNotEmpty(awayName)) {
            return repository.findAllByHomeTeamNameAndAwayTeamNameOrderByIdDesc(homeName, awayName);
        }
        return Collections.emptyList();
    }

    public List<Game> getFonValuesExactMatch(double fonHome, double fonDraw, double fonAway) {
        return repository.findAllByFonHomeAndFonDrawAndFonAwayOrderByIdDesc(fonHome, fonDraw, fonAway);
    }

    public List<Game> getFonValuesExactMatchForTournament(double fonHome, double fonDraw, double fonAway, String name) {
        return repository.findAllByFonHomeAndFonDrawAndFonAwayAndTournamentNameOrderByIdDesc(fonHome, fonDraw, fonAway, name);
    }

    public List<Game> getFonHomeValuesStatistic(double fonHome){
        return repository.findAllByFonHomeGreaterThanEqualAndFonHomeLessThanEqualOrderByIdDesc(fonHome - 2.5D, fonHome + 2.5D);
    }

    public List<Game> getFonHomeValuesStatisticForTournament(double fonHome, String name){
        return repository.findAllByFonHomeGreaterThanEqualAndFonHomeLessThanEqualAndTournamentNameOrderByIdDesc(
                fonHome - 2.5D, fonHome + 2.5D, name);
    }

    public List<Game> getFonDrawValuesStatisticForTournament(double fonDraw, String name){
        return repository.findAllByFonDrawGreaterThanEqualAndFonDrawLessThanEqualAndTournamentNameOrderByIdDesc(
                fonDraw - 2.5D, fonDraw + 2.5D, name);
    }

    public List<Game> getFonAwayValuesStatisticForTournament(double fonDraw, String name){
        return repository.findAllByFonAwayGreaterThanEqualAndFonAwayLessThanEqualAndTournamentNameOrderByIdDesc(
                fonDraw - 2.5D, fonDraw + 2.5D, name);
    }


    public List<Game> getManValuesExactMatch(double manHome, double manDraw, double manAway) {
        return repository.findAllByManHomeGreaterThanAndManHomeLessThanAndManDrawGreaterThanAndManDrawLessThanAndManAwayGreaterThanAndManAwayLessThanOrderByIdDesc(
                manHome - 0.5D, manHome + 0.5D,
                manDraw - 0.5D, manDraw + 0.5D,
                manAway - 0.5D, manAway + 0.5D);
    }


    public List<Game> getManValuesExactMatchForTournament(double manHome, double manDraw, double manAway, String name) {
        return repository.findAllByManHomeGreaterThanAndManHomeLessThanAndManDrawGreaterThanAndManDrawLessThanAndManAwayGreaterThanAndManAwayLessThanAndTournamentNameOrderByIdDesc(
                manHome - 0.5D, manHome + 0.5D,
                manDraw - 0.5D, manDraw + 0.5D,
                manAway - 0.5D, manAway + 0.5D, name);
    }


    public List<Game> findWithFonAndManAndCompName(double fonHome, double fonAway, double manHome, double manAway,String name) {
        if (fonHome-fonAway>0 && manHome-manAway<0) {
            return repository.findWithFonHomeAndManAwayAndCompName(name);
        } else if (fonHome-fonAway<0 && manHome-manAway>0) {
            return repository.findWithFonAwayAndManHomeAndCompName(name);
        }
        return Collections.emptyList();
    }



}
