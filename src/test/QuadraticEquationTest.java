package net.absoft.mortalwombat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class QuadraticEquationTest {

    @Test
    public void testTowSolution() {
        QuadraticEquation quadraticEquation = new QuadraticEquation(3, -4, 2);
        Roots rt = QuadraticEquation.sovleEq();
        assertEquals(rt.x1, 5);
        assertEquals(rt.x2, -1);
    }
}
