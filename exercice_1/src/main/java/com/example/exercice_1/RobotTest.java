package com.example.exercice_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTest {

    @Test
    public void testToString() {
        Robot T = new Robot("Atom");
        assertEquals("Atom",T.nom);
    }

    @Test
    public void fire() {
        Robot T = new Robot("Atom");
        Robot V = new Robot("SHi");
        T.pv-=2;
        assertEquals(8,T.pv);
    }



    @Test
    public void isDead() {
    }
}