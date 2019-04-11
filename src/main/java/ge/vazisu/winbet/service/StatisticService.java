package ge.vazisu.winbet.service;

import ge.vazisu.winbet.domain.Game;
import ge.vazisu.winbet.model.StatisticValues;
import org.springframework.stereotype.Service;

/**
 * StatisticService.
 *
 * @author Pavel_Datunashvili
 */
@Service
public class StatisticService {

    public StatisticValues getStatistic(Game game) {

        StatisticValues statistic = new StatisticValues();

        if (game.getHomeScore() > game.getAwayScore()) {
            statistic.setHomeWin(true);
            if ((game.getFonHome() > game.getFonAway()) && (game.getFonHome() > game.getFonDraw())) {
                statistic.setFonPull(true);
            } else if((game.getFonHome() < game.getFonAway()) && (game.getFonHome() < game.getFonDraw())) {
                statistic.setFonUnPull(true);
            } else {
                statistic.setFonMiddle(true);
            }

            if ((game.getManHome() > game.getManAway()) && (game.getManHome() > game.getManDraw())) {
                statistic.setManPull(true);
            } else if((game.getManHome() < game.getManAway()) && (game.getManHome() < game.getManDraw())) {
                statistic.setManUnPull(true);
            } else {
                statistic.setManMiddle(true);
            }



        } else if (game.getHomeScore() < game.getAwayScore()) {
            statistic.setAwayWin(true);
            if ((game.getFonAway() > game.getFonHome()) && (game.getFonAway() > game.getFonDraw())) {
                statistic.setFonPull(true);
            } else if((game.getFonAway() < game.getFonHome()) && (game.getFonAway() < game.getFonDraw())) {
                statistic.setFonUnPull(true);
            } else {
                statistic.setFonMiddle(true);
            }

            if ((game.getManAway() > game.getManHome()) && (game.getManAway() > game.getManDraw())) {
                statistic.setManPull(true);
            } else if((game.getManAway() < game.getManHome()) && (game.getManAway() < game.getManDraw())) {
                statistic.setManUnPull(true);
            } else {
                statistic.setManMiddle(true);
            }

        } else {
            statistic.setDraw(true);
            if ((game.getFonDraw() > game.getFonHome()) && (game.getFonDraw() > game.getFonAway())) {
                statistic.setFonPull(true);
            } else if((game.getFonDraw() < game.getFonHome()) && (game.getFonDraw() < game.getFonAway())) {
                statistic.setFonUnPull(true);
            } else {
                statistic.setFonMiddle(true);
            }

            if ((game.getManDraw() > game.getManHome()) && (game.getManDraw() > game.getManAway())) {
                statistic.setManPull(true);
            } else if((game.getManDraw() < game.getManHome()) && (game.getManDraw() < game.getManAway())) {
                statistic.setManUnPull(true);
            } else {
                statistic.setManMiddle(true);
            }

        }
        return statistic;
    }
}
