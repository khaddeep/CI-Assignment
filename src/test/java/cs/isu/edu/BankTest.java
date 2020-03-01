package cs.isu.edu;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankTest {
    Bank fixture=new Bank();
    @Test
    public void test_Deposit() {

    }
    @Test
    public void test_WithDraw(){

    }
     @Test
    public void test_CheckBalance(){
        assertEquals(1000,fixture.getBalance(821521));
     }
}