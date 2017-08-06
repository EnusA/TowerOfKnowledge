package com.TowerOfKnowledge.EnusA.Domains;

/**
 * Created by enusa on 2017/08/06.
 */
public class Questions {
    private String question;
    private String answer;
    private String id;
    private String category;
    private String decoy1;
    private String decoy2;
    private String decoy3;
    private Questions(){}

    public String getQuestion() {return question;}
    public String getAnswer() {return answer;}
    public String getId() {return id;}
    public String getCategory() {return category;}
    public String getDecoy1() {return decoy1;}
    public String getDecoy2() {return decoy2;}
    public String getDecoy3() {return decoy3;}

    public Questions(Builder builder){
        this.question = builder.question;
        this.answer = builder.answer;
        this.id = builder.id;
        this.category = builder.category;
        this.decoy1 = builder.decoy1;
        this.decoy2 = builder.decoy2;
        this.decoy3 = builder.decoy3;
    }
    public static class Builder{
        private String question;
        private String answer;
        private String id;
        private String category;
        private String decoy1;
        private String decoy2;
        private String decoy3;

        public Builder quesion(String value){
            this.question = value;
            return this;
        }
        public Builder answer(String value){
            this.answer = value;
            return this;
        }
        public Builder id(String value){
            this.id = value;
            return this;
        }
        public Builder category(String value){
            this.category = value;
            return this;
        }
        public Builder decoy1(String value){
            this.decoy1 = value;
            return this;
        }
        public Builder decoy2(String value){
            this.decoy2 = value;
            return this;
        }
        public Builder decoy3(String value){
            this.decoy3 = value;
            return this;
        }
        public Questions builder(){return new Questions(this);}
    }
}
