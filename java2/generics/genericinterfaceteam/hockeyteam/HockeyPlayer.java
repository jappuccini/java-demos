package java2.generics.genericinterfaceteam.hockeyteam;

import java2.generics.genericinterfaceteam.Player;

public class HockeyPlayer implements Player {
    public final String name;

    public HockeyPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
