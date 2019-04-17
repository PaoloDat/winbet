package ge.vazisu.winbet.bootsrap;

import ge.vazisu.winbet.repository.GameRepository;
import ge.vazisu.winbet.repository.LeagueRepository;
import ge.vazisu.winbet.repository.StatisticRepository;
import ge.vazisu.winbet.service.LeagueService;
import ge.vazisu.winbet.service.StatisticService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

/**
 * DevBootStrap.
 *
 * @author Pavel_Datunashvili
 */
@Component
@AllArgsConstructor
@Slf4j
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {

    private GameRepository gameRepository;
    private StatisticRepository statisticRepository;
    private LeagueRepository leagueRepository;
    private LeagueService leagueService;
    private StatisticService statisticService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

//        WDLStat huddersfield = leagueService.getH2HWDLInRowStat("Liverpool", "Chelsea", date);
//        System.out.println(huddersfield);

//        LocalDate date = gameRepository.findById(18019L).get().getDate();
//        leagueRepository.findAllByDate(date);


        Stream.of(17989L, 17988L, 17987L, 17983L, 17982L, 17981L, 17980L, 17979L, 17978L, 17977L).forEach(id -> {
            statisticService.parseGameById(id);
            log.info("Data saved. id = {}", id);
        });


    }
}
