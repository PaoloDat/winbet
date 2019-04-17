package ge.vazisu.winbet.service;

import ge.vazisu.winbet.domain.League;
import ge.vazisu.winbet.model.WDLStat;
import ge.vazisu.winbet.repository.LeagueRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * LeagueService.
 *
 * @author Pavel_Datunashvili
 */
@AllArgsConstructor
@Service
public class LeagueService {

    private LeagueRepository leagueRepository;
    private static final PageRequest PAGE_REQUEST = PageRequest.of(0, 5);


    public WDLStat getAllWDLStat(String teamName, LocalDate date) {
        int w = 0;
        int d = 0;
        int l = 0;
        for (League game : leagueRepository.findAllWDLStat(teamName, teamName, date, PAGE_REQUEST)) {
            if (game.getHomeTeamName().equals(teamName)) {
                if (game.getHomeScore() > game.getAwayScore()) {
                    w++;
                } else if (game.getHomeScore() < game.getAwayScore()) {
                    l++;
                } else {
                    d++;
                }
            } else {
                if (game.getHomeScore() < game.getAwayScore()) {
                    w++;
                } else if (game.getHomeScore() > game.getAwayScore()) {
                    l++;
                } else {
                    d++;
                }
            }
        }
        return new WDLStat(w, d, l);
    }

    public WDLStat getHomeWDLStat(String teamName, LocalDate date) {
        int w = 0;
        int d = 0;
        int l = 0;
        for (League game : leagueRepository.findHomeWDLStat(teamName, date, PAGE_REQUEST)) {
            if (game.getHomeScore() > game.getAwayScore()) {
                w++;
            } else if (game.getHomeScore() < game.getAwayScore()) {
                l++;
            } else {
                d++;
            }
        }

        return new WDLStat(w, d, l);
    }

    public WDLStat getAwayWDLStat(String teamName, LocalDate date) {
        int w = 0;
        int d = 0;
        int l = 0;


        for (League game : leagueRepository.findAwayWDLStat(teamName, date, PAGE_REQUEST)) {
            if (game.getHomeScore() < game.getAwayScore()) {
                w++;
            } else if (game.getHomeScore() > game.getAwayScore()) {
                l++;
            } else {
                d++;
            }
        }
        return new WDLStat(w, d, l);
    }

    public WDLStat getHomeWDLRowStat(String teamName, LocalDate date) {
        int w = 0;
        int l = 0;

        List<League> games = leagueRepository.findHomeWDLStat(teamName, date, PAGE_REQUEST);

        if (games.isEmpty()) {
            return new WDLStat(0, 0, 0);
        }

        int index = 0;
        League lastGame = games.get(index);
        if (lastGame.getHomeScore() > lastGame.getAwayScore()) {
            w++;
            index++;
            while (index < games.size()) {
                if (games.get(index).getHomeScore() > games.get(index).getAwayScore()) {
                    w++;
                } else {
                    return new WDLStat(w, 0, 0);
                }
                index++;
            }
            return new WDLStat(w, 0, 0);
        } else if (lastGame.getHomeScore() < lastGame.getAwayScore()) {
            l++;
            index++;
            while (index < games.size()) {
                if (games.get(index).getHomeScore() < games.get(index).getAwayScore()) {
                    l++;
                } else {
                    return new WDLStat(0, 0, l);
                }
                index++;
            }
            return new WDLStat(0, 0, l);
        }

        return getDrawInRowCounter(games);
    }

    public WDLStat getAwayWDLRowStat(String teamName, LocalDate date) {
        int w = 0;
        int l = 0;

        List<League> games = leagueRepository.findAwayWDLStat(teamName, date, PAGE_REQUEST);

        if (games.isEmpty()) {
            return new WDLStat(0, 0, 0);
        }

        int index = 0;
        League lastGame = games.get(index);
        if (lastGame.getHomeScore() < lastGame.getAwayScore()) {
            w++;
            index++;
            while (index < games.size()) {
                if (games.get(index).getHomeScore() < games.get(index).getAwayScore()) {
                    w++;
                } else {
                    return new WDLStat(w, 0, 0);
                }
                index++;
            }
            return new WDLStat(w, 0, 0);
        } else if (lastGame.getHomeScore() > lastGame.getAwayScore()) {
            l++;
            index++;
            while (index < games.size()) {
                if (games.get(index).getHomeScore() > games.get(index).getAwayScore()) {
                    l++;
                } else {
                    return new WDLStat(0, 0, l);
                }
                index++;
            }
            return new WDLStat(0, 0, l);
        }

        return getDrawInRowCounter(games);
    }

    private WDLStat getDrawInRowCounter(List<League> games) {
        int d = 1;
        int index = 1;
        while (index < games.size()) {
            if (games.get(index).getHomeScore().equals(games.get(index).getAwayScore())) {
                d++;
            } else {
                return new WDLStat(0, d, 0);
            }
            index++;
        }
        return new WDLStat(0, d, 0);
    }

    public WDLStat getAllWDLRowStat(String teamName, LocalDate date) {
        List<League> games = leagueRepository.findAllWDLStat(teamName, teamName, date, PAGE_REQUEST);
        if (games.isEmpty()) {
            return new WDLStat(0, 0, 0);
        }

        int index = 0;
        int win = 0;
        int lose = 0;
        League lastGame = games.get(0);

        if (lastGame.getHomeTeamName().equals(teamName)) {
            if (lastGame.getHomeScore() > lastGame.getAwayScore()) {
                win++;
                index++;
                while (index < games.size()) {
                    if (games.get(index).getHomeTeamName().equals(teamName)) {
                        if (games.get(index).getHomeScore() > games.get(index).getAwayScore()) {
                            win++;
                        } else {
                            return new WDLStat(win, 0, 0);
                        }
                    } else if (games.get(index).getHomeScore() < games.get(index).getAwayScore()) {
                        win++;
                    } else {
                        return new WDLStat(win, 0, 0);
                    }
                    index++;
                }
                return new WDLStat(win, 0, 0);
            } else if (lastGame.getHomeScore() < lastGame.getAwayScore()) {
                lose++;
                index++;
                while (index < games.size()) {
                    if (games.get(index).getHomeTeamName().equals(teamName)) {
                        if (games.get(index).getHomeScore() < games.get(index).getAwayScore()) {
                            lose++;
                        } else {
                            return new WDLStat(0, 0, lose);
                        }
                    } else if (games.get(index).getHomeScore() > games.get(index).getAwayScore()) {
                        lose++;
                    } else {
                        return new WDLStat(0, 0, lose);
                    }
                    index++;
                }
                return new WDLStat(0, 0, lose);
            }
            return getDrawInRowCounter(games);
        } else {
            if (lastGame.getHomeScore() < lastGame.getAwayScore()) {
                win++;
                index++;
                while (index < games.size()) {
                    if (games.get(index).getHomeTeamName().equals(teamName)) {
                        if (games.get(index).getHomeScore() > games.get(index).getAwayScore()) {
                            win++;
                        } else {
                            return new WDLStat(win, 0, 0);
                        }
                    } else if (games.get(index).getHomeScore() < games.get(index).getAwayScore()) {
                        win++;
                    } else {
                        return new WDLStat(win, 0, 0);
                    }
                    index++;
                }
                return new WDLStat(win, 0, 0);
            } else if (lastGame.getHomeScore() > lastGame.getAwayScore()) {
                lose++;
                index++;
                while (index < games.size()) {
                    if (games.get(index).getHomeTeamName().equals(teamName)) {
                        if (games.get(index).getHomeScore() < games.get(index).getAwayScore()) {
                            lose++;
                        } else {
                            return new WDLStat(0, 0, lose);
                        }
                    } else if (games.get(index).getHomeScore() > games.get(index).getAwayScore()) {
                        lose++;
                    } else {
                        return new WDLStat(0, 0, lose);
                    }
                    index++;
                }
                return new WDLStat(0, 0, lose);
            }
            return getDrawInRowCounter(games);
        }
    }


    public WDLStat getH2HWDLStat(String homeTeam, String awayTeam, LocalDate date) {
        int w = 0;
        int d = 0;
        int l = 0;
        for (League game : leagueRepository.findH2HWDLStat(homeTeam, awayTeam, date, PAGE_REQUEST)) {
            if (game.getHomeScore() > game.getAwayScore()) {
                w++;
            } else if (game.getHomeScore() < game.getAwayScore()) {
                l++;
            } else {
                d++;
            }
        }
        return new WDLStat(w, d, l);
    }

    public WDLStat getH2HWDLInRowStat(String homeTeam, String awayTeam, LocalDate date) {
        List<League> games = leagueRepository.findH2HWDLStat(homeTeam, awayTeam, date, PAGE_REQUEST);
        int w = 0;
        int l = 0;

        if (games.isEmpty()) {
            return new WDLStat(0, 0, 0);
        }

        int index = 0;
        League lastGame = games.get(index);
        if (lastGame.getHomeScore() > lastGame.getAwayScore()) {
            w++;
            index++;
            while (index < games.size()) {
                if (games.get(index).getHomeScore() > games.get(index).getAwayScore()) {
                    w++;
                } else {
                    return new WDLStat(w, 0, 0);
                }
                index++;
            }
            return new WDLStat(w, 0, 0);
        } else if (lastGame.getHomeScore() < lastGame.getAwayScore()) {
            l++;
            index++;
            while (index < games.size()) {
                if (games.get(index).getHomeScore() < games.get(index).getAwayScore()) {
                    l++;
                } else {
                    return new WDLStat(0, 0, l);
                }
                index++;
            }
            return new WDLStat(0, 0, l);
        }

        return getDrawInRowCounter(games);
    }

}
