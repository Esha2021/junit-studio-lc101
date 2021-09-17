package test;
import main.BonusBinarySearch;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;


public class BonusBinarySearchTest {
    //    @Before
//    public void BeforeTest() {
//
//
//    }
    @Test
    public void BonusBinarySearchTest1() {

        BonusBinarySearch b1 = new BonusBinarySearch();
        int[] sortednumbers = {10, 9, 8, 7, 6};
        b1.binarySearch(sortednumbers, 8);
        //System.out.println(b1.binarySearch(sortednumbers, 8));
        assertEquals(2, b1.binarySearch(sortednumbers, 8), 0.001);
    }

    @Test
    public void BonusBinarySearchTest2() {
        BonusBinarySearch b2 = new BonusBinarySearch();
        int[] sortedarray = {};
        System.out.println(b2.binarySearch(sortedarray, 4));
        assertTrue(b2.binarySearch(sortedarray, 0) == -1);
    }

    @Test
    public void BonusBinarySearchTest3() {
        BonusBinarySearch b3 = new BonusBinarySearch();
        int[] sortedarray1 = {0,0,8, 8, 9, 9};
        int expected=2;
        //System.out.println(b3.binarySearch(sortedarray1, 8));
       assertEquals(2,b3.binarySearch(sortedarray1, 8) ,.001);
    }
}