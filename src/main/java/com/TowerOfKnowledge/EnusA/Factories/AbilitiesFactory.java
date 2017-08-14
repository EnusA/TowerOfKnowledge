package com.TowerOfKnowledge.EnusA.Factories;

import com.TowerOfKnowledge.EnusA.Domains.Abilities;

import java.util.Map;

/**
 * Created by enusa on 2017/08/14.
 */
public class AbilitiesFactory {
    public static Abilities getAbilities(Map<String,String> values, int damage, int modifier){

        Abilities abilities = new Abilities.Builder()
                .name(values.get("name"))
                .description(values.get("description"))
                .element(values.get("element"))
                .category(values.get("category"))
                .damage(damage)
                .modifier(modifier)
                .builder();
        return abilities;
    }
}
