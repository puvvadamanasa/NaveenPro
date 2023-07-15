package oop_Interface;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital fh = new FortisHospital();
		fh.cardioservices();
		fh.dentalservices();
		fh.emergencyservices();
		fh.entservices();
		fh.oncologyservices();
		fh.opdservices();
		fh.pediaservices();
		fh.physioservices();
		fh.medicaltraining();
		USMedical us = new FortisHospital();
		us.physioservices();
		us.cardioservices();
		us.oncologyservices();
		us.test();
		USMedical.billing();
		us.emergencyservices();
		UKMedical uk = new FortisHospital();
		uk.entservices();
		uk.pediaservices();
		uk.emergencyservices();
		//FortisHospital fh12 = (FortisHospital) new USMedical();//ct not allowed 
	}

}
