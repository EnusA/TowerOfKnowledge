package com.TowerOfKnowledge.EnusA.Repository.Impl;

import com.TowerOfKnowledge.EnusA.Domains.Enemy;
import com.TowerOfKnowledge.EnusA.Repository.EnemyRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by enusa on 2017/08/14.
 */
public class EnemyRepoImpl implements EnemyRepository{
    Map<String, Enemy> enemyTable;
    public EnemyRepoImpl(){enemyTable = new HashMap<String, Enemy>();}

    private static EnemyRepoImpl repository= null;
    public static EnemyRepoImpl getInstance(){
        if (repository==null)
            repository = new EnemyRepoImpl();
        return repository;
    }

    @Override
    public Enemy create(Enemy enemy){
        enemyTable.put(enemy.getEnemyId(),enemy);
        Enemy savedEnemy = enemyTable.get(enemy.getEnemyId());
        return savedEnemy;
    }

    @Override
    public Enemy read (String enemyId){
        Enemy readEnemy = enemyTable.get(enemyId);
        return readEnemy;
    }

    @Override
    public Enemy update(Enemy enemy){
        enemyTable.put(enemy.getEnemyId(),enemy);
        Enemy savedEnemy = enemyTable.get(enemy.getEnemyId());
        return savedEnemy;
    }
    @Override
    public void delete(String enemyId){enemyTable.remove(enemyId);}
}
