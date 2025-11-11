package Moves;

import ru.ifmo.se.pokemon.*;

public final class Poison_Jab extends PhysicalMove {
    public Poison_Jab() {
        super(Type.POISON, 80, 100);
    }
    boolean eff = false;

    @Override
    protected void applyOppEffects(Pokemon pok) {
        if (Math.random() <= 0.3) {
            Effect.poison(pok);
            eff = true;
        }
    }

    @Override
    protected String describe() {
        if (eff) {return "бьет соперника и отравляет его";}
        return "бьет соперника";
    }
}
