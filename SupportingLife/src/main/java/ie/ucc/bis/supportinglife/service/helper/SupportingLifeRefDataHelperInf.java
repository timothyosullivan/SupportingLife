package ie.ucc.bis.supportinglife.service.helper;

import ie.ucc.bis.supportinglife.reference.CcmCustomReportReferenceCriteria;
import ie.ucc.bis.supportinglife.reference.TeamMembers;

import java.util.Map;

public interface SupportingLifeRefDataHelperInf {

	public CcmCustomReportReferenceCriteria getCcmCustomReportReferenceCriteria();
	public Map<String, String> getPreDefinedReports();
	public Map<String, String> getCustomReports();
	public TeamMembers getTeamMembers();
}
