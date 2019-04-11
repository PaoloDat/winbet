package ge.vazisu.winbet.service;

import ge.vazisu.winbet.domain.Game;
import ge.vazisu.winbet.repository.GameRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TournamentStatisticService.
 *
 * @author Pavel_Datunashvili
 */
@Service
@AllArgsConstructor
public class TournamentStatisticService {

    private GameRepository repository;

    public List<Game> getTournamentStatistic(String name) {
        return repository.findAllByTournamentNameOrderByIdDesc(name);
    }
}
