package webinterface;

public class GoogleTest {
	static WebDriver driver;
	public static void main(String[] args) {
		String browser="chrome";
		if(browser.equals("chrome")) {
			driver=new ChromDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new Firefox();
		}
		else if(browser.equals("safari")) {
			driver=new ChromDriver();
		}
		else {
			System.out.println("Please pass right browser");
		}
		WebDriver d = new Firefox();
		//Firefox f = new Firefox();
		Safri s = new Safri();
		d.get("google.com");
		String tit = d.getTitle();
		System.out.println(s);
		d.findElement();
		d.findElements();
		d.click();
		d.sendKeys("naveen@clos");
		d.close();
	}

}
