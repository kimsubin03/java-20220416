
public class MyFirstApp {
	

	//주석:메모하거나 안쓰는 코드를 잠깐 가릴 때 단축키: 컨트롤 +/
	//들여쓰기- 단축키 tab
	//{}:영역표현-새로운 영역이 열리면
	//시작지점(main) 작성 -> 메인메서드
	public static void main(String[] args) {
		//출력 
		//;(세미콜론) -> 하나의 명령을 마무리함.
		//프로그램 실행 단축키 : F11
		System.out.println(100);
		System.out.println("김수빈");//문자 표현과 명령어 표현 구분 ->"" 유무
		//프로그램은 위에서 아래로 순차 실행
		//값 ==> 데이터 ==> 자료
		System.out.println(100);//정수(int)
		System.out.println("100");//문자열(String)
		System.out.println(100.0);//실수(double)
		
		//자료형-->프로그래밍의 50% 이상의 지분
		//100을 정수로 세번 출력
		
		//값을 저장해야한다.-> 변수에 저장
		//상자 만들기 -> 변수 선언
		
		//어떤 유형의 데이터를 저장할 것이며, 상자를 어떻게 찾을 것이냐
		int num1;
		
		//상자에 저장--> 변수에 대입
		//int num =300; 중복선언
		//이미 만들어진 변수를 사용할 땐 자료형 없이 변수명으로만 사용
		//300= num--> 저장소 왼쪽, 값이 오른쪽, 위치 어김.
		
		int num2;
		
		num1 = 10;
		num2 = 20;
		System.out.println(num1);
		System.out.println(num2);
		
		//int num;
		//num = 200;
		
		//System.out.println(num);
		//System.out.println(num);
		//System.out.println(num);
		}
}
