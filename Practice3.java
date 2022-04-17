
public class Practice3 {

	public static void main(String[] args) {
		//반복문 -> while,for
		
		//명령을 n번 반복해라
		
		//반복문 -> 반복횟수를 세서 내가 원하는 횟수에서 멈춘다.
		
		//for(시작; 끝; 증가량)
		
		for(int i=0; i<10;i++){
			System.out.println("hello");
			
		}
		//100에서 1000사이 짝수 출력
		//v1
		for(int i=100; i<=1000; i=i+2) {
			System.out.println(i);
		}
		//v2
		//짝수 판별법 ==> 나눈 나머지
		
		System.out.println(10+20);
		System.out.println(10*20);
		System.out.println(300/4); // /나누기 몫
		System.out.println(230%4); // %나누기 나머지
		
		
		//복합대입연산자, 증감연산자
		int num =5;
		num =num+1; 
		num+=1;
		
		num =num+10;
		num+=10;
		
		num/=2;//절반으로 감소
		
		//증감연산자
		num++;//1씩 증가
		num--;//1씩 감소
		
		
		for(int i=100; i<=1000; i=i+2) {
			if(i%2==0) {
				System.out.println(i);
			}
			else {
				System.out.println("홀수입니다.");
			}
		}
		
		
		
	}
}

