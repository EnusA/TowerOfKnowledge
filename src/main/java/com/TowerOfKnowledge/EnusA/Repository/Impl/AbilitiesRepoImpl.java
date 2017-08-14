package com.TowerOfKnowledge.EnusA.Repository.Impl;

import com.TowerOfKnowledge.EnusA.Domains.Abilities;
import com.TowerOfKnowledge.EnusA.Repository.AbilitiesRepository;
import com.TowerOfKnowledge.EnusA.Services.Impl.AbilitiesServiceImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by enusa on 2017/08/14.
 */
public class AbilitiesRepoImpl implements AbilitiesRepository{
    Map<String, Abilities> abilitiesList;
    private AbilitiesRepoImpl(){abilitiesList = new HashMap<String, Abilities>();}

    private static AbilitiesRepoImpl repository= null;
    public static AbilitiesRepoImpl getInstance(){
        if (repository==null)
            repository = new AbilitiesRepoImpl();
        return repository;
    }

    @Override
    public Abilities create(Abilities abilities){
        abilitiesList.put(abilities.getName(),abilities);
        Abilities savedAbilities = abilitiesList.get(abilities.getName());
        return savedAbilities;
    }

    @Override
    public Abilities read (String name){
        Abilities readAbilities = abilitiesList.get(name);
        return readAbilities;
    }

    @Override
    public Abilities update (Abilities abilities){
        abilitiesList.put(abilities.getName(),abilities);
        Abilities savedAbilities = abilitiesList.get(abilities.getName());
        return savedAbilities;
    }
    @Override
    public void delete(String name){abilitiesList.remove(name);}
}
