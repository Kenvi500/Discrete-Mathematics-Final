/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author Kelvin Bonilla
 */
public class TestApp {
    public static void main(String[] args)
    {
        Integer[] someInts = new Integer[10];
        someInts[0] = 4;
        someInts[1] = 3;
        someInts[2] = 18;
        someInts[3] = 9;
        someInts[4] = 7;
        someInts[5] = 24;
        someInts[6] = 12;
        someInts[7] = 17;
        someInts[8] = 13;
        someInts[9] = 1;
        Algorithms.insertionSort(someInts);
        for (Integer someInt : someInts) {
            System.out.println(someInt);
        }
    }
}
