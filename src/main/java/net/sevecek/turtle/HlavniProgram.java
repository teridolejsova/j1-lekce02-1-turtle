package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;
        zofka = new Turtle();

        for (int i = 0; i <2 ; i++) {



        zofka.turnLeft(45);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(45);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.penUp();
        zofka.move(200);
        zofka.penDown();
        zofka.turnRight(90);

        }

        /*
        zofka.penDown();
        zofka.turnRight(90);
        zofka.turnLeft(45);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(45);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.penUp();
    */
    }

}
