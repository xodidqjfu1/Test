package java05_array.array2D;

import java.util.Scanner;

public class Array2D_04 {

	public static void main(String[] args) {
		
		
		//학생 성적 관리 프로그램
		// -> 국영수 3과목 점수
		
		//	점수 1개			-> int
		//	3과목 점수 			-> int[3]
		//	4학생의 점수들 		-> int[4][3]
		//	2개의 학급			-> int[2][4][3]
		
		//-----------------------------------------------------
	      //QUIZ.
	      //   2명의 국어, 영어, 수학 점수를 처리하기
	      //   학생들의 점수를 입력받고 총점과 평균을 계산하여 출력한다 
	      
	      //   ** 2차원배열 이용해보기
	      
	      //   int[2][3] - 학생들 점수
	      //   int[2] - 학생들 총점
	      //   double[2] - 학생들 평균
	      
	      //----- 최종 출력 -----
	      //   번호   국어   영어   수학   총점   평균
	      //   1번      xxx      xxx      xxx      xxx      xxx.xx // [0][0]~[0][2]
	      //   2번      xxx      xxx      xxx      xxx      xxx.xx
		
			int[][] score = new int[2][3]; //학생들 점수
			double[] avg = new double[2]; //학생들 평균
			int[] sum = new int[2]; //학생들 총점
			String[] subject= {"국어", "영어", "수학"};
			
			Scanner sc = new Scanner(System.in);
			
			for (int i = 0; i < score.length; i++) {
				
				for (int j = 0; j < score[i].length; j++) {
					
					System.out.print((i+1) +"번 학생의 "+ subject[j] +" 점수를 입력하세요 : ");
					score[i][j] = sc.nextInt(); //2명에 대한 3과목 점수 입력
					sum[i] += score[i][j]; // 총점 계산
					avg[i] = sum[i]/3; //평균 계산
				}
				
			}
			
			System.out.println("------최종출력------");
			System.out.println("번호\t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
			
			for (int i = 0; i < score.length; i++) {
//				번호
				System.out.print(i+1 + "번 \t");
				
				//학생의 과목 점수 개수만큼 반복
				for (int j = 0; j < score[i].length; j++) {
					System.out.print(score[i][j] + "\t");
				}
				
//				총점
				System.out.print(sum[i] + "\t");
				
//				평균
//				System.out.println(avg[i]);
//				System.out.println(String.format( "%.2f", avg[i]));
//				System.out.printf("%.2f\n",avg[i]);
				System.out.printf("%.2f\n",avg[i]);
				System.out.println();
			}
			
//			for (int i = 0; i < score.length; i++) {
//				System.out.print(i+1 + "번 \t");
//				for (int j = 0; j < score[i].length; j++) {
//					
//					
//					System.out.print( score[i][j] + "\t");
//				}
//				System.out.print(sum[i] + "\t");
//				System.out.print(avg[i]);
//				
//				System.out.println();
//			}
		
		
	}

}
