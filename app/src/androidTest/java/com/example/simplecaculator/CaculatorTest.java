package com.example.simplecaculator;

import junit.framework.TestCase;

public class CaculatorTest extends TestCase {
    Caculator caculator;
    public void setUp() throws Exception {
        caculator = new Caculator();
    }

    public void tearDown() throws Exception {
    }

    public void testAdd() {
        assertEquals(caculator.add(2,3),5);
        assertEquals(caculator.add(7,3),10);
        assertEquals(caculator.add(2,1),3,0.00001);
        assertEquals(caculator.add(-3,1),-2,0.00001);
        assertEquals(caculator.add(-2,5),3,0.00001);
        assertEquals(caculator.add(1999,39999),41998,0.00001);
        assertEquals(caculator.add(-1999,39999),38000,0.00001);
    }

    public void testSub() {

        assertEquals(caculator.sub(2,3),-1);
        assertEquals(caculator.sub(7,3),4);
        assertEquals(caculator.sub(2,1),1,0.00001);
        assertEquals(caculator.sub(-3,1),-4,0.00001);
        assertEquals(caculator.sub(-2,5),-7,0.00001);
        assertEquals(caculator.sub(1999,39999),-38000,0.00001);
        assertEquals(caculator.sub(-1999,39999),-41998,0.00001);
    }

    public void testDiv() {

        assertEquals(caculator.div(2,3),0);
        assertEquals(caculator.div(7,3),2);
        assertEquals(caculator.div(2,1),2,0.00001);
        assertEquals(caculator.div(-3,1),-3,0.00001);
        assertEquals(caculator.div(-2,5),0,0.00001);
        assertEquals(caculator.div(39999,1999),20,0.00001);
        assertEquals(caculator.div(39999,-1999),-20,0.00001);


    }

    public void testMul() {
        assertEquals(caculator.mul(2,3),6);
        assertEquals(caculator.mul(7,3),21);
        assertEquals(caculator.mul(2,1),2,0.00001);
        assertEquals(caculator.mul(-3,1),-3,0.00001);
        assertEquals(caculator.mul(-2,5),-10,0.00001);
        assertEquals(caculator.mul(39999,19),759981,0.00001);
        assertEquals(caculator.mul(39999,-19),-759981,0.00001);

    }

    public void testPow() {
        assertEquals(caculator.pow(2,3),8.0);
        assertEquals(caculator.pow(7,3),343.0);
        assertEquals(caculator.pow(2,-1),0.5,0.00001);
        assertEquals(caculator.pow(6,-2),0.02777777778,0.00001);
        assertEquals(caculator.pow(-2,5),-32.0,0.00001);


    }

    public void testLog() {
       assertEquals(caculator.log(2,4),2.0);
        assertEquals(caculator.log(2,1024),10.0);
        assertEquals(caculator.log(2,2),1.0,0.00001);
        assertEquals(caculator.log(9,3),0.5,0.00001);
        assertEquals(caculator.log(6,36),2.0,0.00001);

    }

    public void testFac() {
        assertEquals(caculator.fac(5), 120 );
        assertEquals(caculator.fac(-5), 0 );
        assertEquals(caculator.fac(7), 5040 );
        assertEquals(caculator.fac(0), 1 );
        assertEquals(caculator.fac(1), 1 );
        assertEquals(caculator.fac(3), 6 );
    }
}