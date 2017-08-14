package com.TowerOfKnowledge.EnusA.Services.Impl;

import com.TowerOfKnowledge.EnusA.Domains.Questions;
import com.TowerOfKnowledge.EnusA.Repository.Impl.QuestionsRepoImpl;
import com.TowerOfKnowledge.EnusA.Repository.QuestionsRepository;
import com.TowerOfKnowledge.EnusA.Services.QuestionsService;

/**
 * Created by enusa on 2017/08/14.
 */
public class QuestionsServiceImpl implements QuestionsService{

    private static QuestionsServiceImpl service= null;

    QuestionsRepository repository = QuestionsRepoImpl.getInstance();
    public static QuestionsServiceImpl getInstance(){
        if (service==null)
            service = new QuestionsServiceImpl();
        return service;
    }
    @Override
    public Questions create(Questions questions){return repository.create(questions);}
    @Override
    public Questions read (String id){return  repository.read(id);}
    @Override
    public Questions update(Questions questions){return repository.update(questions);}
    @Override
    public void delete (String id){repository.delete(id);}
}
