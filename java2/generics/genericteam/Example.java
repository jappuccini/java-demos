package java2.generics.genericteam;

import java2.generics.genericteam.footballteam.FootballPlayer;
import java2.generics.genericteam.hockeyteam.HockeyPlayer;

public class Example {

    public static void main(String[] args) {

        Team<HockeyPlayer> wildWings = new Team<>("Wild Wings");
        wildWings.addPlayer(new HockeyPlayer("Mirco"));
        wildWings.printTeamName();
        wildWings.printPlayerNames();

        Team<FootballPlayer> scFreiburg = new Team<>("SC Freiburg");
        scFreiburg.addPlayer(new FootballPlayer("Steffen"));
        scFreiburg.printTeamName();
        scFreiburg.printPlayerNames();

    }
}
