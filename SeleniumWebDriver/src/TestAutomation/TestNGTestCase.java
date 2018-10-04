package TestAutomation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGTestCase {

		@Test (priority = 2)
		public void testCase1() {

			System.out.println("This is the Test Case 1");
			System.out.println("This Test Case has priority 2");

		}

		
		@Test (groups = { "smoke", "regression" }, enabled = false)
		public void testCase2() {

			System.out.println("This is the Test Case 2");
			System.out.println("This Test Case has no priority");

		}

		
		@BeforeMethod
		public void beforeMethod() {

			System.out.println("This will execute before every Method");

		}

		
		@Test (priority = 1, enabled = true) 
		public void testCase3() {

			System.out.println("This is the Test Case 3");
			System.out.println("This Test Case has priority 1");

		}

		
		@AfterMethod
		public void afterMethod() {

			System.out.println("This will execute after every Method");

		}

		
		@BeforeClass
		public void beforeClass() {

			System.out.println("This is BeforeClass method and it will execute before all the tests");

		}

		
		@AfterClass
		public void afterClass() {

			System.out.println("This will execute AfterClass");

		}

		
		@BeforeTest
		public void beforeTest() {

			System.out.println("This will execute before the Test");

		}

		
		@AfterTest
		public void afterTest() {

			System.out.println("This will execute after the Test");

		}


		@BeforeSuite
		public void beforeSuite() {

			System.out.println("This will execute before the Test Suite");

		}

		@AfterSuite
		public void afterSuite() {

			System.out.println("This will execute after the Test Suite");

		}

	}