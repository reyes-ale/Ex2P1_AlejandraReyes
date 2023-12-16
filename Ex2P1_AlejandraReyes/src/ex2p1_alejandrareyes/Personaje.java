/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_alejandrareyes;

/**
 *
 * @author aleja
 */
public class Personaje {
    String Nombre;
    double HP;
    double MP;
    double AttackPoints;
    double DefensePoints;
    
    public Personaje(String nombre, double hp, double mp, double attackpoints, double defensepoints){
        this.Nombre=nombre;
        this.HP=hp;
        this.MP=mp;
        this.AttackPoints=attackpoints;
        this.DefensePoints=defensepoints;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public double getMP() {
        return MP;
    }

    public void setMP(double MP) {
        this.MP = MP;
    }

    public double getAttackPoints() {
        return AttackPoints;
    }

    public void setAttackPoints(double AttackPoints) {
        this.AttackPoints = AttackPoints;
    }

    public double getDefensePoints() {
        return DefensePoints;
    }

    public void setDefensePoints(double DefensePoints) {
        this.DefensePoints = DefensePoints;
    }
    

    @Override
    public String toString() {
        return  "Nombre= " + Nombre + "\nHP= " + HP + "\nMP= " + MP + "\nAttack P.= " + AttackPoints + "\nDefense P.= " + DefensePoints + "\n";
    }
    
           
    
}
