package Member;

import java.util.Scanner;

public class InputScanner {
    
    private InputScanner() {
    }

    private static InputScanner _instance = null;

    public static InputScanner getInstance() {
		if (_instance == null) {
			_instance = new InputScanner();
		}
		return _instance;
	}

    public Scanner getScanner(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }
}
