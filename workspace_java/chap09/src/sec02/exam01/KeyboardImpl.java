package sec02.exam01;

public class KeyboardImpl implements Keyboard {

	@Override
	public String press(int keyCode) {
		if(keyCode == 13) {
			return "Enter";
		}
		return "무언가 눌림";
	}

}
