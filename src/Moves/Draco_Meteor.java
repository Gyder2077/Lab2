package Moves;

import ru.ifmo.se.pokemon.*;

public final class Draco_Meteor extends SpecialMove {
    public Draco_Meteor() {
        super(Type.DRAGON, 130, 90);
    }

    @Override
    protected void applySelfEffects(Pokemon pok) {
        Effect eff = new Effect().stat(Stat.SPECIAL_ATTACK, -2);
        pok.addEffect(eff);
    }


    @Override
    protected String describe() {
        return "бьет соперника лапой";
    }
}