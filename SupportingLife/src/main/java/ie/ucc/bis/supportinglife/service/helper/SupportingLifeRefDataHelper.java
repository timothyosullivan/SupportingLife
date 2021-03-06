
package ie.ucc.bis.supportinglife.service.helper;

import ie.ucc.bis.supportinglife.reference.CcmCustomReportReferenceCriteria;
import ie.ucc.bis.supportinglife.reference.TeamMembers;

import java.util.Map;

public class SupportingLifeRefDataHelper implements SupportingLifeRefDataHelperInf {

	private CcmCustomReportReferenceCriteria ccmCustomReportReferenceCriteria;
	private Map<String, String> preDefinedReports;
	private Map<String, String> customReports;
	private TeamMembers teamMembers;

	@Override
	public CcmCustomReportReferenceCriteria getCcmCustomReportReferenceCriteria() {
		return ccmCustomReportReferenceCriteria;
	}

	public void setCcmCustomReportReferenceCriteria(
			CcmCustomReportReferenceCriteria ccmCustomReportReferenceCriteria) {
		this.ccmCustomReportReferenceCriteria = ccmCustomReportReferenceCriteria;
	}
	
	@Override
	public Map<String, String> getPreDefinedReports() {
		return preDefinedReports;
	}

	public void setPreDefinedReports(Map<String, String> preDefinedReports) {
		this.preDefinedReports = preDefinedReports;
	}

	@Override
	public Map<String, String> getCustomReports() {
		return customReports;
	}

	public void setCustomReports(Map<String, String> customReports) {
		this.customReports = customReports;
	}

	public TeamMembers getTeamMembers() {
		return teamMembers;
	}

	public void setTeamMembers(TeamMembers teamMembers) {
		this.teamMembers = teamMembers;
	}
}
