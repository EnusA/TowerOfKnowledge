package com.TowerOfKnowledge.EnusA.Repository.Impl;

import com.TowerOfKnowledge.EnusA.Domains.PlayerCharacter;
import com.TowerOfKnowledge.EnusA.Factories.PlayerCharFactory;
import com.TowerOfKnowledge.EnusA.Repository.PlayerCharRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by enusa on 2017/08/14.
 */
public class PlayerCharRepoImplTest {
    Map<String,Integer> values;
    PlayerCharRepository repository;
    @Before
    public void setUp()throws Exception{
        repository = PlayerCharRepoImpl.getInstance();
        values= new HashMap<String, Integer>();
        values.put("level",1);
        values.put("strength",10);
        values.put("intelligence",5);
        values.put("defence",14);
    }

    @Test
    public void create() throws Exception {
        PlayerCharacter playerChar = PlayerCharFactory.getPlayerCharacter(values,"Mogar","MLPMichael");
        repository.create(playerChar);
        assertEquals("Mogar",playerChar.getCharName());
    }

    @Test
    public void read() throws Exception {
        PlayerCharacter readChar = repository.read("Mogar");
        assertEquals("Mogar",readChar.getCharName());
    }

    @Test
    public void update() throws Exception {
        PlayerCharacter playerChar = repository.read("Mogar");
        PlayerCharacter newChar = new PlayerCharacter.Builder()
                .charName("MJones")
                .level(values.get("level"))
                .strength(values.get("strength"))
                .intelligence(values.get("intelligence"))
                .defence(values.get("defence"))
                .username("MLPMichael")
                .builder();
        repository.update(newChar);
        PlayerCharacter updateChar = repository.read("MJones");
        assertEquals("MJones",updateChar.getCharName());
    }

    @Test
    public void delete() throws Exception {
        repository.delete("Mogar");
        PlayerCharacter playerChar = repository.read("Mogar");
        assertNull(playerChar);
    }

}