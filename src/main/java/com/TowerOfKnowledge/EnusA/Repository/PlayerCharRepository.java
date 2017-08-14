package com.TowerOfKnowledge.EnusA.Repository;

import com.TowerOfKnowledge.EnusA.Domains.Player;
import com.TowerOfKnowledge.EnusA.Domains.PlayerCharacter;

/**
 * Created by enusa on 2017/08/14.
 */
public interface PlayerCharRepository {
    PlayerCharacter create(PlayerCharacter playerChar);
    PlayerCharacter read(String charName);
    PlayerCharacter update(PlayerCharacter playerChar);
    void delete(String charName);
}
