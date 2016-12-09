package TestNG;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class DataFileTest {
	
	@DataProvider(name="data")
	public static Object[][] testData(Method m){
		Object[][] obj = null;
		
		if (m.getName().equals("signUpUser")){
			obj = new Object[3][4];
			
			obj[0][0] = "Tiana";
			obj[0][1] = "Todos";
			obj[0][2] = "tiana.todos@gmail.com";
			obj[0][3] = "tiana123";
			
			obj[1][0] = "Julie";
			obj[1][1] = "Vin";
			obj[1][2] = "julie.vin@gmail.com";
			obj[1][3] = "julie123";
			
			obj[2][0] = "Stephano";
			obj[2][1] = "Dubuc";
			obj[2][2] = "stephano.dubuc@gmail.com";
			obj[2][3] = "stephano123";
		}
		
		if (m.getName().equals("loginUser")){
			obj = new Object[3][2];
			
			obj[0][0] = "tiana.todos@gmail.com";
			obj[0][1] = "tiana123";
			
			obj[1][0] = "julie.vin@gmail.com";
			obj[1][1] = "julie123";
			
			obj[2][0] = "stephano.dubuc@gmail.com";
			obj[2][1] = "stephano123";
		}
		
		return obj;
	}
}
