package com.TowerOfKnowledge.EnusA.Services;

import com.TowerOfKnowledge.EnusA.Domains.Abilities;

/**
 * Created by enusa on 2017/08/14.
 */
public interface AbilitiesService {
    Abilities create(Abilities abilities);
    Abilities read (String name);
    Abilities update (Abilities abilities);
    void delete(String name);
}
