package Moves;

import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public final class Stone_Edge extends PhysicalMove {
    public Stone_Edge() {
        super(Type.ROCK, 100, 80);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if (att.getStat(Stat.SPEED) / 512.0 * 3 > Math.random()) {
            return 2.0;
        } else {
            return 1.0;
        }
    }

    @Override
    protected String describe() {
        return "наносит удар противнику заточенным камнем";
    }
}
