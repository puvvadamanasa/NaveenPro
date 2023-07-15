package oop_pra_Interface;

public class VIT extends Education implements USEdu,IndEdu,UKEdu{

	@Override
	public void ip() {
		System.out.println("ip");
	}

	@Override
	public void nm() {
		System.out.println("nm");
	}

	@Override
	public void db() {
		System.out.println("db");
	}

	@Override
	public void java() {
		System.out.println("java");
	}

	@Override
	public void eng() {
		System.out.println("eng");
	}

	@Override
	public void sci() {
		System.out.println("sci");
	}

	@Override
	public void social() {
		System.out.println("social");
	}
	public void vit() {
		System.out.println("vit");
	}

	@Override
	public void general() {
		System.out.println("general");	
	}
	
	@Override
	public void use(){
		System.out.println("user--------------------------");
	}

	@Override
	public void covid() {
		System.out.println("covid");
	}
	@Override
	public void education() {
		System.out.println("education vit");
	}
	
	
}
