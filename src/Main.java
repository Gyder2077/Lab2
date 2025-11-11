import ru.ifmo.se.pokemon.*;
import Pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle bat = new Battle();
        Reshiram pok1 = new Reshiram("Fershiram", 50);
        Sandygast pok2 = new Sandygast("Strumic", 50);
        Palossand pok3 = new Palossand("Palace", 50);
        Chimchar pok4 = new Chimchar("Chimrik", 50);
        Monferno pok5 = new Monferno("Burnkey", 50);
        Infernape pok6 = new Infernape("Vexel", 50);
        bat.addAlly(pok1);
        bat.addAlly(pok2);
        bat.addAlly(pok3);
        bat.addFoe(pok4);
        bat.addFoe(pok5);
        bat.addFoe(pok6);

        bat.go();
    }
}
