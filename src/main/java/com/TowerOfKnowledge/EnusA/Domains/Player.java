package com.TowerOfKnowledge.EnusA.Domains;

/**
 * Created by enusa on 2017/08/06.
 */
public class Player {
    private String fullName;
    private String username;
    private String password;
    private String email;
    private int rank;
    private Player(){}


    public String getFullName() {return fullName;}
    public String getUsername() {return username;}
    public String getPassword() {return password;}
    public String getEmail() {return email;}
    public int getrank() {return rank;}

    public Player(Builder builder){
        this.fullName = builder.fullName;
        this.username = builder.username;
        this.password = builder.password;
        this.email = builder.email;
        this.rank = builder.rank;
    }

    public static class Builder{
        private String fullName;
        private String username;
        private String password;
        private String email;
        private int rank;

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
        public Builder rank(int value){
            this.rank = value;
            return this;
        }

        public Player builder(){return new Player(this);}
    }
}
