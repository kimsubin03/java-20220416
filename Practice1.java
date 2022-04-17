
public class Practice1 {
	public static void main(String[] args) {
		//4대 구성요소
		//자료형,변수,조건문,반복문
		
		//특정 상황에만 수행되어야하는 명령
		//조건에 맞을 떄만 실행하고 싶다. -> 실행이 될 때도 있고 안될 때도 있다.

		//만약에 날씨가 좋으면 실행하라.
		
		//1.맑음 2.비
		// 변수 -> 값을 바꿀 수 있다.
		int weather=1;
//		System.out.println(weather);
		// ==좌항과 우항이 같다면
		// 양자택일
		
		if (weather==1) {
			System.out.println("창문을 열어라");
			
		}
		else {
			System.out.println("창문을 닫아라");
		}
		//할인대상, 성별, 동전의 앞뒤, 미성년자여부
		
		int sex = 1; //1.남자 2.여자
		
		if (sex==1) {
			System.out.println("남자입니다.");
		}
		else {
			System.out.println("여자입니다.");
		}
		
		//삼자택일, 사자택일
		//갈림길 -> 좌,직,우
		//객관식 ->정답 보기 5개중한개
		int crossroad = 1; //1.좌, 2.직, 3.우
		
//		if(crossroad==2) {
//		System.out.println("직진을 합니다.");
//		}
//		else {
//			if(crossroad==1) {
//				System.out.println("좌회전을 합니다.");
//		}
//			else {
//				System.out.println("우회전을 합니다.");
 //       }
//		}
//		
//	}
//}
		if(crossroad==2) {
			System.out.println("직진을 합니다.");
			}
		else if(crossroad==1)  {
			System.out.println("좌회전을 합니다.");
			}
		else {
			System.out.println("우회전을 합니다.");
			}
	}
		
		
}