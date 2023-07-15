package oop_Abst;

public class HomePage extends Page{

	@Override
	public void title() {
		System.out.println("title");
	}

	@Override
	public void url() {
		System.out.println("url");
	}
	
	@Override
	public void header() {
		System.out.println("Home page--header");
	}
	public void logout() {
		System.out.println("Homepage == logout");
	}

}
