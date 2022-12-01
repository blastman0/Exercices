package com.example.exercice_1;

public class Robot {
    protected String nom;
    protected int pv;

    /*public Robot(){
        this.nom="";
        this.pv=10;
    }*/
    public Robot(String nom){
        this.nom=nom;
        this.pv=10;
    }
    /*public Robot(String nom,int pv){
        this.nom=nom;
        this.pv=pv;
    }

    public int getPv() {
        return pv;
    }*/

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPv(int pv) {
        this.pv = pv;
    }
    @Override
    public String toString(){
        return nom;
    }

    public void fire(Robot B){
        B.pv-=2;
        System.out.println("Robot " +B.nom+" a ete touche par le Robot "+this.nom);
    }
    public boolean isDead(){
        if(this.pv == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public void show() {
        System.out.println("Robot "+nom);

    }
}