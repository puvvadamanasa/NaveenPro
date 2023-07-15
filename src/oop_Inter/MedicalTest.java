package oop_Inter;

public class MedicalTest {
	public static void main(String[] args) {
		FortisHospital f = new FortisHospital();
		f.physioServices();
		f.cardioServices();
		f.oncologyServices();
		f.entServices();
		f.pediaServices();
		f.orthoServices();
		f.dentalServices();
		f.medicalTraining();
		f.optServices();
		f.emergencyServices();
		f.medInsurance();
		f.covidTest();
		FortisHospital.covidGuideLines();
		f.medicalInfo();
		
		USMedical us = new FortisHospital();
		us.physioServices();
		us.cardioServices();
		us.oncologyServices();
		us.emergencyServices();
		us.medInsurance();
		us.covidTest();
		USMedical.billing();
		//FortisHospital fh = (FortisHospital) new USMedical();
		//down casting is not allowed at compile time
		UKMedical uk = new FortisHospital();
		uk.entServices();
		uk.pediaServices();
		uk.emergencyServices();
		
	}

}
