package com.java.encapsulation;
class WizardPlayer extends Player
{
    private int mana;
    private int spellPower;
    public WizardPlayer(String name, int health, int damage,int mana,int spellPower) {
        super(name, health, damage);
        this.mana=mana;
        this.spellPower=spellPower;
    }

    public int getMana() {
        return mana;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setMana(int mana) {
        if(mana>=0)
           this.mana = mana;
        else
            System.out.println("mana should be non negative");
    }
    public void castSpell(Player player,int damage)
    {
         attack(player,damage);
        System.out.println("Wizard player cast a spell on "+ player.toString());
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Player player1=new Player("David",100,0);
        Player player2=new Player("James",100,0);
        WizardPlayer wizPlayer=new WizardPlayer("Paul",100,0,70,30);
        player1.attack(player2,20);
        System.out.println("Player1 attacked Player2 with damage 20");
        System.out.println("Player2 took damage "+player2.getDamage());
        System.out.println("Player2 has remaining health of "+player2.getHealth());

        wizPlayer.castSpell(player2,15);
        System.out.println("Player2 took damage "+player2.getDamage());
        System.out.println("Player2 has remaining health of "+player2.getHealth());
    }
}
