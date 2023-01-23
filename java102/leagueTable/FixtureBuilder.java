package java102.leagueTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class FixtureBuilder {
    List<String> teams;
    List<String> tempTeams;
    Set<Soccer> soccers;
    Set<String> playedMatches;
    List<Soccer> rematch;
    Map<Integer, Set<Soccer>> soccerMap;
    Soccer soccer;

    public FixtureBuilder(List<String> teams) {

        this.teams = new ArrayList<>(teams);
        this.tempTeams = new ArrayList<>(teams);

        if (this.teams.size() % 2 != 0) {
            this.teams.add("Bay");
            this.tempTeams.add("Bay");
        }
        // soccers = new HashSet<>();
        rematch = new ArrayList<>();
        soccerMap = new HashMap<>();
        playedMatches = new HashSet<>();
    }

    public Map<Integer, Set<Soccer>> build() {
        int week = (this.teams.size() - 1) * 2;
        int homeTeamIndex = 0, awayTeamIndex = 0;
        int k = 0;
        for (int i = 1; i <= week; i++) {

            soccers = new HashSet<>();

            if (i > week / 2) {
                int l = this.teams.size() / 2;
                while (l > 0) {
                    soccers.add(new Soccer(rematch.get(k).getAwayTeam(), rematch.get(k).getHomeTeam()));
                    l--;
                    k++;
                }

                // checkSoccers.clear();
                this.soccerMap.put(i, soccers);
                System.out.println("i: " + i);
                continue;
            }

            // tempTeams = new ArrayList<>(teams);
            for (int j = 0; j < this.teams.size() / 2; j++) {
                homeTeamIndex = randomIndex(tempTeams.size());
                awayTeamIndex = randomIndex(tempTeams.size());
                soccer = new Soccer(tempTeams.get(homeTeamIndex), tempTeams.get(awayTeamIndex));
                while (homeTeamIndex == awayTeamIndex || playedMatches.contains(soccer.toString())) {
                    homeTeamIndex = randomIndex(tempTeams.size());
                    awayTeamIndex = randomIndex(tempTeams.size());
                    soccer = new Soccer(tempTeams.get(homeTeamIndex), tempTeams.get(awayTeamIndex));
                }
                soccers.add(soccer);
                // System.out.println("soccers");
                // System.out.println(soccers.toString());

                soccer = new Soccer(tempTeams.get(awayTeamIndex), tempTeams.get(homeTeamIndex));
                playedMatches.add(soccer.toString());

                tempTeams.remove(homeTeamIndex);
                tempTeams.remove(awayTeamIndex > homeTeamIndex ? awayTeamIndex - 1 : awayTeamIndex);
            }
            rematch.addAll(soccers);
            tempTeams.addAll(teams);

            this.soccerMap.put(i, soccers);

        }

        return this.soccerMap;
    }

    private int randomIndex(int size) {
        Random random = new Random();
        return random.nextInt(size);
    }
}
