package com.tencent.xinge.bean;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class AtyAttrTest {

    @Test
    @Ignore
    public void testAtyAttr() {
        AtyAttr atyAttr = new AtyAttr();
        atyAttr.setPf(0);
        atyAttr.setIf(0);

        ObjectMapper mapper = new ObjectMapper();

        String repoStr = null;
        try {
            repoStr = mapper.writeValueAsString(atyAttr);

        } catch (Exception e) {
            fail();
        }

        assertEquals("{\"pf\":0,\"if\":0}",repoStr);

        System.out.println(repoStr);

    }
}