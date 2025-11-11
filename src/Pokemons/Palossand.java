package Pokemons;

import ru.ifmo.se.pokemon.*;
import Moves.*;

public final class Palossand extends Sandygast{
    public Palossand(String name, int level) {
        super(name, level);
        super.setType(Type.GHOST, Type.GROUND);
        super.setStats(85, 75, 110, 100, 75, 35);

        Sludge_Bomb sludgeBomb = new Sludge_Bomb();

        super.addMove(sludgeBomb);
    }
}
