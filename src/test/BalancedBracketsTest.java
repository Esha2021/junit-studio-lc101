package test;

import main.BalancedBrackets;
import org.junit.Test;


import static org.junit.Assert.*;

public class BalancedBracketsTest {

    // private Object BalancedBrackets;
    // private Object BalancedBrackets;

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void onlyBracketsReturnsTrue2(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void onlyBracketsReturnsTrue3(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test(expected = NullPointerException.class)
    public void onlyBracketsReturns4() {
        assertEquals(true,BalancedBrackets.hasBalancedBrackets(null));
    }

    @Test
    public void onlyBracketsReturnsTrue5(){
        assertEquals(false,BalancedBrackets.hasBalancedBrackets("[launch]work]"));
    }
    @Test
    public void onlyBracketsReturnsTrue6(){
        assertEquals(true,BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void onlyBracketsReturnsTrue7(){
        assertEquals(false,BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void onlyBracketsReturnsTrue8(){
        assertEquals(true,BalancedBrackets.hasBalancedBrackets("@#$()"));
    }
    @Test
    public void onlyBracketsRetu9(){
        assertEquals(true,BalancedBrackets.hasBalancedBrackets("launchcode"));
    }
}
