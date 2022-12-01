package com.example.exercice_1;
import java.util.Random;

public class Fighter extends Robot{
    public Fighter (String nom){
        super(nom);
    }
    @Override
    public String toString(){
        return nom;
    }

    @Override
    public void show() {
        System.out.println("Fighter "+nom);

    }

    public void fire(Fighter F){
        Random precision = new Random();
        if (precision.nextBoolean()==true) {
            F.pv -= 2;
            System.out.println("Fighter " + F.nom + " a ete touche par le Fighter " + this.nom);
        }
        else {
            System.out.println("Fighter " + this.nom + " a manque sa cible ");

        }
        System.out.println(this.nom +" Pv= " + this.pv);
        System.out.println(F.nom +" Pv= " + F.pv);
    }
    public static void fight(Fighter A, Fighter B){



        while (!B.isDead()&&!A.isDead()){
            if (A.isDead()==false) {
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
        if (B.isDead()==true){
            System.out.println("Winner is ");
            A.show();
        }

    }
}
