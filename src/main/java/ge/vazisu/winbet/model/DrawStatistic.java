package ge.vazisu.winbet.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * DrawStatistic.
 *
 * @author Pavel_Datunashvili
 */
@Data
@Accessors(chain = true)
public class DrawStatistic extends StatisticValues {
    private int homeWinNumber = 0;
    private int drawGameNumber = 0;
    private int awayWinNumber = 0;

    private int fonPullNumber = 0;
    private int fonMiddleNumber = 0;
    private int fonUnPullNumber = 0;

    private int manPullNumber = 0;
    private int manMiddleNumber = 0;
    private int manUnPullNumber = 0;
}
