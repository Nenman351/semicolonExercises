package com.chiefSession;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class NativeTest {
    private Native amira;
    private Native wumi;


    @BeforeEach
    public void setUp(){
        amira = new Native();
        wumi = new Native("Adewumi");
    }

    @Test
    public void checkNativeTest(){
        assertNotNull(amira.getFirstName());
    }
}
