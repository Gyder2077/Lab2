package Pokemons;

import Moves.Poison_Jab;
import ru.ifmo.se.pokemon.*;

public final class Infernape extends Monferno{
    public Infernape(String name, int level) {
        super(name, level);
        super.setType(Type.FIRE, Type.FIGHTING);
        super.setStats(76, 104, 71, 104, 71, 108);

        Poison_Jab poisonJab = new Poison_Jab();

        super.addMove(poisonJab);
    }
}
