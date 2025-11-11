package Moves;

import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public final class Sludge_Bomb extends SpecialMove {
    public Sludge_Bomb() {
        super(Type.POISON, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pok) {
        if (Math.random() <= 0.3) {
            Effect.poison(pok);
        }
    }

    @Override
    protected String describe() {
        return "использует шламовую бомбу";
    }
}
