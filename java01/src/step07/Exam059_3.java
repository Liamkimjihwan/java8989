// 사용자 정의 타입의 인스턴스 - 응용 1
// 반복문을 이요하여 배열 처리
package step07;

 public class Exam059_3 {

   public static void main(String[] args) {
    Student[] arr = new Student[3]; // 레퍼런스 배열을 3개 준비하라는 뜻.
                                     // Student 인스턴스가 아니다.
                                     // => Student s1, s2, s3; 와 같은 의미
                                     // String 객체 3개를 만드는것이 아니라
                                     // Student를 저장할수 있는 3개를 만들라는것.

  //arr1[0].name = "홍길동"; // 인스턴스에 값이 없기 때문에 0번째 정보를 못 가져옴.

 // 그래서 따로따로 인스턴스 배열로 만들어줘야함.
    arr[0] = new Student(); // []는 레퍼런스, ()는 인스턴스
    arr[1] = new Student();
    arr[2] = new Student();
// 각 배열 레퍼런스를 통해 인스턴스에 값을 저장한다.
    arr[0].name = "홍길동";
    arr[0].email = "hong@test.com";
    arr[0].tel = "111-1111";
    arr[0].age = 20;
    arr[0].working = true;

    arr[1].name = "임꺽정";
    arr[1].email = "leem@test.com";
    arr[1].tel = "111-1112";
    arr[1].age = 30;
    arr[1].working = false;


    arr[2].name = "유관순";
    arr[2].email = "yoo@test.com";
    arr[2].tel = "111-1113";
    arr[2].age = 40;
    arr[2].working = true;  // 2번방을 찾아가서 그 값을 주소에 넣어라.

  // 4)  각 배열 (arr[]) 레퍼런스가 가리키는 인스턴스에 값을 출력한다.
for (Student student : arr) {
  printStudent(student);
} //
  }
  // printStudent(arr[0]); 출력을 위한 방법.
  // arr 을 출력하는 것이라면 Student arr 이라고 해야하지만 arr[0] 부분을 출력하는 것이기에
  // student 주소를 받을 student 변수를 선언
static void printStudent(Student student) {
  System.out.printf("%s,%s,%s,%d,%b\n",
  student.name, student.email, student.tel, student.age, student.working);
}


 }





/*
# new Student[n]의 의미
- Student 레퍼런스 변수를 n개 배열로 만들라는 명령어.
- Student 인스턴스가 아니다.
- java는 인스턴스 배열을 만드는 명령어가 없다.

자바에서는 논리값을 제외한 모든 것들은 주소이다.

*/
