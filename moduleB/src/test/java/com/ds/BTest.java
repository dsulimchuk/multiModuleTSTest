package com.ds;


import org.junit.Test;


public class BTest {

    @Test
    public void main() {
        B.main(null);
    }

    @Test
    public void sayA() {
        new B().sayA(123);

    }
}