package com.example.exercice_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArenaTest {

    @Test
    public void fight() {
        Robot T = new Robot("Atom");
        Robot V = new Robot("Vision");
        while (!V.isDead()&&!T.isDead()){

            if (T.isDead()==false){
                T.fire(V);
            }
            if (V.isDead()==false){
                V.fire(T);
            }
        }
        if (T.isDead()==true){
            System.out.println("Winner is ");
            V.show();
            assertFalse(V.isDead()); /* On vérifie ici que le vainqueur n'est pas mort*/
        }
        else if (V.isDead()==true){
            System.out.println("Winner is ");
            T.show();
            assertFalse(T.isDead());
        }
    }
}