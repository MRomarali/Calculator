package se.ecjavaOmar.Ali;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void Testaddition()
    {
        double tal1 = 10;
        double tal2 = 10;
        double expected = 20;
        double delta = 0;

        Assert.assertEquals(expected, App.addition(tal1,tal2), delta);

    }
    @Test
    public void Testsubtraction()
    {
        double tal1 = 100;
        double tal2 = 50;
        double expected = 50;
        double delta = 0;

        Assert.assertEquals(expected, App.subtraction(tal1,tal2), delta);

    }
    @Test
    public void Testmultiplikation()
    {
        double tal1 = 50;
        double tal2 = 50;
        double expected = 2500;
        double delta = 0;

        Assert.assertEquals(expected, App.multiplication(tal1,tal2), delta);

    }
    @Test
    public void Testdivision()
    {
        double tal1 = 10;
        double tal2 = 2;
        double expected = 5;
        double delta = 0;

        Assert.assertEquals(expected, App.Division(tal1,tal2), delta);

    }
}
