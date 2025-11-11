package Moves;

import ru.ifmo.se.pokemon.*;

public class Leer extends StatusMove {
    public Leer() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pok) {
        Effect eff = new Effect().stat(Stat.DEFENSE, -1);
        pok.addEffect(eff);
    }

    @Override
    protected String describe() {
        return "снижает защиту врага";
    }
}
