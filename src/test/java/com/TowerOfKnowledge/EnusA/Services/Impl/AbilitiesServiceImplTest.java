package com.TowerOfKnowledge.EnusA.Services.Impl;

import com.TowerOfKnowledge.EnusA.Domains.Abilities;
import com.TowerOfKnowledge.EnusA.Factories.AbilitiesFactory;
import com.TowerOfKnowledge.EnusA.Repository.AbilitiesRepository;
import com.TowerOfKnowledge.EnusA.Repository.Impl.AbilitiesRepoImpl;
import com.TowerOfKnowledge.EnusA.Services.AbilitiesService;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by enusa on 2017/08/14.
 */
public class AbilitiesServiceImplTest {
    Map<String,String> values;
    AbilitiesService service;
    @Before
    public void setUp()throws Exception {
        service = AbilitiesServiceImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("name", "fireball");
        values.put("description", "Launch a flaming ball at the enemy");
        values.put("element", "Fire");
        values.put("category", "History");
    }

    @Test
    public void create() throws Exception {
        Abilities abilities = AbilitiesFactory.getAbilities(values,10,1*3);
        service.create(abilities);
        assertEquals("fireball",abilities.getName());
    }

    @Test
    public void read() throws Exception {
        Abilities readAbilities = service.read("fireball");
        assertEquals("fireball",readAbilities.getName());
    }

    @Test
    public void update() throws Exception {
        Abilities abilities = service.read("fireball");
        Abilities newAbilities = new Abilities.Builder()
                .name(values.get("name"))
                .description(values.get("description"))
                .element(values.get("element"))
                .category(values.get("category"))
                .damage(12)
                .modifier(1*5)
                .builder();
        service.update(newAbilities);
        Abilities updateAbilities = service.read("fireball");
        assertEquals("fireball",abilities.getName());
    }

    @Test
    public void delete() throws Exception {
        service.delete("fireball");
        Abilities abilities = service.read("fireball");
        assertNull(abilities);
    }

}