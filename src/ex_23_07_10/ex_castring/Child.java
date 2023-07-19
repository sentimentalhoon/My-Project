package ex_23_07_10.ex_castring;

public class Child extends Parent {    

    public void makeBong(){
        System.out.println("C : 맛있는 봉골레 파스트를 만든다");
    }
    @Override
    public void makeSteak(){
        System.out.println("C : 버터에 아스파라거스를 추가해서 스테이를 굽는다.");
    }
    // 메소드 오버로딩 == 중복정의
    // 메소드 오버라이딩 == 재정의
    // : 상속이 전제되었을 때, 부모클래스가 가지고 있는 메소드를 그대로 가지고 와서
    //   (리턴타입, 메소드명, 매개변수 등)
    /**
     * @author 멍멍
     * @since 23.07.12
     * @param 매개 변수 설명
     * @return 리턴값
     */
    @Override
    public void makeAlio() {
        System.out.println("C : 알리오");
    }    
}
