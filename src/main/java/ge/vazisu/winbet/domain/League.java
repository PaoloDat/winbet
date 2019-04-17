package ge.vazisu.winbet.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;

/**
 * League.
 *
 * @author Pavel_Datunashvili
 */
@Data
@Entity
@Accessors(chain = true)
public class League {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String leagueName;
    private LocalDate date;
    private String homeTeamName;
    private String awayTeamName;
    private Integer homeScore;
    private Integer awayScore;
    private Integer halfHomeScore;
    private Integer halfAwayScore;
    private String referee;
    private Integer homeTeamShotOnTarget;
    private Integer awayTeamShotOnTarget;
    private Integer homeTeamCorner;
    private Integer awayTeamCorner;
    private Integer homeTeamOffside;
    private Integer awayTeamOffside;
    private Integer homeTeamYellowCard;
    private Integer awayTeamYellowCard;
    private Integer homeTeamRedCard;
    private Integer awayTeamRedCard;
    private Double homeWinOdd;
    private Double drawOdd;
    private Double awayWinOdd;
}
