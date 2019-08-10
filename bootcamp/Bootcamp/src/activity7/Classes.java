package activity7;

public class Classes {
	public static void main(String[] args) {
		User jim = new User("Jim", "jim@wonderland.edu");
		
		jim.introduce();
		
		System.out.println(User.getCount());
		
		User throwaway = new User("", "");
		
		System.out.println(User.getCount());
	}
}
