package java_ch06_0513;

public class MemberService {
		
	public boolean login(String id, String password) {
		
		if((id.equals("hong") && password.equals("12345"))) {
			return true;		
		}else {
			return false;
			
		}
	}
	
	public void logout(String id) {
		System.out.println("logout되었습니다.");
	}
	
}
