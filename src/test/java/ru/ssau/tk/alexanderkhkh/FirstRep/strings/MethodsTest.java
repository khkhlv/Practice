package ru.ssau.tk.alexanderkhkh.FirstRep.strings;

import org.testng.annotations.Test;
import ru.ssau.tk.alexanderkhkh.FirstRep.arrays.Array;

import static org.testng.Assert.*;

public class MethodsTest {

    @Test
    public void testFirstTask(){
        String string = ("abcde");
        Methods.firstTask(string);
    }

    @Test
    public void testSecondTask(){
        String string1 = "abcde";
        Methods.secondTask(string1);
        System.out.println("\n");
        String string2 = "абвгд";
        Methods.secondTask(string2);
    }
}