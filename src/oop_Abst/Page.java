package oop_Abst;

public abstract class Page {
	//object cannot be created constructor can be creATED
	public Page() {
		System.out.println("default const");
	}
	public Page(int t) {
		System.out.println(t);
	}
	public abstract void title();
	public abstract void url();
	
	public void header() {
		System.out.println("page header");
	}
	public final void logo() {
		System.out.println("page logo");
	}

}
