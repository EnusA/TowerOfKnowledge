package com.TowerOfKnowledge.EnusA.Domains;

/**
 * Created by enusa on 2017/08/06.
 */
public class Enemy {
    private String name;
    private String enemyId;
    private String attack;
    private int level;
    private int fireRes;
    private int iceRes;
    private int poisonRes;
    private int thunderRes;
    private int strength;
    private int intelligence;
    private int defence;
    private Enemy(){}

    public String getName() {return name;}
    public String getEnemyId() {return enemyId;}
    public String getAttack() {return attack;}
    public int getFireRes() {return fireRes;}
    public int getIceRes() {return iceRes;}
    public int getPoisonRes() {return poisonRes;}
    public int getThunderRes() {return thunderRes;}
    public int getStrength() {return strength;}
    public int getIntelligence() {return intelligence;}
    public int getDefence() {return defence;}
    public int getLevel() {return level;}

    public Enemy(Builder builder){

        this.name = builder.name;
        this.enemyId = builder.enemyId;
        this.attack = builder.attack;
        this.level = builder.level;
        this.fireRes = builder.fireRes;
        this.iceRes = builder.iceRes;
        this.poisonRes = builder.poisonRes;
        this.thunderRes = builder.thunderRes;
        this.strength = builder.strength;
        this.intelligence = builder.intelligence;
        this.defence = builder.defence;
    }

    public static class Builder{
        private String name;
        private String enemyId;
        private String attack;
        private int level;
        private int fireRes;
        private int iceRes;
        private int poisonRes;
        private int thunderRes;
        private int strength;
        private int intelligence;
        private int defence;

        public Builder name(String value){
            this.name = value;
            return this;
        }
        public Builder enemyId(String value){
            this.enemyId = value;
            return this;
        }
        public Builder attack(String value){
            this.attack = value;
            return this;
        }
        public Builder level(int value){
            this.level = value;
            return this;
        }
        public Builder fireRes(int value){
            this.fireRes = value;
            return this;
        }
        public Builder iceRes(int value){
            this.iceRes = value;
            return this;
        }
        public Builder poisonRes(int value){
            this.poisonRes = value;
            return this;
        }
        public Builder thunderRes(int value){
            this.thunderRes = value;
            return this;
        }
        public Builder strength(int value){
            this.strength = value;
            return this;
        }
        public Builder intelligence(int value){
            this.intelligence = value;
            return this;
        }
        public Builder defence(int value){
            this.defence = value;
            return this;
        }


        public Enemy builder(){return new Enemy(this);}
    }
}
