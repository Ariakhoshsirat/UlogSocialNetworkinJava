package FB;

import java.util.Date;
import java.util.List;

public class Post {
	
	
	private String text;
	private Date date;
	private Integer pid;
	private Integer posterid;
	private List<Comment> comments;
	
	
	public void setText(String text) {
		this.text = text;
	}
	public String getText() {
		return text;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getDate() {
		return date;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getPid() {
		return pid;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setPosterid(Integer posterid) {
		this.posterid = posterid;
	}
	public Integer getPosterid() {
		return posterid;
	}
}
