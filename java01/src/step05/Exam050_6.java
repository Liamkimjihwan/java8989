
package step05;

 public class Exam050_6 {
   public static void main(String[] args) {

    for(int a =2; a < 10; a++) {
      for(int b =1; b < 10; b++) {
        System.out.printf("%d * %d = %d\n", a, b, a*b);
      }
      System.out.println();


      }
    }

  }





/*
for 반복문
= 인덱스를 가지고 반복할 때 자주 사용
특히 배열을 다룰 때 사용
문법은
for (변수선언부; 조건; 값 증가) 문장;
for (변수선언부; 조건; 값 증가) {문장1; 문장2; ...}


실행 순서
1) 변수 선언부 실행
2)조건 실행
3)문장 실행
4)값증가 실행
5) 2번으로 다시

*/
