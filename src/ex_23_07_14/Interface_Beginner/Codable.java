package ex_23_07_14.Interface_Beginner;

public interface Codable {
    /**
     * : interface 키워드를 사용하여 선언한다.
     * : 추상메소드를 가질 수 있다 --> 구현의 강제성을 부여 가능하다.(프로젝트 설계도면)
     * 
     * 추상클래스가 가지고 있는 추상 메소드
     * 추상클래스를 상속받는 자식클래스는 반드시 추상메소드를 오버라이딩(재정의) 해야하는 특징
     * 
     * interface 의 특징
     * 1) 추상메소드만 선언 가능하기 때문에 abstract 키워드 생략 가능
     * 2) 접근제한자는 public 만 사용 가능하지만 생략 가능하다.
     * 3) 객체생성이 불가능하다.
     * 4) 필드는 상수만 가질 수 있다. --> final 키워드 생략 가능
     *    -- The blank final field code may not have been initializedJava(33554513)
     * 5) interface 는 다중 상속(구현 implements)이 가능하다.
     */
     void coding();
     
     /** JAVA 7 버젼 이후 버젼은 사용 가능. */
     default void running(){}
     static void flying(){}
}
