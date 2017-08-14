package com.TowerOfKnowledge.EnusA.Services;

import com.TowerOfKnowledge.EnusA.Domains.Questions;

/**
 * Created by enusa on 2017/08/14.
 */
public interface QuestionsService {
    Questions create(Questions questions);
    Questions read(String id);
    Questions update(Questions questions);
    void delete(String id);
}
