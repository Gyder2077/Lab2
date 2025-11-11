package Pokemons;

import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Chimchar extends Pokemon {
    public Chimchar(String name, int level) {
        super(name, level);
        super.setType(Type.FIRE);
        super.setStats(44, 58, 44, 58, 44, 61);

        Flame_Charge flameCharge = new Flame_Charge();
        Leer leer = new Leer();

        this.setMove(flameCharge, leer);
    }
}
