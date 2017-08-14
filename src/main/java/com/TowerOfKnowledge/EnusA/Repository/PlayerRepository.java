package com.TowerOfKnowledge.EnusA.Repository;

import com.TowerOfKnowledge.EnusA.Domains.Player;

/**
 * Created by enusa on 2017/08/14.
 */
public interface PlayerRepository {
    Player create(Player player);
    Player read(String username);
    Player update(Player player);
    void delete(String username);
}
