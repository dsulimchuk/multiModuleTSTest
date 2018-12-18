package com.ds;

class BTest {

    @org.junit.jupiter.api.Test
    void main() {
        B.main(null);
    }

    @org.junit.jupiter.api.Test
    void sayA() {
        new B().sayA(123);

    }
}