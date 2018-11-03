package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import source.Calculadora;

public class CalculadoraTest {

    public CalculadoraTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void testSumarEnteros() {
        Assert.assertEquals(5, Calculadora.sumar(2, 3));
        Assert.assertEquals(1, Calculadora.sumar(-2, 3));
        Assert.assertEquals(2, Calculadora.sumar(4, -2));
        Assert.assertEquals(-4, Calculadora.sumar(-2, -2));
        Assert.assertEquals(2, Calculadora.sumar(0, 2));
        Assert.assertEquals(-2, Calculadora.sumar(-2, 0));
    }

    @After
    public void tearDown() {
    }

    @Test(expected = java.lang.ArithmeticException.class)
    public void testDivideByZero() {
        Calculadora.dividir(0, 2);
        Calculadora.dividir(0, 0);
        Calculadora.dividir(2, 0);
    }

    @Test
    public void testMultiplicarEnteros() {
        Assert.assertEquals(12, Calculadora.multiplicar(4, 3));
        Assert.assertEquals(12, Calculadora.multiplicar(3, 4));
        Assert.assertEquals(0, Calculadora.multiplicar(5, 0));
        Assert.assertEquals(0, Calculadora.multiplicar(0, 5));
        Assert.assertEquals(-4, Calculadora.multiplicar(-2, 2));
        Assert.assertEquals(-4, Calculadora.multiplicar(2, -2));
        Assert.assertEquals(16, Calculadora.multiplicar(-4, -4));
    }

}
