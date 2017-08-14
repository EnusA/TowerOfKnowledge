package com.TowerOfKnowledge.EnusA.Services.Impl;

import com.TowerOfKnowledge.EnusA.Domains.Enemy;
import com.TowerOfKnowledge.EnusA.Repository.EnemyRepository;
import com.TowerOfKnowledge.EnusA.Repository.Impl.EnemyRepoImpl;
import com.TowerOfKnowledge.EnusA.Services.EnemyService;

/**
 * Created by enusa on 2017/08/14.
 */
public class EnemyServiceImpl implements EnemyService{
    private static EnemyServiceImpl service= null;

    EnemyRepository repository = EnemyRepoImpl.getInstance();
    public static EnemyServiceImpl getInstance(){
        if (service==null)
            service = new EnemyServiceImpl();
        return service;
    }

    @Override
    public Enemy create(Enemy enemy){return repository.create(enemy);}
    @Override
    public Enemy read (String enemyid){return  repository.read(enemyid);}
    @Override
    public Enemy update(Enemy enemy){return repository.update(enemy);}
    @Override
    public void delete (String enemyId){repository.delete(enemyId);}
}
