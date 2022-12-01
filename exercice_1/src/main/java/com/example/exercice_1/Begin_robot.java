package com.example.exercice_1;

public class Begin_robot extends Arena{

    public Begin_robot(String nom,int pv) {
        super(nom);
    }

    public static void main(String[] args) {
        Robot A = new Robot("D2R2");
        Robot B = new Robot("Data");

        Arena.fight(A,B);

        /*System.out.println("Robot "+bob);
        bob.show();*/
    }
}
