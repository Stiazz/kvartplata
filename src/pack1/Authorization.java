package pack1;

public class Authorization {
	private int access;
	public int auth(String login, String pass){
		if(login.equals("Person") && pass.equals("123")){
			access = 1;
			return access;
		}else if(login.equals("Admin") && pass.equals("123")){
			access = 2;
			return access;
		}else{
		access = 0;
		}
		return access;
	}
}
