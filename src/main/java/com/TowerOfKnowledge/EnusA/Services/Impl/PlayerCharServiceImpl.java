package com.TowerOfKnowledge.EnusA.Services.Impl;

import com.TowerOfKnowledge.EnusA.Domains.PlayerCharacter;
import com.TowerOfKnowledge.EnusA.Repository.Impl.PlayerCharRepoImpl;
import com.TowerOfKnowledge.EnusA.Services.PlayerCharService;

/**
 * Created by enusa on 2017/08/14.
 */
public class PlayerCharServiceImpl implements PlayerCharService{
    private static PlayerCharServiceImpl service= null;

    PlayerCharRepoImpl repository = PlayerCharRepoImpl.getInstance();
    public static PlayerCharServiceImpl getInstance(){
        if (service==null)
            service = new PlayerCharServiceImpl();
        return service;
    }

    @Override
    public PlayerCharacter create(PlayerCharacter playerChar){return repository.create(playerChar);}
    @Override
    public PlayerCharacter read (String charName){return  repository.read(charName);}
    @Override
    public PlayerCharacter update(PlayerCharacter playerChar){return repository.update(playerChar);}
    @Override
    public void delete (String charName){repository.delete(charName);}
}
