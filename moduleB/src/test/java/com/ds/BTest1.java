package com.ds;


import org.junit.Test;


public class BTest1 {

    @Test
    void main() {
        B.main(null);
    }

    @Test
    void sayA() {
        new B().sayA(123);

    }
}