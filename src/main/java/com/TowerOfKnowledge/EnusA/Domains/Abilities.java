package com.TowerOfKnowledge.EnusA.Domains;

/**
 * Created by enusa on 2017/08/06.
 */
public class Abilities {
    private String name;
    private String description;
    private String element;
    private String category;
    private int damage;
    private int modifier;
    private Abilities(){}

    public String getName() {return name;}
    public String getDescription() {return description;}
    public String getElement() {return element;}
    public String getCategory() {return category;}
    public int getDamage() {return damage;}
    public int getModifier() {return modifier;}

    public Abilities(Builder builder){
        this.name = builder.name;
        this.description = builder.description;
        this.element = builder.element;
        this.category = builder.category;
        this.damage = builder.damage;
        this.modifier = builder.modifier;
    }
    public static class Builder{
        private String name;
        private String description;
        private String element;
        private String category;
        private int damage;
        private int modifier;

        public Builder name(String value){
            this.name = value;
            return this;
        }
        public Builder description(String value){
            this.description = value;
            return this;
        }
        public Builder element(String value){
            this.element = value;
            return this;
        }
        public Builder category(String value){
            this.category = value;
            return this;
        }
        public Builder damage(int value){
            this.damage = value;
            return this;
        }
        public Builder modifier(int value) {
            this.modifier = value;
            return this;
        }
        public Abilities builder(){return new Abilities(this);}
    }
}
