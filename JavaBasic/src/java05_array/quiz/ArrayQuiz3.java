package java05_array.quiz;

public class ArrayQuiz3 {

	public static void main(String[] args) {
		
//		 배열이 선언된 뒤 문제를 푸시오
//
//		 - arr 배열을 invert_arr라는 배열에 거꾸로 입력하시오
//		 => invert_arr : { 21, 13, 9, 8, 10, 27, 9, 3, 17, 10 }
		
			int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
			int[] invert_arr = new int[arr.length];
			
//			for(int i = arr.length-1; i>=0; i--) { //i=9일 때 10
//				invert_arr[(arr.length-1-i)] = arr[i]; 
//			}
//			
//			for (int i = 0; i < invert_arr.length; i++) {
//				
//				System.out.print(invert_arr[i] + " ");
//			}
//---------------------------------------------------------------
//		 - arr 배열의
//		  (짝수번째 인덱스 내용의 합) - (홀수번째 인덱스 내용의 합)을
//		  구하시오
//		     => -5
//

			int even = 0; //짝수 총합
			int odd = 0; //홀수 총합
			
			
			for(int i = 0; i<arr.length; i+=2) { //짝수번째 인덱스 합
				
				even += arr[i]; 
				
//				System.out.println(even);
			}
			
			for(int i = 1; i<arr.length; i+=2) { //홀수번째 인덱스 합
				
				odd += arr[i]; 
				
//				System.out.println(odd);
			}
			System.out.println(even - odd);
			
//---------------------------------------------------------------
			
			
			
//		 - arr 배열의 숫자들 중 높은 숫자가 1등이 되게하여
//		  rank_arr라는 배열에 순위를 입력하시오
//		    => arr :     { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 }
//		     => rank_arr :{  5,  3, 10,7,  1,  5, 9, 7,  4,  2 }
//
//			int[] rank_arr = new int[arr.length];
//			
//			for (int i = 0; i < arr.length; i++) { //i가 0번쨰 일 때 10일 때
//				int rank = 1;
//				for (int j = 0; j < arr.length; j++) { // j=1일 때 17
//					
//					if(arr[i]<arr[j]) { //10 < 17 true, 10<3 false ... +5
//						rank++; // j=2일 때 1 증가, ~~ 5증가
//					}
//					
//					rank_arr[i] = rank;
//				}
//				System.out.print(rank_arr[i] + " ");
//			}
			
			
			
			
			
//---------------------------------------------------------------
//		    => arr :     { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 }
//		 - arr 배열의 요소들 중 중복된 값은 over_arr에 넣고 중복되지
//		  않은 값은 ret_arr에 입력하시오
//		    ** over_arr, ret_arr은 길이가 10인 배열로 작성한다
//		    
//		    출력한다면 (정렬도 할 수 있으면 해도 됨)
//		    => over_arr : 9, 10
//		    => ret_arr : 3, 8, 13, 17, 21, 27
		 
			int[] over_arr = new int[10];
			int[] ret_arr = new int[10];
			int over = 0;
			
			for(int i=0; i<arr.length; i++) { //0부터 9까지
//		    => arr :     { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 }
				for (int j = i+1; j < arr.length; j++) {//1부터 9까지
//					if(arr[i]==arr[j]) { //i=0일 때, 10 중복이면 over_arr에 저장
//						arr[i] = arr[j];
//						over_arr[i] = arr[i];
//						break;
//					}
					if(arr[i]!=arr[j]) { //10 과 10이 같지않다면
//						arr[i] = arr[j]; // arr[i]에 
						ret_arr[i] = arr[j]; // ret_arr에 arr[j]값 넣기
						break;
					}
				}
			}
			
//			for(int i=0; i<over_arr.length; i++) {
//				System.out.println(over_arr[i]);
//			}
			
			for(int i=0; i<ret_arr.length; i++) {
				System.out.println(ret_arr[i]);
			}
			
		 
		 
		
	}

}
