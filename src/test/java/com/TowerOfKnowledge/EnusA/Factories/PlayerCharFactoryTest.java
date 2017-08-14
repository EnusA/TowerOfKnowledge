package com.TowerOfKnowledge.EnusA.Factories;

import com.TowerOfKnowledge.EnusA.Domains.PlayerCharacter;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by enusa on 2017/08/14.
 */
public class PlayerCharFactoryTest {
    Map<String,Integer> values;
    @Before
    public void setUp()throws Exception{
        values= new HashMap<String, Integer>();
        values.put("level",1);
        values.put("strength",10);
        values.put("intelligence",5);
        values.put("defence",14);
    }

    @Test
    public void getPlayerCharacter() throws Exception {
        PlayerCharacter playerChar = PlayerCharFactory.getPlayerCharacter(values,"Mogar","MLPMichael");
        assertEquals("Mogar",playerChar.getCharName());
    }

}