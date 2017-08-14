package com.TowerOfKnowledge.EnusA.Repository.Impl;

import com.TowerOfKnowledge.EnusA.Domains.Questions;
import com.TowerOfKnowledge.EnusA.Factories.QuestionsFactory;
import com.TowerOfKnowledge.EnusA.Repository.QuestionsRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by enusa on 2017/08/14.
 */
public class QuestionsRepoImplTest {
    QuestionsRepository repository;
    Map<String,String> values;
    @Before
    public void setUp()throws Exception{
        repository = QuestionsRepoImpl.getInstance();
        values= new HashMap<String, String>();
        values.put("quesion","What was the name of the man who attemped to conquer Germany?");
        values.put("answer","Adolf Hitler");
        values.put("id","h1t1");
        values.put("category","History");
        values.put("decoy1","Vladimeer Putin");
        values.put("decoy2","George Bush");
        values.put("decoy3","Donald Trump");
    }
    @Test
    public void create() throws Exception {
        Questions questions = QuestionsFactory.getQuestion(values);
        repository.create(questions);
        assertEquals("Adolf Hitler",questions.getAnswer());
    }

    @Test
    public void read() throws Exception {
        Questions readQuestion = repository.read("h1t1");
        assertEquals("Adolf Hitler",readQuestion.getAnswer());
    }

    @Test//had some trouble with this one
    public void update() throws Exception {
        Questions question = repository.read("h1t1");
        Questions newQuestion = new Questions.Builder()
                .quesion(values.get("question"))
                .answer(values.get("answer"))
                .id(values.get("id"))
                .category(values.get("category"))
                .decoy1(values.get("decoy1"))
                .decoy2(values.get("decoy2"))
                .decoy3(values.get("decoy3"))
                .builder();
        repository.update(newQuestion);
        Questions updateQuestion =repository.read("h1t1");
        assertEquals("Gavin Free", updateQuestion.getAnswer());
    }

    @Test
    public void delete() throws Exception {
        repository.delete("h1t1");
        Questions question = repository.read("h1t1");
        assertNull(question);
    }

}