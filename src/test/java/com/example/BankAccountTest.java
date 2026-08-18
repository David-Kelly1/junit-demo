package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount();
    }
    
    @AfterEach
    void tearDown() {
        account = null;
    }
    
    @Test
    void shouldTestBalance() {
            
        assertEquals(0.0, account.getBalance());
    }

    @Test
    void shouldDepositMoney() {

        account.deposit(100.0f);

        assertEquals(100.0f, account.getBalance());
    }

    @Test
    void shouldAddMultipleDeposits() {
        
        account.deposit(100.0f);
        account.deposit(50.0f);

        assertEquals(150.0f, account.getBalance());
    }

    @Test
    void shouldWithdrawMoney() {
        
        account.deposit(100.0f);
        account.withdraw(50.0f);

        assertEquals(50.0f, account.getBalance());
    }

    @Test
    void shouldNotAllowWithdrawalGreaterThanBalance() {
        
        account.deposit(100.0f);
        
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(150.0f));
     
        assertEquals(100.0f, account.getBalance());
    }

    @Test
    void shouldNotAllowZeroDeposit() {
        
        assertThrows(IllegalArgumentException.class, () -> account.deposit(0.0f));
    }

    @Test
    void shouldNotAllowNegativeDeposit() {
        
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-50.0f));
    }

    // Additional test cases for withdrawal
    @Test
    void shouldRejectZeroWithdrawal() {
       
        account.deposit(100.0f);

        assertThrows(
            IllegalArgumentException.class,
            () -> account.withdraw(0.0f)
        );

        assertEquals(100.0f, account.getBalance());
    }

}
