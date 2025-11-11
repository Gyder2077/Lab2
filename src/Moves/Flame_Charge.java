package Moves;

import ru.ifmo.se.pokemon.*;

public final class Flame_Charge extends PhysicalMove {
    public Flame_Charge() {
        super(Type.FIRE, 50, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pok) {
        pok.setMod(Stat.SPEED, +1);
    }

    @Override
    protected String describe() {
        return "призывает пламенный заряд";
    }
}
