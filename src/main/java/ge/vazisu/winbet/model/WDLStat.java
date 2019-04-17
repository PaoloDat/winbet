package ge.vazisu.winbet.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * WDLStat.
 *
 * @author Pavel_Datunashvili
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class WDLStat {
    private int win;
    private int draw;
    private int lose;
}
