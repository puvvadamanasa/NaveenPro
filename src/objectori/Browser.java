package objectori;

public class Browser {
	public void launchBrowser() {
		System.out.println("Launch browser");
		checkversion();
		checIOSVersion();
		checkEnoughRam();	
	}
	private void checkversion() {
		System.out.println("check version");
	}
	private void checIOSVersion() {
		System.out.println("check ios version");
	}
	private void checkEnoughRam() {
		System.out.println("check enough RAM");
	}
	public static void main(String[] args) {
		Browser b1 = new Browser();
		b1.checIOSVersion();
	}

}
