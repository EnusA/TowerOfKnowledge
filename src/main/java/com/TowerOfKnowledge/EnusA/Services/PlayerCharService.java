package com.TowerOfKnowledge.EnusA.Services;

import com.TowerOfKnowledge.EnusA.Domains.PlayerCharacter;

/**
 * Created by enusa on 2017/08/14.
 */
public interface PlayerCharService {
    PlayerCharacter create(PlayerCharacter playerChar);
    PlayerCharacter read(String charName);
    PlayerCharacter update(PlayerCharacter playerChar);
    void delete(String charName);
}
