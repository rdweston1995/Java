package activity7;

public class User {
	private static int sUsersCreated = 0;
	
	private String username;
	
	private String email;
	
	User(String username, String email){
		this.setUsername(username);
		this.setEmail(email);
		
		User.sUsersCreated += 1;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	private void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	private void setEmail(String email) {
		this.email = email;
	}
	
	public void introduce() {
		System.out.println(String.format("My username is %s.", this.username));
	}
	
	public static int getCount() {
		return User.sUsersCreated;
	}
}
