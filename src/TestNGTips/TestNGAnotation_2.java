package TestNGTips;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnotation_2 {
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Start TestNG");;
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("Start Test Execution");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Initialize Selenium for TestNGAnotation_2");
	}
	
	@Test
	public void test3(){
		System.out.println("Inside test3");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("Destroy Selenium for TestNGAnotation_2");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("Inside test3");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("Stop TestNG");;
	}

}
