package com.TowerOfKnowledge.EnusA.Factories;

import com.TowerOfKnowledge.EnusA.Domains.Enemy;

import java.util.Map;
/**
 * Created by enusa on 2017/08/14.
 */
public class EnemyFactory {
    public static Enemy getEnemy(Map<String, Integer> values, String name, String enemyId, String attack){
        Enemy enemy = new Enemy.Builder()
                .name(name)
                .enemyId(enemyId)
                .attack(attack)
                .level(values.get("level"))
                .fireRes(values.get("fireRes"))
                .iceRes(values.get("iceRes"))
                .poisonRes(values.get("poisonRes"))
                .thunderRes(values.get("thunderRes"))
                .strength(values.get("strength"))
                .intelligence(values.get("intelligence"))
                .defence(values.get("defence"))
                .builder();
        return enemy;
    }
}
