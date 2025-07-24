package org.example.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReversePolishNotationTest {

    private ReversePolishNotation reversePolishNotation;

    @BeforeEach
    void setUp(){
        this.reversePolishNotation = new ReversePolishNotation();
    }

    @Test
    void one(){
        String[] cars = {"1","2","+","3","*","4","-"};
        assertEquals(reversePolishNotation.evalRPN(cars), 5);
    }
    @Test
    void two(){
        String[] cars = {"1","2","+"};
        assertEquals(reversePolishNotation.evalRPN(cars), 3);
    }
    @Test
    void three(){
        String[] cars = {"4","13","5","/","+"};
        assertEquals(reversePolishNotation.evalRPN(cars), 6);
    }
    @Test
    void four(){
        String[] cars = {"-78","-33","196","+","-19","-","115","+","-","-99","/","-18","8","*","-86","-","-","16","/","26","-14","-","-","47","-","101","-","163","*","143","-","0","-","171","+","120","*","-60","+","156","/","173","/","-24","11","+","21","/","*","44","*","180","70","-40","-","*","86","132","-84","+","*","-","38","/","/","21","28","/","+","83","/","-31","156","-","+","28","/","95","-","120","+","8","*","90","-","-94","*","-73","/","-62","/","93","*","196","-","-59","+","187","-","143","/","-79","-89","+","-"};
        assertEquals(reversePolishNotation.evalRPN(cars), 165);
    }
}