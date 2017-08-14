package com.TowerOfKnowledge.EnusA.Services;

import com.TowerOfKnowledge.EnusA.Domains.Player;

/**
 * Created by enusa on 2017/08/14.
 */
public interface PlayerService {
    Player create(Player player);
    Player read(String username);
    Player update(Player player);
    void delete(String username);
}
