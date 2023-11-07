package Netflux;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Episode example = new Episode("Thomas", Genre.Policer, 60*5, 1000000);
		
		User simpleUser = new User("user", "pass", "simple@gmail.com", 10, example);
		
		
	}

}
