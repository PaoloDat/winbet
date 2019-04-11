package ge.vazisu.winbet.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * TournamentStatistic.
 *
 * @author Pavel_Datunashvili
 */
@Data
@Accessors(chain = true)
public class TournamentStatistic extends StatisticValues {
    private String tournamentName;
}
