// 인스턴스 생성 위치
package step07;

 public class Exam058_0 {
   static int[] m1() {
     return m2();
   }
   static int[] m2() {
     return m3();
   }
   static int[] m3() {
     return new int[]{10,20,30};
   }
   public static void main(String[] args) {
  int[] arr1 = m1();
  }
  }






/*
인스턴스

인스턴스의 생성 위치와 상관없이
new로 생성된 객체는 무조건 heap 메모리 영역에 모인다.
따라서 메서드 호출이 끝나더라도 제거되지않는다. ex) new int[]{값}
=> 메서드 호출이 끝날 때 제거되는 것은
stack 메모리에 존재하는 로컬 변수이다. ex) m1 m2 m3



*/
