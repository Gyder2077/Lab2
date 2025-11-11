package Pokemons;

import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Sandygast extends Pokemon {
    public Sandygast(String name, int level) {
        super(name, level);
        this.setType(Type.GHOST, Type.GROUND);
        this.setStats(55, 55, 80, 70, 45, 15);

        Rock_Slide rockSlide = new Rock_Slide();
        Iron_Defence ironDefence = new Iron_Defence();
        Double_Team doubleTeam = new Double_Team();

        this.setMove(rockSlide, ironDefence, doubleTeam);
    }
}
