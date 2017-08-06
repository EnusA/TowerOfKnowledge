package com.TowerOfKnowledge.EnusA.Domains;

/**
 * Created by enusa on 2017/08/06.
 */
public class Player {
    private String fullName;
    private String username;
    private String password;
    private String email;
    private int level;
    private int strength;
    private int intelligence;
    private int defence;
    private Player(){}


    public String getFullName() {return fullName;}
    public String getUsername() {return username;}
    public String getPassword() {return password;}
    public String getEmail() {return email;}
    public int getLevel() {return level;}
    public int getStrength() {return strength;}
    public int getIntelligence() {return intelligence;}
    public int getDefence() {return defence;}

    public Player(Builder builder){
        this.fullName = builder.fullName;
        this.username = builder.username;
        this.password = builder.password;
        this.email = builder.email;
        this.level = builder.level;
        this.strength = builder.strength;
        this.intelligence = builder.intelligence;
        this.defence = builder.defence;
    }

    public static class Builder{
        private String fullName;
        private String username;
        private String password;
        private String email;
        private int level;
        private int strength;
        private int intelligence;
        private int defence;
        public Builder fullName(String value){
            this.fullName = value;
            return this;
        }
        public Builder username(String value){
            this.username = value;
            return this;
        }
        public Builder password(String value){
            this.password = value;
            return this;
        }
        public Builder email(String value){
            this.email = value;
            return this;
        }
        public Builder level(int value){
            this.level = value;
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



        public Player builder(){return new Player(this);}
    }
}
