/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import equation.CheckEquation;
import junit.framework.TestCase;

/**
 *
 * @author LinhPHSE62696
 */
public class MyTest extends TestCase{
    
    public void test1st() {
        CheckEquation check = new CheckEquation();
        assertTrue(check.checkEquationIsValid());
    }
}
