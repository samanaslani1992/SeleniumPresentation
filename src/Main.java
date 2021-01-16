import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] arg) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://lms.iausdj.ac.ir:9000/login/index.php");

        chromeDriver.findElementById("username").sendKeys("my user name");
        chromeDriver.findElementById("password").sendKeys("my password");

        chromeDriver.findElementById("rememberusername").click();
        chromeDriver.findElementById("loginbtn").click();

        System.out.println(chromeDriver.getTitle());
    }
}
