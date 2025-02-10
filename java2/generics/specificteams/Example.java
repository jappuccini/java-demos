package java2.generics.specificteams;

import java2.generics.specificteams.footballteam.FootballPlayer;
import java2.generics.specificteams.footballteam.FootballTeam;
import java2.generics.specificteams.hockeyteam.HockeyPlayer;
import java2.generics.specificteams.hockeyteam.HockeyTeam;

public class Example {

  public static void main(String[] args) {

    HockeyTeam wildWings = new HockeyTeam("Wild Wings");
    wildWings.addPlayer(new HockeyPlayer("Mirco"));
    wildWings.printTeamName();
    wildWings.printPlayerNames();

    FootballTeam scFreiburg = new FootballTeam("Sc Freiburg");
    scFreiburg.addPlayer(new FootballPlayer("Steffen"));
    scFreiburg.printTeamName();
    scFreiburg.printPlayerNames();
  }
}
