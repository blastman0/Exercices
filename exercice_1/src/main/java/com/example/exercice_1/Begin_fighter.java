package com.example.exercice_1;

public class Begin_fighter extends Robot{

    public Begin_fighter(String nom,int pv) {
        super(nom);
    }

    public static void main(String[] args) {
        Fighter A = new Fighter("Dan");
        Fighter B = new Fighter("Bob");

        Fighter.fight(A,B);

        /*System.out.println("Robot "+bob);
        bob.show();*/
    }
}