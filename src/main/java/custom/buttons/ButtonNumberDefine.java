package custom.buttons;

@SuppressWarnings("serial")
public class ButtonNumberDefine extends ButtonDefault {
	public ButtonNumberDefine(int number) {
		setText(Integer.toString(number));
		setSize(45, 45);
	}
}
