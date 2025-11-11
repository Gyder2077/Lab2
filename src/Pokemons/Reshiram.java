package Pokemons;

import ru.ifmo.se.pokemon.*;
import Moves.*;

public final class Reshiram extends Pokemon {
    public Reshiram(String name, int level) {
        super(name, level);
        this.setType(Type.DRAGON, Type.FIRE);
        this.setStats(100, 120, 100, 150, 120, 90);

        Draco_Meteor dracoMeteor = new Draco_Meteor();
        Roost roost = new Roost();
        Draco_Claw dracoClaw = new Draco_Claw();
        Stone_Edge stoneEdge = new Stone_Edge();

        this.setMove(dracoMeteor, roost, dracoClaw, stoneEdge);
    }
}
