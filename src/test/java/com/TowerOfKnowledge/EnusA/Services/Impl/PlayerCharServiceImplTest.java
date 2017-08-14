package com.TowerOfKnowledge.EnusA.Services.Impl;

import com.TowerOfKnowledge.EnusA.Domains.PlayerCharacter;
import com.TowerOfKnowledge.EnusA.Factories.PlayerCharFactory;
import com.TowerOfKnowledge.EnusA.Repository.Impl.PlayerCharRepoImpl;
import com.TowerOfKnowledge.EnusA.Repository.PlayerCharRepository;
import com.TowerOfKnowledge.EnusA.Services.PlayerCharService;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by enusa on 2017/08/14.
 */
public class PlayerCharServiceImplTest {
    Map<String,Integer> values;
    PlayerCharService service;
    @Before
    public void setUp()throws Exception{
        service = PlayerCharServiceImpl.getInstance();
        values= new HashMap<String, Integer>();
        values.put("level",1);
        values.put("strength",10);
        values.put("intelligence",5);
        values.put("defence",14);
    }

    @Test
    public void create() throws Exception {
        PlayerCharacter playerChar = PlayerCharFactory.getPlayerCharacter(values,"Mogar","MLPMichael");
        service.create(playerChar);
        assertEquals("Mogar",playerChar.getCharName());
    }

    @Test
    public void read() throws Exception {
        PlayerCharacter readChar = service.read("Mogar");
        assertEquals("Mogar",readChar.getCharName());
    }

    @Test
    public void update() throws Exception {
        PlayerCharacter playerChar = service.read("Mogar");
        PlayerCharacter newChar = new PlayerCharacter.Builder()
                .charName("MJones")
                .level(values.get("level"))
                .strength(values.get("strength"))
                .intelligence(values.get("intelligence"))
                .defence(values.get("defence"))
                .username("MLPMichael")
                .builder();
        service.update(newChar);
        PlayerCharacter updateChar = service.read("MJones");
        assertEquals("MJones",updateChar.getCharName());
    }

    @Test
    public void delete() throws Exception {
        service.delete("Mogar");
        PlayerCharacter playerChar = service.read("Mogar");
        assertNull(playerChar);
    }

}