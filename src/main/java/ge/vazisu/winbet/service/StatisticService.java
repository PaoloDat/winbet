package ge.vazisu.winbet.service;

import ge.vazisu.winbet.domain.Game;
import ge.vazisu.winbet.domain.League;
import ge.vazisu.winbet.domain.Statistic;
import ge.vazisu.winbet.model.WDLStat;
import ge.vazisu.winbet.repository.GameRepository;
import ge.vazisu.winbet.repository.LeagueRepository;
import ge.vazisu.winbet.repository.StatisticRepository;
import ge.vazisu.winbet.util.NameMapping;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

/**
 * StatisticService.
 *
 * @author Pavel_Datunashvili
 */
@Service
@AllArgsConstructor
public class StatisticService {

    private LeagueService leagueService;
    private LeagueRepository leagueRepository;
    private StatisticRepository statisticRepository;
    private GameRepository gameRepository;

    public void parseGameById(Long id) {
        Optional<Game> gameById = gameRepository.findById(id);
        if (gameById.isPresent()) {
            WDLStat wdlStat;
            Game game = gameById.get();
            LocalDate date = game.getDate();
            Statistic statistic = new Statistic()
                    .setDrawNumber(game.getDrawNumber())
                    .setDate(game.getDate())
                    .setTournamentName(game.getTournamentName())
                    .setHomeTeamName(game.getHomeTeamName())
                    .setAwayTeamName(game.getAwayTeamName())
                    .setHomeScore(game.getHomeScore())
                    .setAwayScore(game.getAwayScore());

            String homeTeam = NameMapping.getNameMapping().get(game.getHomeTeamName());
            String awayTeam = NameMapping.getNameMapping().get(game.getAwayTeamName());
            League league = leagueRepository.findByHomeTeamNameAndAwayTeamNameAndDate(homeTeam, awayTeam, date);
            statistic.setLeagueId(league.getId());
            statistic.setHomeWinOdd(league.getHomeWinOdd()).setDrawOdd(league.getDrawOdd()).setAwayWinOdd(league.getAwayWinOdd());

            wdlStat = leagueService.getAllWDLStat(homeTeam, date);
            statistic.setHomeTeamAllWin(wdlStat.getWin()).setHomeTeamAllDraw(wdlStat.getDraw()).setHomeTeamAllLose(wdlStat.getLose());

            wdlStat = leagueService.getHomeWDLStat(homeTeam, date);
            statistic.setHomeTeamHomeWin(wdlStat.getWin()).setHomeTeamHomeDraw(wdlStat.getDraw()).setHomeTeamHomeLose(wdlStat.getLose());

            wdlStat = leagueService.getAwayWDLStat(homeTeam, date);
            statistic.setHomeTeamAwayWin(wdlStat.getWin()).setHomeTeamAwayDraw(wdlStat.getDraw()).setHomeTeamAwayLose(wdlStat.getLose());

            wdlStat = leagueService.getAllWDLStat(awayTeam, date);
            statistic.setAwayTeamAllWin(wdlStat.getWin()).setAwayTeamAllDraw(wdlStat.getDraw()).setAwayTeamAllLose(wdlStat.getLose());

            wdlStat = leagueService.getHomeWDLStat(awayTeam, date);
            statistic.setAwayTeamHomeWin(wdlStat.getWin()).setAwayTeamHomeDraw(wdlStat.getDraw()).setAwayTeamHomeLose(wdlStat.getLose());

            wdlStat = leagueService.getAwayWDLStat(awayTeam, date);
            statistic.setAwayTeamAwayWin(wdlStat.getWin()).setAwayTeamAwayDraw(wdlStat.getDraw()).setAwayTeamAwayLose(wdlStat.getLose());

            wdlStat = leagueService.getAllWDLRowStat(homeTeam, date);
            statistic.setHomeTeamAllRowWin(wdlStat.getWin()).setHomeTeamAllRowDraw(wdlStat.getDraw()).setHomeTeamAllRowLose(wdlStat.getLose());

            wdlStat = leagueService.getHomeWDLRowStat(homeTeam, date);
            statistic.setHomeTeamHomeRowWin(wdlStat.getWin()).setHomeTeamHomeRowDraw(wdlStat.getDraw()).setHomeTeamHomeRowLose(wdlStat.getLose());

            wdlStat = leagueService.getAwayWDLRowStat(homeTeam, date);
            statistic.setHomeTeamAwayRowWin(wdlStat.getWin()).setHomeTeamAwayRowDraw(wdlStat.getDraw()).setHomeTeamAwayRowLose(wdlStat.getLose());

            wdlStat = leagueService.getAllWDLRowStat(awayTeam, date);
            statistic.setAwayTeamAllRowWin(wdlStat.getWin()).setAwayTeamAllRowDraw(wdlStat.getDraw()).setAwayTeamAllRowLose(wdlStat.getLose());

            wdlStat = leagueService.getHomeWDLRowStat(awayTeam, date);
            statistic.setAwayTeamHomeRowWin(wdlStat.getWin()).setAwayTeamHomeRowDraw(wdlStat.getDraw()).setAwayTeamHomeRowLose(wdlStat.getLose());

            wdlStat = leagueService.getAwayWDLRowStat(awayTeam, date);
            statistic.setAwayTeamAwayRowWin(wdlStat.getWin()).setAwayTeamAwayRowDraw(wdlStat.getDraw()).setAwayTeamAwayRowLose(wdlStat.getLose());

            wdlStat = leagueService.getH2HWDLStat(homeTeam, awayTeam, date);
            statistic.setHhWin(wdlStat.getWin()).setHhDraw(wdlStat.getDraw()).setHhLose(wdlStat.getLose());

            wdlStat = leagueService.getH2HWDLInRowStat(homeTeam, awayTeam, date);
            statistic.setHhRowWin(wdlStat.getWin()).setHhRowDraw(wdlStat.getDraw()).setHhRowLose(wdlStat.getLose());

            statisticRepository.save(statistic);
        }
    }

}
