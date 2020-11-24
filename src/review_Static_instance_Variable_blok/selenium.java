package review_Static_instance_Variable_blok;

public class selenium {
	
	
    public static WebDriver getDriver(String browser){

        String OS="";
        WebDriver driver = null;
          if(System.getProperty("os.name")== OS && browser.toLowerCase()=="edge"){
              return null;
          }else if(browser.toLowerCase()=="chrome"){
              return driver=new ChromeDriver();
          }else if(browser.toLowerCase()=="firefox"){
              return driver =new FirefoxDriver();

          }else if(browser.toLowerCase()=="safari"){
              return driver= new SafariDriver();
          }
          else{
              return driver;
          }

    }
}
