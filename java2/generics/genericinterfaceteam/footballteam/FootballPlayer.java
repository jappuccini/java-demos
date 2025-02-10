package java2.generics.genericinterfaceteam.footballteam;

import java2.generics.genericinterfaceteam.Player;

public class FootballPlayer implements Player {
  public final String name;

  public FootballPlayer(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
