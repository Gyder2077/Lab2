package Moves;

import ru.ifmo.se.pokemon.*;

public final class Double_Team extends StatusMove {
    public Double_Team(){
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pok) {
        Effect eff = new Effect().stat(Stat.EVASION, +1);
        pok.addEffect(eff);
    }

    @Override
    protected String describe() {
        return "увеличивает свою уворотливость";
    }
}
