package com.TowerOfKnowledge.EnusA.Repository.Impl;

import com.TowerOfKnowledge.EnusA.Domains.Player;
import com.TowerOfKnowledge.EnusA.Factories.PlayerFactory;
import com.TowerOfKnowledge.EnusA.Repository.PlayerRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by enusa on 2017/08/14.
 */
public class PlayerRepoImplTest {
    PlayerRepository repository;
    Map<String,String> values;
    @Before
    public void setUp()throws Exception{
        repository = PlayerRepoImpl.getInstance();
        values= new HashMap<String, String>();
        values.put("fullName","Michael Jones");
        values.put("username","MLPMichael");
        values.put("password","il0v3G@vin");
        values.put("email","mjones@yahoo.com");
    }
    @Test
    public void create() throws Exception {
        Player player = PlayerFactory.getPlayer(values,2);
        repository.create(player);
        assertEquals("il0v3G@vin",player.getPassword());
    }

    @Test
    public void read() throws Exception {
        Player readPlayer = repository.read("MLPMichael");
        assertEquals("il0v3G@vin",readPlayer.getPassword());
    }

    @Test
    public void update() throws Exception {
        Player player = repository.read("MLPMichael");
        Player newPlayer = new Player.Builder()
                .fullName(values.get("fullName"))
                .username(values.get("username"))
                .password(values.get("password"))
                .email(values.get("email"))
                .rank(6)
                .builder();
        repository.update(newPlayer);
        Player updatePlayer = repository.read("MLPMichael");
        assertEquals(6,updatePlayer.getrank());
    }

    @Test
    public void delete() throws Exception {
        repository.delete("MLPMichael");
        Player player = repository.read("MLPMichael");
        assertNull(player);
    }

}