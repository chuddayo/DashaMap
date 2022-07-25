package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMapTest {
    @Test
    public void dashaMapConstructorTest() {
        DashaMap dasha = new DashaMapOne();
        Integer expected = 26;
        Integer actual = (int) dasha.size();

        Assert.assertEquals(expected, actual);

        String expectedStr = "f";
        String actualStr = dasha.get("f");

        Assert.assertEquals(expectedStr, actualStr);
    }
}
