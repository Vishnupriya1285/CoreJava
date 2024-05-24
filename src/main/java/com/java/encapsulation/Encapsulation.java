package com.java.encapsulation;

 class Player {
    private String name;
    private int health;
    private int damage;
    public Player(String name, int health, int damage)
    {
        this.name=name;
        this.health=health;
        this.damage=damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void setHealth(int health) {
        if(health>=0)
           this.health = health;
        else
            System.out.println("Please provide a non negative number for health!");
    }

     @Override
     public String toString() {
         return "Player{" +
                 "name='" + name + '\'' +
                 '}';
     }

     public void takeDamage(int damage)
    {
        if(damage>0)
        {
            this.damage=damage;
            this.health=health-damage;
        }
        else
            System.out.println("damage should be greater than zero!");
    }
    public void attack(Player player, int damage)
    {
        player.takeDamage(damage);
    }
}

public class Encapsulation
{
    public static void main(String[] args) {
        Player player1=new Player("Ram",100,0);
        Player player2=new Player("Balu",100,0);
        player1.attack(player2,20);
        System.out.println("Player1 attacked Player2 with damage 20");
        System.out.println("Player2 took damage "+player2.getDamage());
        System.out.println("Player2 has remaining health of "+player2.getHealth());
    }
}
