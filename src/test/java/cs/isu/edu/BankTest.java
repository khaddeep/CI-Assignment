package cs.isu.edu;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class BankTest {
    Bank fixture=new Bank();
    @Test
    public void test_Deposit() {
        fixture.deposit("Deepson",2000);
        double amountToDeposit=fixture.accountNumbers.get("Deepson");
        assertEquals("Sorry",2000,amountToDeposit,0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void test_Deposit_NoAccount(){
        assertNull("Account not found",fixture.accountNumbers.get("Hanuman"));
        test_Deposit();
        assertNotNull("Account already Exists",fixture.accountNumbers.get("Deepson"));
    }

    @Test
    public void test_WithDraw_WithMoney(){
        fixture.deposit("Deepson",2000);
        fixture.withdraw("Deepson",20);
        assertEquals(1980.0,fixture.getBalance("Deepson"),0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Withdraw_WithoutMoney(){
        fixture.withdraw("Deepson",20);
        assertEquals("Not Enough Balance",null,fixture.getBalance("Deepson"));
    }

    @Test
    public void test_CurrentBalance(){
        test_Deposit();
        test_WithDraw_WithMoney();
        assertEquals("No Money",1980.0,fixture.getBalance("Deepson"),0);
        fixture.withdraw("Deepson",100);
        fixture.deposit("Deepson",100);
        assertEquals("Ignores new function call",1980.0,fixture.getBalance("Deepson"),0);
    }
}