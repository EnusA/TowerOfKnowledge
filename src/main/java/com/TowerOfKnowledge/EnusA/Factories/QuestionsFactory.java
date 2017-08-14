package com.TowerOfKnowledge.EnusA.Factories;

import com.TowerOfKnowledge.EnusA.Domains.Questions;

import java.util.Map;

/**
 * Created by enusa on 2017/08/14.
 */
public class QuestionsFactory {
    public static Questions getQuestion(Map<String,String> values){
        Questions questions = new Questions.Builder()
            .quesion(values.get("question"))
            .answer(values.get("answer"))
            .id(values.get("id"))
            .category(values.get("category"))
            .decoy1(values.get("decoy1"))
            .decoy2(values.get("decoy2"))
            .decoy3(values.get("decoy3"))
            .builder();
        return questions;
    }
}
