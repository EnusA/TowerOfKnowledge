package com.TowerOfKnowledge.EnusA.Factories;

import com.TowerOfKnowledge.EnusA.Domains.Abilities;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by enusa on 2017/08/14.
 */
public class AbilitiesFactoryTest {
    Map<String,String> values;
    @Before
    public void setUp()throws Exception{
        values= new HashMap<String, String>();
        values.put("name","fireball");
        values.put("description","Launch a flaming ball at the enemy");
        values.put("element","Fire");
        values.put("category","History");
    }
    @Test
    public void getAbilities() throws Exception {
        Abilities abilities = AbilitiesFactory.getAbilities(values,10,1*3);
        assertEquals("Launch a flaming ball at the ",abilities.getDescription());
    }

}