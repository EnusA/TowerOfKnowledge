package com.TowerOfKnowledge.EnusA.Factories;

import com.TowerOfKnowledge.EnusA.Domains.PlayerCharacter;

import java.util.Map;

/**
 * Created by enusa on 2017/08/14.
 */
public class PlayerCharFactory {
    public static PlayerCharacter getPlayerCharacter(Map<String, Integer> values, String charName, String username) {
        PlayerCharacter playerChar = new PlayerCharacter.Builder()
                .charName(charName)
                .level(values.get("level"))
                .strength(values.get("strength"))
                .intelligence(values.get("intelligence"))
                .defence(values.get("defence"))
                .username(username)
                .builder();
        return playerChar;
    }
}
