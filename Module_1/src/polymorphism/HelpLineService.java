package polymorphism;

public class HelpLineService {
	/**
	 * The below example is using Object oriented programming
	 * 
	 * @param pc
	 */
	void help(Police pc) {
		System.out.println("The caller is a Police man...	connect to control room");
	}

	void help(AccidentVictim av) {
		System.out.println("The caller is a Accident Victim... connect to doctor");
	}

	void help(Helper hp) {
		System.out.println("The caller is a helper... let's help him");
	}

	/**
	 * The wrong way is using if else if
	 * 
	 * @param args
	 */
/*	void help(Object o) {
		if (o instanceof Police) {
			System.out.println("The caller is a Police man...	connect to control room");
		} else if (o instanceof AccidentVictim) {
			System.out.println("The caller is a Accident Victim... connect to doctor");

		} else if (o instanceof Helper) {
			System.out.println("The caller is a helper... let's help him");
		}
	}
*/

	public static void main(String[] args) {

		Police pc = new Police();
		AccidentVictim ac = new AccidentVictim();
		Helper hp = new Helper();
		HelpLineService obj = new HelpLineService();

		obj.help(pc);
		obj.help(ac);
		obj.help(hp);

	}
}

class Police {
}

class AccidentVictim {
}

class Helper {
}