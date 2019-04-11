package ge.vazisu.winbet.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * StatisticValues.
 *
 * @author Pavel_Datunashvili
 */
@Data
@Entity
@Accessors(chain = true)
public class Statistic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer homeTeamAllWin;
    private Integer homeTeamAllDraw;
    private Integer homeTeamAllLose;

    private Integer homeTeamHomeWin;
    private Integer homeTeamHomeDraw;
    private Integer homeTeamHomeLose;

    private Integer homeTeamAwayWin;
    private Integer homeTeamAwayDraw;
    private Integer homeTeamAwayLose;

    private Integer awayTeamAllWin;
    private Integer awayTeamAllDraw;
    private Integer awayTeamAllLose;

    private Integer awayTeamHomeWin;
    private Integer awayTeamHomeDraw;
    private Integer awayTeamHomeLose;

    private Integer awayTeamAwayWin;
    private Integer awayTeamAwayDraw;
    private Integer awayTeamAwayLose;

    private Integer homeTeamAllRowWin;
    private Integer homeTeamAllRowDraw;
    private Integer homeTeamAllRowLose;

    private Integer homeTeamHomeRowWin;
    private Integer homeTeamHomeRowDraw;
    private Integer homeTeamHomeRowLose;

    private Integer homeTeamAwayRowWin;
    private Integer homeTeamAwayRowDraw;
    private Integer homeTeamAwayRowLose;

    private Integer awayTeamAllRowWin;
    private Integer awayTeamAllRowDraw;
    private Integer awayTeamAllRowLose;

    private Integer awayTeamHomeRowWin;
    private Integer awayTeamHomeRowDraw;
    private Integer awayTeamHomeRowLose;

    private Integer awayTeamAwayRowWin;
    private Integer awayTeamAwayRowDraw;
    private Integer awayTeamAwayRowLose;

    private Integer hhWin;
    private Integer hhDraw;
    private Integer hhLose;

    private Integer hhRowWin;
    private Integer hhRowDraw;
    private Integer hhRowLose;
}
