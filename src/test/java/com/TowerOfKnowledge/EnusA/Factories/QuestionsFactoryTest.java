package com.TowerOfKnowledge.EnusA.Factories;

import com.TowerOfKnowledge.EnusA.Domains.Questions;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by enusa on 2017/08/14.
 */
public class QuestionsFactoryTest {
    Map<String,String> values;
    @Before
    public void setUp()throws Exception{
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
    public void question() throws Exception {
        Questions questions = QuestionsFactory.getQuestion(values);
        assertEquals("Adolf Hitler",questions.getAnswer());

    }

}