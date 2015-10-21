
public class AccessValidater {

	public static Boolean validate(String userId) {
		
		if(userId == "muskmelon") {
			System.out.print("Login success!\n");
			return true;
		}else {
			System.out.print("Login failed!\n");
			return false;
		}
	}
}
