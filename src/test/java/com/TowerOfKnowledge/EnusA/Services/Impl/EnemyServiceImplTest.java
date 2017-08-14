package com.TowerOfKnowledge.EnusA.Services.Impl;

import com.TowerOfKnowledge.EnusA.Domains.Enemy;
import com.TowerOfKnowledge.EnusA.Factories.EnemyFactory;
import com.TowerOfKnowledge.EnusA.Repository.EnemyRepository;
import com.TowerOfKnowledge.EnusA.Repository.Impl.EnemyRepoImpl;
import com.TowerOfKnowledge.EnusA.Services.EnemyService;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by enusa on 2017/08/14.
 */
public class EnemyServiceImplTest {

    Map<String,Integer> values;
    EnemyService service;
    @Before
    public void setUp()throws Exception{
        service = EnemyServiceImpl.getInstance();
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
    public void create() throws Exception {
        Enemy enemy = EnemyFactory.getEnemy(values,"Frost Giant","frg123","Ice Club");
        service.create(enemy);
        assertEquals("fireball",enemy.getName());
    }

    @Test
    public void read() throws Exception {
        Enemy readEnemy = service.read("frg123");
        assertEquals("frg123",readEnemy.getEnemyId());
    }

    @Test
    public void update() throws Exception {
        Enemy enemy = service.read("frg123");
        Enemy newEnemy = new Enemy.Builder()
                .name("Frost Gigantis")
                .enemyId("frg123")
                .attack("Ice Club")
                .level(values.get("level"))
                .fireRes(values.get("fireRes"))
                .iceRes(values.get("iceRes"))
                .poisonRes(values.get("poisonRes"))
                .thunderRes(values.get("thunderRes"))
                .strength(values.get("strength"))
                .intelligence(values.get("intelligence"))
                .defence(values.get("defence"))
                .builder();
        service.update(newEnemy);

        Enemy updateEnemy = service.read("frg123");
        assertEquals("Frost Gigantis",enemy.getName());
    }

    @Test
    public void delete() throws Exception {
        service.delete("frg123");
        Enemy enemy = service.read("frg123");
        assertNull(enemy);
    }


}