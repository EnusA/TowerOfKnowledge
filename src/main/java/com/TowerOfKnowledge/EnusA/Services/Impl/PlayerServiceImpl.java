package com.TowerOfKnowledge.EnusA.Services.Impl;

import com.TowerOfKnowledge.EnusA.Domains.Player;
import com.TowerOfKnowledge.EnusA.Repository.Impl.PlayerRepoImpl;
import com.TowerOfKnowledge.EnusA.Repository.PlayerRepository;
import com.TowerOfKnowledge.EnusA.Services.PlayerService;

/**
 * Created by enusa on 2017/08/14.
 */
public class PlayerServiceImpl implements PlayerService{
    private static PlayerServiceImpl service= null;
    PlayerRepository repository = PlayerRepoImpl.getInstance();
    public static PlayerServiceImpl getInstance(){
        if (service==null)
            service = new PlayerServiceImpl();
        return service;
    }

    @Override
    public Player create(Player player){return repository.create(player);}
    @Override
    public Player read (String username){return  repository.read(username);}
    @Override
    public Player update(Player player){return repository.update(player);}
    @Override
    public void delete (String username){repository.delete(username);}
}
