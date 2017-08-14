package com.TowerOfKnowledge.EnusA.Services.Impl;

import com.TowerOfKnowledge.EnusA.Domains.Abilities;
import com.TowerOfKnowledge.EnusA.Repository.AbilitiesRepository;
import com.TowerOfKnowledge.EnusA.Repository.Impl.AbilitiesRepoImpl;
import com.TowerOfKnowledge.EnusA.Services.AbilitiesService;

/**
 * Created by enusa on 2017/08/14.
 */
public class AbilitiesServiceImpl  implements AbilitiesService{

    private static AbilitiesServiceImpl service = null;

    AbilitiesRepository repository = AbilitiesRepoImpl.getInstance();
    public static AbilitiesServiceImpl getInstance(){
        if(service == null)
            service = new AbilitiesServiceImpl();
        return service;
    }
    @Override
    public Abilities create(Abilities abilities){return repository.create(abilities);}
    @Override
    public Abilities read (String name){return  repository.read(name);}
    @Override
    public Abilities update(Abilities abilities){return repository.update(abilities);}
    @Override
    public void delete (String name){repository.delete(name);}
}
