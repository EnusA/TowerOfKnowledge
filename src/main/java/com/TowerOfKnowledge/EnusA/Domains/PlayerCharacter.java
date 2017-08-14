package com.TowerOfKnowledge.EnusA.Domains;

/**
 * Created by enusa on 2017/08/14.
 */
public class PlayerCharacter {
    private String charName;
    private int level;
    private int strength;
    private int intelligence;
    private int defence;
    private String username;

    private PlayerCharacter(){}

    public String getCharName() {return charName;}
    public int getLevel() {return level;}
    public int getStrength() {return strength;}
    public int getIntelligence() {return intelligence;}
    public int getDefence() {return defence;}
    public String getUsername() {return username;}

    public PlayerCharacter(PlayerCharacter.Builder builder){
        this.charName = builder.charName;
        this.level = builder.level;
        this.strength = builder.strength;
        this.intelligence = builder.intelligence;
        this.defence = builder.defence;
        this.username = builder.username;
    }

    public static class Builder{
        private String charName;
        private int level;
        private int strength;
        private int intelligence;
        private int defence;
        private String username;

        public PlayerCharacter.Builder charName(String value){
            this.charName = value;
            return this;
        }
        public PlayerCharacter.Builder level(int value){
            this.level = value;
            return this;
        }
        public PlayerCharacter.Builder strength(int value){
            this.strength = value;
            return this;
        }
        public PlayerCharacter.Builder intelligence(int value){
            this.intelligence = value;
            return this;
        }
        public PlayerCharacter.Builder defence(int value){
            this.defence = value;
            return this;
        }
        public PlayerCharacter.Builder username(String value){
            this.username = value;
            return this;
        }

        public PlayerCharacter builder(){return new PlayerCharacter(this);}
    }
}
