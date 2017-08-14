package com.TowerOfKnowledge.EnusA.Repository.Impl;

import com.TowerOfKnowledge.EnusA.Domains.Questions;
import com.TowerOfKnowledge.EnusA.Repository.QuestionsRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by enusa on 2017/08/14.
 */
public class QuestionsRepoImpl implements QuestionsRepository{
    Map<String, Questions> questionList;
    public QuestionsRepoImpl(){questionList = new HashMap<String, Questions>();}

    private static QuestionsRepoImpl repository= null;
    public static QuestionsRepoImpl getInstance(){
        if (repository==null)
            repository = new QuestionsRepoImpl();
        return repository;
    }

    @Override
    public Questions create(Questions questions){
        questionList.put(questions.getId(),questions);
        Questions savedQuestions = questionList.get(questions.getId());
        return savedQuestions;
    }

    @Override
    public Questions read (String id){
        Questions readQuestion = questionList.get(id);
        return readQuestion;
    }

    @Override
    public Questions update (Questions questions){
        questionList.put(questions.getId(),questions);
        Questions savedQuestions = questionList.get(questions.getId());
        return savedQuestions;
    }
    @Override
    public void delete(String id){questionList.remove(id);}

}
