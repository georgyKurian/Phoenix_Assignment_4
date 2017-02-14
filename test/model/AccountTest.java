/*
 * Copyright 2015 Len Payne <len.payne@lambtoncollege.ca>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 * Tests for the Account class
 */
public class AccountTest {
    
    Account account;
    
    public AccountTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        account = new Account();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void stGetBalanceIs100AfterDeposit500ThenWithdraw400() {
        
        account.deposit(500.00);
        account.withdraw(400.00);
        account.getBalance();
        double expResult = 100.00;
        double result = account.getBalance();
        assertEquals(expResult, result, 0.0);
    }
    @Test 
    public void stGetBalanceIsZeroAfterDeposit500ThenClose(){
        account.deposit(500.00);
        account.close();
        double expResult = 0.00;
        double result = account.getBalance();
        assertEquals(expResult, result,0.0);
        
    }
}
