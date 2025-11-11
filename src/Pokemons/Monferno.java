package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Monferno extends Chimchar{
    public Monferno(String name, int level) {
        super(name, level);
        super.setType(Type.FIRE, Type.FIGHTING);
        super.setStats(64, 78, 52, 78, 52, 81);

        Slack_Off slackOff = new Slack_Off();

        super.addMove(slackOff);
    }
}
