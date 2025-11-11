package Moves;

import ru.ifmo.se.pokemon.*;

public final class Iron_Defence extends StatusMove {
    public Iron_Defence() {
        super(Type.STEEL, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pok) {
        pok.setMod(Stat.DEFENSE, +2);
    }

    @Override
    protected String describe() {
        return "использует железную защиту";
    }
}
