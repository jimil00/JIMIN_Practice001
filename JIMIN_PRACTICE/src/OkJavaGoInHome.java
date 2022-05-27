import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;
// import는 파일을 불러오는 함수
public class OkJavaGoInHome {

	public static void main(String[] args) {
	
		String id = "JAVA APT 507";
		
		
		// Elevator call -> 엘리베이터를 호출해보자
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// 자바아파트 507호가 소속된 엘리베이터가 호출돼서 1층으로 내려감
		
		// Security off 보안을 해제해보자
		Security mySecurity = new Security (id);
		mySecurity.off();
		
		// 자바아파트 507호의 보안이 해제됨
		
		// Light on 집의 불을 켜보자
		Lighting hallLamp = new Lighting (id+" / Hall Lamp ");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting (id+" / Hall Lamp ");
		floorLamp.on();
		
		// 거실과 스탠드 등 켜짐 
		

	}

}

// 스마트폰앱이나 스마트워치 등 편리한 플랫폼에 이러한 코드를 입력하면 삶이 더 윤택해진다. 이런 프로그래밍을 통해 많은 일을 자동화시킬 수 있다.
