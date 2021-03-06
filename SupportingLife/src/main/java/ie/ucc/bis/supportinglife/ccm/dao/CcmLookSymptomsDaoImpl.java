package ie.ucc.bis.supportinglife.ccm.dao;

import ie.ucc.bis.supportinglife.ccm.domain.CcmPatientLookSymptoms;
import ie.ucc.bis.supportinglife.ccm.domain.CcmPatientVisit;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

@Repository
public class CcmLookSymptomsDaoImpl implements CcmLookSymptomsDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<CcmPatientLookSymptoms> getLookSymptomsByVisit(CcmPatientVisit ccmPatientVisit) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<CcmPatientLookSymptoms> criteriaQuery = criteriaBuilder.createQuery(CcmPatientLookSymptoms.class);
		Root<CcmPatientLookSymptoms> root = criteriaQuery.from(CcmPatientLookSymptoms.class);
		
		criteriaQuery.select(root)
        	.where(criteriaBuilder.and(
        		criteriaBuilder.equal(root.get("visit"), ccmPatientVisit)));

		List<CcmPatientLookSymptoms> patientLookSymptomsResults = new ArrayList<CcmPatientLookSymptoms>();
		patientLookSymptomsResults = entityManager.createQuery(criteriaQuery).getResultList();
	    return patientLookSymptomsResults;	
	}
}
