package com.cg.wallet.test;

import org.junit.Assert;
import org.junit.Test;

import com.cg.wallet.exception.BankAccoountException;
import com.cg.wallet.service.BankAccountServiceImpl;

public class TestClassJPA {
	
	@Test
    public void testName_1() throws BankAccoountException{
    
        String name="Akshay";
        BankAccountServiceImpl service=new BankAccountServiceImpl();
        boolean result= service.validateName(name);
        Assert.assertEquals(true,result);
    }
    @Test
    public void testName_2() throws BankAccoountException{
    
        String name="john";
        BankAccountServiceImpl service=new BankAccountServiceImpl();
        boolean result= service.validateName(name);
        Assert.assertEquals(false,result);
    }
    
    
    @Test
    public void testMobile_1() throws BankAccoountException{
    
        String mobNo="RON123558";
        BankAccountServiceImpl service=new BankAccountServiceImpl();
        boolean result= service.validateMoileNo(mobNo);
        Assert.assertEquals(false,result);
    }
    @Test
    public void testMobile_2() throws BankAccoountException{
    
        String mobNo="9421734025";
        BankAccountServiceImpl service=new BankAccountServiceImpl();
        boolean result= service.validateMoileNo(mobNo);
        Assert.assertEquals(true,result);
    }


}
