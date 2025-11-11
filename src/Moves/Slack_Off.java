package Moves;

import ru.ifmo.se.pokemon.*;

public final class Slack_Off extends StatusMove {
    public Slack_Off() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pok) {
        double max_hp = pok.getStat(Stat.HP);
        double cur_hp = pok.getHP();
        double heal = max_hp * 0.5;
        if (cur_hp >= heal) {
            pok.setMod(Stat.HP, -(int)heal);
        } else {
            pok.setMod(Stat.HP, -(int)cur_hp);
        }
    }

    @Override
    protected String describe() {
        return "отдыхает";
    }
}
