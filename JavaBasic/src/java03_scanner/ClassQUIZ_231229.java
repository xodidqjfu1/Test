package java03_scanner;

import java.util.Scanner;

public class ClassQUIZ_231229 {
	public static void main(String[] args) {
		
		   //3과목 점수 관리 프로그램
		   
		   //   국어, 영어, 수학
		   //   점수를 저장할 수 있는 변수를 만들고
		   //   3과목 점수를 입력받는다

		   //   총점과 평균을 포함한 결과를 출력한다

		//동작 예시)
		   
		//===== 입력 =====
		//Input Korean : 100
		//Input English : 99
		//Input Mathematics : 97

		//===== 출력 =====
		//국어   영어   수학   총점   평균
		//100   99   97   296   98.666666667
		
		Scanner sc = new Scanner(System.in);
		//-------------------------------------
		//국어 점수 입력
		System.out.print("Input Korean : ");
		int kor = sc.nextInt();
				
		//영어 점수 입력
		System.out.print("Input English : ");
		int eng = sc.nextInt();
		
		//수학 점수 입력
		System.out.print("Input Mathmetics : ");
		int math = sc.nextInt();
				
		//총점 계산
		int sum = kor + eng + math;
		
		//평균 계산
		double avg = sum / (double)3; // 최종결과 소수점을 감안해서 형변환
		
		//전체출력
		System.out.println();
		System.out.println();
		
		System.out.println("--- 출력 ---");
		System.out.println("국어	영어	수학	총점	평균"); //Tab 키로 4칸만큼 탭공간확보,\t (탭대용 아스키코드)
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(math + "\t");
		System.out.print(sum + "\t");
		System.out.println(avg);
		
				
	}

}
