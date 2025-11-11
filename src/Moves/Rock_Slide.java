package Moves;

import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class Rock_Slide extends PhysicalMove {
    public Rock_Slide() {
        super(Type.ROCK, 70, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon pok) {
        if (Math.random() <= 0.3) {
            Effect.flinch(pok);
        }
    }

    @Override
    protected String describe() {
        return "призывает камнепад";
    }
}
