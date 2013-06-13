package ie.ucc.bis.dao;

import java.util.List;

import ie.ucc.bis.domain.Patient;

public interface PatientDAO {

	public Patient getPatientById(long id);
	public void addPatient(Patient patient);
	public List<Patient> getAllPatients();
	List<Patient> getAllPatientsByFirstName(String firstName);
	
}
