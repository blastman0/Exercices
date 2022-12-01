package com.example.exercice_1;
public class Arena extends Robot{
    /*Robot A = new Robot();
    Robot B = new Robot();
    Robot C = new Robot();*/
    public Arena(String nom){
        super(nom);
    }

    public static void fight(Robot A, Robot B){



        while (!B.isDead()&&!A.isDead()){

            if (A.isDead()==false){
                A.fire(B);
            }
            if (B.isDead()==false){
                B.fire(A);
            }
        }
        if (A.isDead()==true){
            System.out.println("Winner is ");
            B.show();
        }
        else if (B.isDead()==true){
            System.out.println("Winner is ");
            A.show();
        }

    }
}
