package sikuliTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class SikuliTest {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
//driver.manage().window().maximize();
driver.get("https://www.youtube.com/");

//driver.manage().window().maximize();
Screen screen = new Screen();
Pattern image = new Pattern("C:\\Users\\user\\Pictures\\youtubeicon.png");
try {
	screen.wait(image, 10);
	screen.click(image);
} catch (FindFailed e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

Thread.sleep(3000);
	}

}
