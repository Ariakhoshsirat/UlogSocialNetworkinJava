package FB;

import java.util.Date;

public class Comment {
	private String text;
	private Date date;
	private Integer ownerId;
	private Integer cid;
	

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}
	public Integer getOwnerId() {
		return ownerId;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getText() {
		return text;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getCid() {
		return cid;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getDate() {
		return date;
	}
}
