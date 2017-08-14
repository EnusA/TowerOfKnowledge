package com.TowerOfKnowledge.EnusA.Repository;

import com.TowerOfKnowledge.EnusA.Domains.Abilities;

/**
 * Created by enusa on 2017/08/14.
 */
public interface AbilitiesRepository {
    Abilities create(Abilities abilities);
    Abilities read (String name);
    Abilities update (Abilities abilities);
    void delete(String name);
}
