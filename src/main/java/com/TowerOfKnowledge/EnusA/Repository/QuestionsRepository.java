package com.TowerOfKnowledge.EnusA.Repository;

import com.TowerOfKnowledge.EnusA.Domains.Questions;

/**
 * Created by enusa on 2017/08/14.
 */
public interface QuestionsRepository {
    Questions create(Questions questions);
    Questions read(String id);
    Questions update(Questions questions);
    void delete(String id);
}
