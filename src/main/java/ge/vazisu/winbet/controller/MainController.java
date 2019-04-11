package ge.vazisu.winbet.controller;

import ge.vazisu.winbet.model.AnalyzerData;
import ge.vazisu.winbet.model.DrawStatistic;
import ge.vazisu.winbet.domain.Game;
import ge.vazisu.winbet.model.RowData;
import ge.vazisu.winbet.service.DrawStatisticService;
import ge.vazisu.winbet.service.TeamStatisticService;
import ge.vazisu.winbet.service.TournamentStatisticService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * MainController.
 *
 * @author Pavel_Datunashvili
 */
@Controller
@Slf4j
@AllArgsConstructor
public class MainController {

    private DrawStatisticService drawStatisticService;
    private TournamentStatisticService tournamentStatisticService;
    private TeamStatisticService teamStatisticService;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("data", new AnalyzerData());
        return "index";
    }


    @PostMapping("/drawstat")
    public String getDtawStat(@ModelAttribute AnalyzerData analyzerData, Model model) {
        List<DrawStatistic> drawStatisticList = drawStatisticService.getDrawStatisticList(analyzerData.getSize());
        model.addAttribute("statistic", drawStatisticList);
        return "drawstat";
    }

    @PostMapping("/gamestat")
    public String getGameStat(@ModelAttribute AnalyzerData data, Model model) {

        List<Game> tournamentStatistic = tournamentStatisticService.getTournamentStatistic(data.getTournamentName());
        model.addAttribute("tournamentStatistic", tournamentStatistic);

        List<Game> homeTeamStatistic = teamStatisticService.getHomeTeamStatistic(data.getHomeTeamName());
        model.addAttribute("homeTeamStat", homeTeamStatistic);

        List<Game> awayTeamStatistic = teamStatisticService.getAwayTeamStatistic(data.getAwayTeamName());
        model.addAttribute("awayTeamStat", awayTeamStatistic);

        List<Game> h2hStatistic = teamStatisticService.getH2Hstatistic(data.getHomeTeamName(), data.getAwayTeamName());
        model.addAttribute("h2hStatistic", h2hStatistic);

        List<Game> fonValuesExactMatch = teamStatisticService.getFonValuesExactMatch(data.getFonHome(),
                data.getFonDraw(), data.getFonAway());
        model.addAttribute("fonValuesExactMatch", fonValuesExactMatch);


        List<Game> fonValuesExactMatchForTournament = teamStatisticService.getFonValuesExactMatchForTournament(data.getFonHome(),
                data.getFonDraw(), data.getFonAway(), data.getTournamentName());
        model.addAttribute("fonValuesExactMatchForTournament", fonValuesExactMatchForTournament);


        List<Game> fonHomeValuesStatistic = teamStatisticService.getFonHomeValuesStatisticForTournament(data.getFonHome(), data.getTournamentName());
        model.addAttribute("fonHomeValuesStatistic", fonHomeValuesStatistic);

        List<Game> fonDrawValuesStatistic = teamStatisticService.getFonDrawValuesStatisticForTournament(data.getFonDraw(), data.getTournamentName());
        model.addAttribute("fonDrawValuesStatistic", fonDrawValuesStatistic);

        List<Game> fonAwayValuesStatistic = teamStatisticService.getFonAwayValuesStatisticForTournament(data.getFonAway(), data.getTournamentName());
        model.addAttribute("fonAwayValuesStatistic", fonAwayValuesStatistic);

        List<Game> manValuesExactMatch = teamStatisticService.getManValuesExactMatch(data.getManHome(), data.getManDraw(), data.getManAway());
        model.addAttribute("manValuesExactMatch", manValuesExactMatch);

        List<Game> manValuesExactMatchForTournament = teamStatisticService.getManValuesExactMatchForTournament(
                data.getManHome(), data.getManDraw(), data.getManAway(), data.getTournamentName());
        model.addAttribute("manValuesExactMatchForTournament", manValuesExactMatchForTournament);

        List<Game> withFonAndManAndCompName = teamStatisticService.findWithFonAndManAndCompName(
                data.getFonHome(), data.getFonAway(), data.getManHome(), data.getManAway(), data.getTournamentName());
        model.addAttribute("withFonAndManAndCompName", withFonAndManAndCompName);


        return "gamestat";
    }


    @GetMapping("/rowstat")
    public String getRowStat(Model model) {
        model.addAttribute("data", new RowData());
        return "rowstat";
    }
}
