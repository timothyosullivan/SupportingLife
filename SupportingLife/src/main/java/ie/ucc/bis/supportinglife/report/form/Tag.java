package ie.ucc.bis.supportinglife.report.form;

/**
 * @author TOSullivan
 *
 */
public class Tag {

	public int id;
	public String tagName;

	public Tag(int id, String tagName) {
		this.id = id;
		this.tagName = tagName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

}