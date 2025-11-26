package Moves;

import ru.ifmo.se.pokemon.*;

public final class Draco_Meteor extends SpecialMove {
    public Draco_Meteor() {
        super(Type.DRAGON, 130, 90);
    }

    @Override
    protected void applySelfEffects(Pokemon pok) {
        pok.setMod(Stat.SPECIAL_ATTACK, -2);
    }


    @Override
    protected String describe() {
        return "призывает метеор";
    }
}