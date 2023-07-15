package oop_Interface;

public class FortisHospital implements USMedical,UKMedical,IndianMedical{

	@Override
	public void physioservices() {
		System.out.println("FortisHospital physio");		
	}

	@Override
	public void cardioservices() {
		System.out.println("cardio");
	}

	@Override
	public void oncologyservices() {
		System.out.println("FortisHospital oncology");	
	}

	@Override
	public void test() {
		System.out.println("FortisHospital test");	
	}

	@Override
	public void entservices() {
		System.out.println("Fortis hosp entservices");
		
	}

	@Override
	public void pediaservices() {
		System.out.println("Fortis pedia services");
		
	}

	@Override
	public void orthoservices() {
		System.out.println("Fortis ortho");		
	}

	@Override
	public void dentalservices() {
		System.out.println("Fortis dental");
		
	}
	public void medicaltraining() {
		System.out.println("Fortis medical ");
	}
	public void opdservices() {
		System.out.println("opd services");
	}

	@Override
	public void emergencyservices() {
		System.out.println("FH ");
		
	}
	
}
