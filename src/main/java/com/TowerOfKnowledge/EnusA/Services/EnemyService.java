package com.TowerOfKnowledge.EnusA.Services;

import com.TowerOfKnowledge.EnusA.Domains.Enemy;

/**
 * Created by enusa on 2017/08/14.
 */
public interface EnemyService {
    Enemy create(Enemy enemy);
    Enemy read(String enemyId);
    Enemy update(Enemy enemy);
    void delete(String enemyId);
}
