package com.java.finalexamples;

public class BlankFinalVariable {
    //Instead of initializing at the time of declaration,
    // Initializing the final variable through the constructor is called BlankFinal Variable
    final int num=10;
    final Computer com;

    public BlankFinalVariable(Computer com) {
        this.com = com;
    }
}
