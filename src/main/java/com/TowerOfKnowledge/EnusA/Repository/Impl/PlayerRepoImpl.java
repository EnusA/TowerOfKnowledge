package com.TowerOfKnowledge.EnusA.Repository.Impl;

import com.TowerOfKnowledge.EnusA.Domains.Player;
import com.TowerOfKnowledge.EnusA.Repository.PlayerRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by enusa on 2017/08/14.
 */
public class PlayerRepoImpl implements PlayerRepository{
    Map<String, Player> playerTable;
    public PlayerRepoImpl(){playerTable = new HashMap<String, Player>();}
    private static PlayerRepoImpl repository= null;
    public static PlayerRepoImpl getInstance(){
        if (repository==null)
            repository = new PlayerRepoImpl();
        return repository;
    }

    @Override
    public Player create(Player player){
        playerTable.put(player.getUsername(),player);
        Player savedPlayer = playerTable.get(player.getUsername());
        return savedPlayer;
    }

    @Override
    public Player read (String username){
        Player readPlayer = playerTable.get(username);
        return readPlayer;
    }

    @Override
    public Player update (Player player){
        playerTable.put(player.getUsername(),player);
        Player savedPlayer = playerTable.get(player.getUsername());
        return savedPlayer;
    }
    @Override
    public void delete(String username){playerTable.remove(username);}
}
