package ge.vazisu.winbet.bootsrap;

import ge.vazisu.winbet.repository.GameRepository;
import ge.vazisu.winbet.repository.StatisticRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * DevBootStrap.
 *
 * @author Pavel_Datunashvili
 */
@Component
@AllArgsConstructor
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {

    private GameRepository repository;
    private StatisticRepository statisticRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse("10/08/2018", formatter);
    }
}
