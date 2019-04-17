package ge.vazisu.winbet.service;

import ge.vazisu.winbet.model.DrawStatistic;
import ge.vazisu.winbet.domain.Game;
import ge.vazisu.winbet.model.StatisticValues;
import ge.vazisu.winbet.repository.GameRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * DrawStatisticService.
 *
 * @author Pavel_Datunashvili
 */
@Service
@AllArgsConstructor
public class DrawStatisticService {
    private HelpService helpService;
    private GameRepository repository;

    public DrawStatistic getDrawStatistic(List<Game> list) {
        DrawStatistic drawStatistic = new DrawStatistic();
        drawStatistic.setDrawNumber(list.get(0).getDrawNumber());

        list.forEach(game -> {
            StatisticValues statistic = helpService.getStatistic(game);
            if (statistic.isHomeWin()) {
                drawStatistic.setHomeWinNumber(drawStatistic.getHomeWinNumber() + 1);
            }
            if (statistic.isAwayWin()) {
                drawStatistic.setAwayWinNumber(drawStatistic.getAwayWinNumber() + 1);
            }
            if (statistic.isDraw()) {
                drawStatistic.setDrawGameNumber(drawStatistic.getDrawGameNumber() + 1);
            }

            if (statistic.isFonPull()) {
                drawStatistic.setFonPullNumber(drawStatistic.getFonPullNumber() + 1);
            }
            if (statistic.isFonMiddle()) {
                drawStatistic.setFonMiddleNumber(drawStatistic.getFonMiddleNumber() + 1);
            }
            if (statistic.isFonUnPull()) {
                drawStatistic.setFonUnPullNumber(drawStatistic.getFonUnPullNumber() + 1);
            }

            if (statistic.isManPull()) {
                drawStatistic.setManPullNumber(drawStatistic.getManPullNumber() + 1);
            }
            if (statistic.isManMiddle()) {
                drawStatistic.setManMiddleNumber(drawStatistic.getManMiddleNumber() + 1);
            }
            if (statistic.isManUnPull()) {
                drawStatistic.setManUnPullNumber(drawStatistic.getManUnPullNumber() + 1);
            }
        });

        return drawStatistic;
    }


    public List<DrawStatistic> getDrawStatisticList(int size ) {
        int lastDrawNumber = repository.findTopByOrderByIdDesc().getDrawNumber();
        List<DrawStatistic> drawStats = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            List<Game> allByDrawNumber = repository.findAllByDrawNumberAndIdGreaterThan(lastDrawNumber - i, 14735);
            if (!allByDrawNumber.isEmpty()) {
                drawStats.add(getDrawStatistic(allByDrawNumber));
            }
        }
        return drawStats;
    }


}
