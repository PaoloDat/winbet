package ge.vazisu.winbet.model;

import lombok.Data;

/**
 * AnalyzerData.
 *
 * @author Pavel_Datunashvili
 */
@Data
public class AnalyzerData {
    private int size;
    private String tournamentName;
    private String homeTeamName;
    private String awayTeamName;

    private double fonHome;
    private double fonDraw;
    private double fonAway;
    private double manHome;
    private double manDraw;
    private double manAway;
}
