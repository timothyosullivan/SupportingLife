package ie.ucc.bis.supportinglife.ccm.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 * Domain class capturing a CcmPatient entity
 * 
 * @author TOSullivan
 */
@Entity
@Table(name="sl_ccm_patient")
public class CcmPatient implements Serializable {
	
	/**
	 * Generated Serial Version Id
	 */
	private static final long serialVersionUID = -6120098477412745960L;

	@Id
	@Column(name="patient_id")
	@GeneratedValue
	private Long patientId;
	
	@Column(name="national_id")
	private String nationalId;
	
	@Column(name="national_health_id")
	private String nationalHealthId;
		
	@Column(name="child_first_name")
	private String childFirstName;

	@Column(name="child_surname")
	private String childSurname;
	
	@Column(name="date_of_birth")
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	
	@Column(name="age_months")
	private Integer ageMonths;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="caregiver_name")
	private String caregiverName;

	@Column(name="relationship")
	private String relationship;
	
	@Column(name="physical_address")
	private String physicalAddress;
	
	@Column(name="village")
	private String village;
	
	@Column(name="ta")
	private String ta;
	
	@Column(name="created_dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;
	
	@Column(name="updated_dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedDate;
	
	// association to sl_ccm_patient_visit table
	// - one patient can have many visits
	@OneToMany(cascade=CascadeType.ALL, mappedBy="patient")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<CcmPatientVisit> ccmPatientVisitList;
		
	// association to sl_ccm_ask_look_symptoms table
	// - a patient can have many 'ask-look' symptom assessments
	@OneToMany(cascade=CascadeType.ALL, mappedBy="patient")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<CcmPatientAskLookSymptoms> ccmPatientAskLookSymptomsList;
	
	// association to sl_ccm_patient table
	// - a patient can have many 'look' symptom assessments
	@OneToMany(cascade=CascadeType.ALL, mappedBy="patient")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<CcmPatientLookSymptoms> ccmPatientLookSymptomsList;
	
	// association to sl_ccm_patient_classification table
	// - a patient can have many classification assessments
	@OneToMany(cascade=CascadeType.ALL, mappedBy="patient")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<CcmPatientClassification> ccmPatientClassificationList;	

	// association to sl_ccm_patient_treatment table
	// - a patient can have many treatment assessments
	@OneToMany(cascade=CascadeType.ALL, mappedBy="patient")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<CcmPatientTreatment> ccmPatientTreatmentList;		
	
	public CcmPatient() {}

	/**
	 * Constructor
	 * 
	 * @param user
	 * @param childFirstName
	 * @param childSurname
	 * @param birthDate
	 * @param ageMonths
	 * @param gender
	 * @param caregiverName
	 * @param relationship
	 * @param otherRelationship
	 * @param physicalAddress
	 * @param villageTa
	 * @param createdDate
	 * @param updatedDate
	 */
	public CcmPatient(String nationalId, String nationalHealthId, String childFirstName, 
					String childSurname, Date birthDate, Integer ageMonths, String gender,
					String caregiverName, String relationship, 
					String physicalAddress, String village, String ta,
					Date createdDate, Date updatedDate) {

		setNationalId(nationalId);
		setNationalHealthId(nationalHealthId);
		setChildFirstName(childFirstName);
		setChildSurname(childSurname);
		setBirthDate(birthDate);
		setAgeMonths(ageMonths);
		setGender(gender);
		setCaregiverName(caregiverName);
		setRelationship(relationship);
		setPhysicalAddress(physicalAddress);
		setVillage(village);
		setTa(ta);
		setCreatedDate(createdDate);
		setUpdatedDate(updatedDate);
		
		Set<CcmPatientVisit> patientVisitList = new HashSet<CcmPatientVisit>();
		setCcmPatientVisitList(patientVisitList);
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getNationalHealthId() {
		return nationalHealthId;
	}

	public void setNationalHealthId(String nationalHealthId) {
		this.nationalHealthId = nationalHealthId;
	}

	public String getChildFirstName() {
		return childFirstName;
	}

	public void setChildFirstName(String childFirstName) {
		this.childFirstName = childFirstName;
	}

	public String getChildSurname() {
		return childSurname;
	}

	public void setChildSurname(String childSurname) {
		this.childSurname = childSurname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getAgeMonths() {
		return ageMonths;
	}

	public void setAgeMonths(Integer ageMonths) {
		this.ageMonths = ageMonths;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCaregiverName() {
		return caregiverName;
	}

	public void setCaregiverName(String caregiverName) {
		this.caregiverName = caregiverName;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getPhysicalAddress() {
		return physicalAddress;
	}

	public void setPhysicalAddress(String physicalAddress) {
		this.physicalAddress = physicalAddress;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getTa() {
		return ta;
	}

	public void setTa(String ta) {
		this.ta = ta;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Set<CcmPatientVisit> getCcmPatientVisitList() {
		return ccmPatientVisitList;
	}

	public void setCcmPatientVisitList(Set<CcmPatientVisit> ccmPatientVisitList) {
		this.ccmPatientVisitList = ccmPatientVisitList;
	}

	public Set<CcmPatientAskLookSymptoms> getCcmPatientAskLookSymptomsList() {
		return ccmPatientAskLookSymptomsList;
	}

	public void setCcmPatientAskLookSymptomsList(Set<CcmPatientAskLookSymptoms> ccmPatientAskLookSymptomsList) {
		this.ccmPatientAskLookSymptomsList = ccmPatientAskLookSymptomsList;
	}

	public Set<CcmPatientLookSymptoms> getCcmPatientLookSymptomsList() {
		return ccmPatientLookSymptomsList;
	}

	public void setCcmPatientLookSymptomsList(Set<CcmPatientLookSymptoms> ccmPatientLookSymptomsList) {
		this.ccmPatientLookSymptomsList = ccmPatientLookSymptomsList;
	}

	public Set<CcmPatientClassification> getCcmPatientClassificationList() {
		return ccmPatientClassificationList;
	}

	public void setCcmPatientClassificationList(Set<CcmPatientClassification> ccmPatientClassificationList) {
		this.ccmPatientClassificationList = ccmPatientClassificationList;
	}

	public Set<CcmPatientTreatment> getCcmPatientTreatmentList() {
		return ccmPatientTreatmentList;
	}

	public void setCcmPatientTreatmentList(Set<CcmPatientTreatment> ccmPatientTreatmentList) {
		this.ccmPatientTreatmentList = ccmPatientTreatmentList;
	}	
}
