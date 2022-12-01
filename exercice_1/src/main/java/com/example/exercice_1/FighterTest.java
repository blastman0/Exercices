package com.example.exercice_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FighterTest {

    @Test
    public void testToString() {
        Fighter T = new Fighter("Jim");
        assertEquals("Jim",T.nom);
    }

    @Test
    public void fight() {
        Fighter T = new Fighter("Louis");
        Fighter V = new Fighter("Jean");
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
            assertFalse(V.isDead());
        }
        else if (V.isDead()==true){
            System.out.println("Winner is ");
            T.show();
            assertFalse(T.isDead());
        }
    }
}