package ge.vazisu.winbet.util;

import lombok.experimental.UtilityClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Objects;

/**
 * DateUtil.
 *
 * @author Pavel_Datunashvili
 */
@UtilityClass
public class DateUtil {

    public static Date convertLocalDateToDateAtStartOfDay(LocalDate localDate) {
        return Objects.nonNull(localDate) ? convertLocalDateTimeToDate(localDate.atStartOfDay()) : null;
    }

    public static Date convertLocalDateToDateAtEndOfDay(LocalDate localDate) {
        return Objects.nonNull(localDate) ? convertLocalDateTimeToDate(localDate.atTime(LocalTime.MAX)) : null;
    }

    private static Date convertLocalDateTimeToDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }
}
