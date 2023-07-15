package oop_Inter;

public class FortisHospital extends Unhg implements USMedical,UKMedical,IndianMedical{
     //US
	@Override
	public void physioServices() {
		System.out.println("Fortis--Physio");
	}

	@Override
	public void cardioServices() {
		System.out.println("Fortis--Cardio");
	}

	@Override
	public void oncologyServices() {
		System.out.println("Fortis--Oncology");
	}
    //UK
	@Override
	public void entServices() {
		System.out.println("Fortis -- ENT");	
	}

	@Override
	public void pediaServices() {
		System.out.println("Fortis pedia");	
	}
    //Indian
	@Override
	public void orthoServices() {
		System.out.println("Fortis ortho ");
	}

	@Override
	public void dentalServices() {
		System.out.println("Fortis dental");	
	}
	//fortis
	public void medicalTraining() {
		System.out.println("Fortis medical");
	}
	public void optServices() {
		System.out.println("OPT Services");
	}
	
    //only 1 time it will get overwritten
	@Override
	public void emergencyServices() {
		System.out.println("emergency");
	}
	@Override
	public void medInsurance() {
		System.out.println("fh med insurance");
	}

	@Override
	public void covidTest() {
		System.out.println("Covid test");
	}
	

}
