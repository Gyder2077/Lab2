package Moves;


import ru.ifmo.se.pokemon.*;

public final class Flame_Charge extends PhysicalMove {
    public Flame_Charge() {
        super(Type.FIRE, 50, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pok) {
        Effect eff = new Effect().stat(Stat.SPEED, +1);
        pok.addEffect(eff);
    }

    @Override
    protected String describe() {
        return "призывает пламенный заряд";
    }
}
