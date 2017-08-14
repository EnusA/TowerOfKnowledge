package com.TowerOfKnowledge.EnusA.Repository.Impl;

import com.TowerOfKnowledge.EnusA.Domains.Abilities;
import com.TowerOfKnowledge.EnusA.Factories.AbilitiesFactory;
import com.TowerOfKnowledge.EnusA.Repository.AbilitiesRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by enusa on 2017/08/14.
 */
public class AbilitiesRepoImplTest {
    Map<String,String> values;
    AbilitiesRepository repository;
    @Before
    public void setUp()throws Exception {
        repository = AbilitiesRepoImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("name", "fireball");
        values.put("description", "Launch a flaming ball at the enemy");
        values.put("element", "Fire");
        values.put("category", "History");
    }
    @Test
    public void create() throws Exception {
        Abilities abilities = AbilitiesFactory.getAbilities(values,10,1*3);
        repository.create(abilities);
        assertEquals("fireball",abilities.getName());
    }

    @Test
    public void read() throws Exception {
        Abilities readAbilities = repository.read("fireball");
        assertEquals("fireball",readAbilities.getName());
    }

    @Test
    public void update() throws Exception {
        Abilities abilities = repository.read("fireball");
        Abilities newAbilities = new Abilities.Builder()
                .name(values.get("name"))
                .description(values.get("description"))
                .element(values.get("element"))
                .category(values.get("category"))
                .damage(12)
                .modifier(1*5)
                .builder();
        repository.update(newAbilities);
        Abilities updateAbilities = repository.read("fireball");
        assertEquals("fireball",abilities.getName());
    }

    @Test
    public void delete() throws Exception {
        repository.delete("fireball");
        Abilities abilities = repository.read("fireball");
        assertNull(abilities);
    }


}