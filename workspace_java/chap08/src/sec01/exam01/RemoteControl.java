package sec01.exam01;

// new 못함
public interface RemoteControl {
	
	static final int Max_VOLUME = 10;
	// 모든 필드는 public static final (상수) 이다.
	// 그래서 생략 가능하다.
	public int MIN_VOLUME = 0;
	
	public abstract void turnOn();
	// 기본적으로 메소드는 abstract 이다.
	// 그래서 생략 가능하다
	public void turnOff();
	public void setVolume(int vol);
	
	default void mic(String text) {
		// 마치 클래스의 메소드처럼 실행 블럭, 구현블럭을 가진다.
	}
	
}
