package ex_23_07_10.ex_castring;

public class Main {
    public static void main(String[] args) {

        // 실행하는 공간
        Child child = new Child();
        child.makeAlio();
        child.makeSteak();
        // 자식 클래스가 부모클래스의 메소드를 오버라이딩한 경우
        // 오버라이딩한 메소드가 호출된다.

        /**
         * 자바에서 상속의 특징
         * 
         * 1. 다중상속을 지원하지 않는다.
         * 
         * 2. 상속의 횟수는 제한을 두지 않는다.
         * -- 하나의 클래스는 부모클래스가 될 수도 있고 자식 클래스가 될 수 있다.
         * -- 부모클래스는 여러 개의 자식 클래스를 가질 수 있다.
         * 
         * 3. 모든 클래스는 object (최상위 클래스) 를 상속 받고 있다.
         * 
         * ===========================================================================
         * 
         * 객체의 형변환 (Casting)
         * 
         * 1. 기본 자료형
         * -- > boolean, int, char, long, double, float, short, byte
         * 
         * 2. 레퍼런스 타입의 자료형
         * : 객체 내 필드, 메소드의 접근 권한을 기준으로 강제, 자동 형변환 결정
         * : 상속이 전제되어있을 때, 객체의 형변환 가능.
         *
         * (1) 자동 형변환 (UpCasting)
         * 자식 클래스가 부모 클래스 자료형으로 자동으로 형변환 하는 것을 업캐스팅이라 부른다.
         */
        Parent parent = new Child();
        parent.makeSteak();
        // 업캐스팅 되었을 때, 자식클래스 (서브,하위)가 부모클래스 (슈퍼, 상위)의 메소드를
        // 오버라이딩한 경우에는, 자식클래스의 메소드가 호출된다.
        /**
         * (2) 강제 형변환 (DownCastring)
         * : 부모 클래스가 자식 클래스 강제 형변환
         * >> UpCastring 된 객체를 다시 본래 자신의 형태로 강제적으로 되돌리는 것
         * Syntax Error => 구문오류
         * Exception
         * === Child child2 = (Child) new Parent(); ===
         * 구문에는 문제가 없지만 jvm 이 컴파일하는 순간 exception 발생한다.
         */
        Child child2 = (Child) parent;
        child2.makeBong();
    }
}
