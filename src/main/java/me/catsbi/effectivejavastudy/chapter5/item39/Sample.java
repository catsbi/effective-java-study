package me.catsbi.effectivejavastudy.chapter5.item39;

//JUnit4 부터 사용되는 애노테이션 기반 테스트 메서드
public class Sample{
		@CatsbiTest public static void m1(){ } //성공해야 한다.
		public static void m2() { }
		@CatsbiTest public static void m3() { //실패해야 한다.
				throw new RuntimeException("실패");
		}
		@CatsbiTest public void m5(){ } //정적 메서드가 아니다.
		public static void m6(){ }
		@CatsbiTest public static void m7(){ //실패해야 한다.
				throw new RuntimeException("실패");
		}
		public static void m8(){ }

}
