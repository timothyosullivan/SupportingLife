package ie.ucc.bis.supportinglife.service;

import java.util.List;

import ie.ucc.bis.supportinglife.ccm.domain.Patient;

public interface SupportingLifeServiceInf {

	public Patient getPatientById(long id);
	public void addPatient(Patient patient);
	public List<Patient> getAllPatients();
	public List<Patient> getAllPatientsByFirstName(String firstName);
}