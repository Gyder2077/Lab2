package Moves;

import ru.ifmo.se.pokemon.*;

public final class Draco_Claw extends PhysicalMove {
    public Draco_Claw() {
        super(Type.DRAGON, 80, 100);
    }

    @Override
    protected String describe() {
        return "бьет соперника лапой";
    }
}
