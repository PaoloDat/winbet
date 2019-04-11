package ge.vazisu.winbet.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * StatisticValues.
 *
 * @author Pavel_Datunashvili
 */
@Data
@Accessors(chain = true)
public class StatisticValues {

    private int drawNumber;
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;
    private boolean homeWin;
    private boolean draw;
    private boolean awayWin;

    private boolean fonPull;
    private boolean fonMiddle;
    private boolean fonUnPull;

    private boolean manPull;
    private boolean manMiddle;
    private boolean manUnPull;
}
