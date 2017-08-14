package com.TowerOfKnowledge.EnusA.Repository.Impl;

import com.TowerOfKnowledge.EnusA.Domains.PlayerCharacter;
import com.TowerOfKnowledge.EnusA.Repository.PlayerCharRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by enusa on 2017/08/14.
 */
public class PlayerCharRepoImpl implements PlayerCharRepository{
    Map<String, PlayerCharacter> playerCharTable;
    public PlayerCharRepoImpl(){playerCharTable = new HashMap<String, PlayerCharacter>();}
    private static PlayerCharRepoImpl repository= null;
    public static PlayerCharRepoImpl getInstance(){
        if (repository==null)
            repository = new PlayerCharRepoImpl();
        return repository;
    }

    @Override
    public PlayerCharacter create(PlayerCharacter playerChar){
        playerCharTable.put(playerChar.getCharName(),playerChar);
        PlayerCharacter savedCharacter = playerCharTable.get(playerChar.getUsername());
        return savedCharacter;
    }

    @Override
    public PlayerCharacter read (String charName){
        PlayerCharacter readCharacter = playerCharTable.get(charName);
        return readCharacter;
    }

    @Override
    public PlayerCharacter update (PlayerCharacter playerChar){
        playerCharTable.put(playerChar.getCharName(),playerChar);
        PlayerCharacter savedCharacter = playerCharTable.get(playerChar.getUsername());
        return savedCharacter;
    }
    @Override
    public void delete(String charName){playerCharTable.remove(charName);}
}
