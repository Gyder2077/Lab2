package Moves;

import ru.ifmo.se.pokemon.*;

public final class Roost extends StatusMove {
    public Roost() {
        super(Type.FLYING, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pok) {
        double max_hp = pok.getStat(Stat.HP);
        pok.setMod(Stat.HP, -(int)(max_hp / 2));
    }

    @Override
    protected String describe() {
        return "восстанавливает половину максимального HP";
    }
}
