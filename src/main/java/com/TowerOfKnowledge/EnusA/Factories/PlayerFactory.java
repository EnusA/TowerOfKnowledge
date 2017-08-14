package com.TowerOfKnowledge.EnusA.Factories;

import com.TowerOfKnowledge.EnusA.Domains.Player;

import java.util.Map;

/**
 * Created by enusa on 2017/08/14.
 */
public class PlayerFactory {
    public static Player getPlayer(Map<String,String> values, int rank) {
        rank = 1;
        Player player = new Player.Builder()
                .fullName(values.get("fullName"))
                .username(values.get("username"))
                .password(values.get("password"))
                .email(values.get("email"))
                .rank(rank)
                .builder();
        return player;
    }
}
