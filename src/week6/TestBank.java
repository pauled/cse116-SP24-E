package week6;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class TestBank {
    public static boolean compare(BankAccount b1, BankAccount b2){
        if (!b1.getAccountHolder().equals(b2.getAccountHolder())){
            return false;
        }
        if (Math.abs(b1.checkAccount()-b2.checkAccount()) > .001){
            return false;
        }
        return true;
    }
    public static boolean compareArray(ArrayList<BankAccount> a1,ArrayList<BankAccount> a2){
        if (a1.size()!=a2.size()){
            return false;
        }
        for (BankAccount first : a1){
            boolean temp=false;
            for (BankAccount second : a2){
                if (compare(first,second)){
                    temp=true;
                }
            }
            if(!temp){
                return false;
            }
        }
        return true;
    }
    @Test
    public void TestBank(){
        Bank bank=new Bank();
        bank.addAccount(new BankAccount("A",1));
        bank.addAccount(new BankAccount("B",2));
        bank.addAccount(new BankAccount("C",3));

        ArrayList<BankAccount> account=new ArrayList<>();
        account.add(new BankAccount("A",1));
        account.add(new BankAccount("B",2));
        account.add(new BankAccount("C",3));
        assertTrue("array equal",compareArray(bank.getAccounts(),account));
    }
    @Test
    public void testAccountCompare(){
        BankAccount b1=new BankAccount("A",100);
        BankAccount b2=new BankAccount("A",100);
        BankAccount b3=new BankAccount("B",100);
        BankAccount b4=new BankAccount("A",10);

        assertTrue("testing same",compare(b1,b2));
        assertFalse("testing different name",compare(b1,b3));
        assertFalse("testing different balance",compare(b1,b4));
        assertFalse("testing different everything",compare(b3,b4));
    }
    @Test
    public void testBankAccount(){
        BankAccount account=new BankAccount("bob",100);
        assertEquals("checking owner","bob",account.getAccountHolder());
        assertEquals("checking testAccount",100,account.checkAccount(),.001);

        account.deposit(5.5);
        assertEquals("checking deposit",105.5,account.checkAccount(),.001);
        account.withdraw(100);
        assertEquals("checking withdraw",5.5,account.checkAccount(),.001);
        boolean actual=account.isOverdrawn();
        assertFalse("check isOverdrawn false",actual);
        account.withdraw(6.5);
        assertEquals("checking withdraw below 0",-1,account.checkAccount(),.001);
        actual=account.isOverdrawn();
        assertTrue("check isOverdrawn true",actual);

        BankAccount account2=new BankAccount("abby",100);
        account2.transfer(account,50);
        assertEquals("checking transfer withdraw",50,account2.checkAccount(),.001);
        assertEquals("checking transfer deposit",49,account.checkAccount(),.001);

    }
}
