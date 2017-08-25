package action;

import org.openqa.selenium.WebDriver;

import general.DeclareObjectQLNhanKhau;
import general.Method;


public class ActLogin {
	public  void LoginValid(WebDriver driver) throws InterruptedException {
		Method.senKey(driver, DeclareObjectQLNhanKhau.txtUsername(), "admin");
		Method.senKey(driver, DeclareObjectQLNhanKhau.txtPassword(), "admin");
		Method.click(driver, DeclareObjectQLNhanKhau.btnLogin()); 
	}
}
