package sec01.exam01;

public class Tv extends Display implements RemoteControl, OTT {
	
	// 상속은 하나만 interface는 무한으로 가능
	int vol;

	@Override
	public void turnOn() {
		System.out.println("tv를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("tv를 끕니다.");
		
	}
					// max 이상이면 max값 고정
					// min 이하면 min값 고정
					// RemoteControl.Max_VOLUME
					// default 
	@Override
	public void setVolume(int vol) {
		
		if(vol > RemoteControl.Max_VOLUME) vol = RemoteControl.Max_VOLUME; 
		else if(vol < RemoteControl.MIN_VOLUME) vol = RemoteControl.MIN_VOLUME; 
		
		this.vol = vol;
		}

	@Override
	public void NetFlix() {
		System.out.println("넷플릭스 시청");
		
		}


	
	}
			

