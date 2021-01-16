package src.main.java.core;

public class DriverFactory {

    public void getDriver(String browser){
        if(browser.equals("chrome")){
            System.out.println("ChromeDriver ---------->");
        }else if(browser.equals("android")){
            System.out.println("AndroidDriver ---------->");
        }
    }
}
