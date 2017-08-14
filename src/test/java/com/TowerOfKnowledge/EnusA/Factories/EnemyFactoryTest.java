package com.TowerOfKnowledge.EnusA.Factories;

import com.TowerOfKnowledge.EnusA.Domains.Enemy;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by enusa on 2017/08/14.
 */
public class EnemyFactoryTest {
    Map<String,Integer> values;
    @Before
    public void setUp()throws Exception{
        values= new HashMap<String, Integer>();
        values.put("level",6);
        values.put("fireRes",0);
        values.put("iceRes",15);
        values.put("poisonRes",3);
        values.put("thunderRes",0);
        values.put("strength",20);
        values.put("intelligence",3);
        values.put("defence",17);
    }

    @Test
    public void getEnemy() throws Exception {
        Enemy enemy = EnemyFactory.getEnemy(values,"Frost Giant","frg123","Ice Club");
        assertEquals(15,enemy.getIceRes());
    }

}