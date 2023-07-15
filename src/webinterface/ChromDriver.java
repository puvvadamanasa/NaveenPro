package webinterface;

public class ChromDriver implements WebDriver{
	public ChromDriver() {
		System.out.println("Launch chrome");
	}

	@Override
	public void findElement() {
		System.out.println("find element");
	}

	@Override
	public void findElements() {
		System.out.println("find elements");
	}

	@Override
	public void click() {
		System.out.println("click");
	}

	@Override
	public void sendKeys(String value) {
		System.out.println(value);
	}

	@Override
	public void get(String url) {
		System.out.println(url);
	}

	@Override
	public String getTitle() {
		return "some title";
	}

	@Override
	public void close() {
		System.out.println("close");
	}

}
