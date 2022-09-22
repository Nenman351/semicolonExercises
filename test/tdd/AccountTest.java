package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class AccountTest {

    @Test
   public void depositMoneyTest() {
        //given I have an account
        Account amirahTeensAccount = new Account();
        //when I deposit 3000
        amirahTeensAccount.deposit(3000);
        //check my balance increases by 3000
        int balance = amirahTeensAccount.getBalance();
        assertEquals(3000,balance);

    }

@Test
    public void negativeDepositShouldNotWorkTest(){
        //given I have an account
    Account amirahTeensAccount = new Account();
    //given that balance is 10000
    amirahTeensAccount.deposit(10000);
    assertEquals(10000, amirahTeensAccount.getBalance());
    //when i deposit -5000
    amirahTeensAccount.deposit(-5000);
    //check that balance is 10000
    assertEquals(10000,amirahTeensAccount.getBalance());
}

@Test
    public void withdrawMoneyTest(){
        Account amirahTeensAccount = new Account();
        amirahTeensAccount.deposit(1000);
        assertEquals(1000, amirahTeensAccount.getBalance());
        amirahTeensAccount.withdraw(500);
        assertEquals(500, amirahTeensAccount.getBalance());

}

@Test
    public void withdrawingAboveBalanceFailsTest(){
        Account amirahTeensAccount = new Account();
        amirahTeensAccount.deposit(3000);
        assertEquals(3000, amirahTeensAccount.getBalance());
         amirahTeensAccount.withdraw(50000);
         assertEquals(3000, amirahTeensAccount.getBalance());
}

}