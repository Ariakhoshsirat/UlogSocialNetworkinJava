package FB;

import java.util.List;


/**
 * AbstractProfile entity provides the base persistence definition of the
 * Profile entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractProfile implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String picture; 
	private List<Interest> interests;
	private List<Friend> friends;
	private List<Post> posts;
	// Constructors

	/** default constructor */
	public AbstractProfile() {
	}

	/** minimal constructor */
	public AbstractProfile(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractProfile(Integer id, String username, String password,
			String firstName, String lastName, String picture) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.picture = picture;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public void setFriends(List<Friend> friends) {
		this.friends = friends;
	}

	public List<Friend> getFriends() {
		return friends;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setInterests(List<Interest> interests) {
		this.interests = interests;
	}

	public List<Interest> getInterests() {
		return interests;
	}

}