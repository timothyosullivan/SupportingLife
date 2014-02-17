package ie.ucc.bis.supportinglife.ccm.dao;

import ie.ucc.bis.supportinglife.ccm.domain.CcmPatient;

import java.util.List;

public interface CcmPatientDao extends Dao {

	public Long addPatient(CcmPatient patient);

	public List<CcmPatient> getAllPatients();
	public CcmPatient getPatientByNationalId(String nationalId);
	public CcmPatient getPatientByNationalHealthId(String nationalHealthId);
	public List<CcmPatient> getAllPatientsByFirstName(String firstName);
	public List<CcmPatient> getAllPatientsByNationalHealthIdFilter(String nationalHealthIdFilter);
}
