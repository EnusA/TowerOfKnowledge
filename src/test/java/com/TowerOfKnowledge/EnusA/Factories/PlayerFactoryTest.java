package com.TowerOfKnowledge.EnusA.Factories;

import com.TowerOfKnowledge.EnusA.Domains.Player;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by enusa on 2017/08/14.
 */
public class PlayerFactoryTest {
    Map<String,String> values;
    @Before
    public void setUp()throws Exception{
        values= new HashMap<String, String>();
        values.put("fullName","Michael Jones");
        values.put("username","MLPMichael");
        values.put("password","il0v3G@vin");
        values.put("email","mjones@yahoo.com");
    }

    @Test
    public void getPlayer() throws Exception {
        Player player = PlayerFactory.getPlayer(values,2);
        assertEquals("il0v3G@vin",player.getPassword());
    }

}