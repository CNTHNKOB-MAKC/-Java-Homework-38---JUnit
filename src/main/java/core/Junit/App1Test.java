package core.Junit;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
public class App1Test {

 



@BeforeClass

public static void BeforeClass() throws Exception {

System.out.println("BeforeClass method will be executed before first test method starts");

   }



@AfterClass

public static void AfterClass() throws Exception {

System.out.println("AfterClass method will be executed after last test method completed");

   }



@Before

public void Before() throws Exception {

   System.out.println("Before method will execute before every test method");

   }



@After

public void After() throws Exception {

   System.out.println("After method will execute after every test method");

   }



@Test

public void Test_01_assertEquals_Positive() {

   System.out.println("Test_01_assertEquals_Positive");

}



@Test

public void Test_02_assertEquals_Negative() {
	assertEquals("I think itis an error because goal is negative test case", 4, 5);

   System.out.println("Test_02_assertEquals_Negative");

   }



@Ignore

@Test

public void Test_03_assertEquals_Ignored() {

   System.out.println("Test_03_assertEquals_Ignored");

   }



@Test

public void Test_04_AssertSame_Positive() {
	Boolean t = false;
	assertSame("error", t, false);
   System.out.println("Test_04_AssertSame_Positive");

   }



@Test

public void Test_05_AssertSame_Negative() {
	double d =  2;
	assertSame ("failure is positive result", d,4);
   System.out.println("Test_05_AssertSame_Negative");

   }



@Ignore

@Test

public void Test_06_AssertSame_Ignored() {

   System.out.println("Test_06_AssertSame_Ignored");

   }



@Test

public void Test_07_assertFalse_Positive() {
	Boolean t = false;
	assertFalse ("error", t);
   System.out.println("Test_07_assertFalse_Positive");

   }



@Test

public void Test_08_assertFalse_Negative() {
	Boolean d = true;
	String e = "dfgef";
	String t = "dfgef";
	assertFalse( "whathappaned ? again a failure",  d);
   System.out.println("Test_08_assertFalse_Negative");

   }



@Test

public void Test_09_assertTrue_Positive() {
	Boolean t = true;
	assertTrue("failuer should be true", t);
   System.out.println("Test_09_assertTrue_Positive");

   }



@Test

public void Test_10_assertTrue_Negative() {
	Boolean s = false;
	assertTrue ("failure should be true", s);
   System.out.println("Test_10_assertTrue_Negative");

   }

}