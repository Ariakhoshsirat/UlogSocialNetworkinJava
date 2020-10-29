package FB;

/**
 * Profile entity. @author MyEclipse Persistence Tools
 */
public class Profile extends AbstractProfile implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Profile() {
	}

	/** minimal constructor */
	public Profile(Integer id) {
		super(id);
	}

	/** full constructor */
	public Profile(Integer id, String username, String password,
			String firstName, String lastName, String picture) {
		super(id, username, password, firstName, lastName, picture);
	}

}
