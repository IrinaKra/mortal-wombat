package net.absoft.mortalwombat;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class QuadraticEquationTest {

    @Test
    public void nullTest() {
        QuadraticEquation eq = new QuadraticEquation();
        assertEquals(null,eq.solveEq(-4,10,-9));
    }

    @Test
    public void testTwoSolution() {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.solveEq(-4, 12, -9);
        assertEquals(quadraticEquation.x1,quadraticEquation.x2);
    }

    @Test
        public void testTwoDifSolution() {
            QuadraticEquation quadraticEquation = new QuadraticEquation();
            quadraticEquation.solveEq(1, -4, -5);
            assertNotEquals(quadraticEquation.x1,quadraticEquation.x2);
        }
    }