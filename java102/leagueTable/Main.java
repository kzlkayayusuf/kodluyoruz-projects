package java102.leagueTable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<String> teams = Arrays.asList("Beşiktaş", "Galatasaray", "Fenerbahçe",
                "Bursaspor", "Trabzonspor",
                "Boluspor", "Erzurum");

        // List<String> teams = Arrays.asList("Beşiktaş", "Galatasaray", "Fenerbahçe");
        FixtureBuilder fixtureBuilder = new FixtureBuilder(teams);
        Map<Integer, Set<Soccer>> soccerMap = fixtureBuilder.build();

        for (Map.Entry<Integer, Set<Soccer>> entry : soccerMap.entrySet()) {
            System.out.println("Week " + entry.getKey());

            for (Soccer soccer : entry.getValue()) {
                System.out.println(soccer.toString());
            }
            System.out.println();
        }

    }

}
