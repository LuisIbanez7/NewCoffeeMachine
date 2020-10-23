

public class JunitTesting {

	public void PickOptionA() {
		CoffeeTouchscreenAdapter adapter = new CoffeeTouchscreenAdapter(new OldCoffeeMachine());
		adapter.chooseFirstSelection();
		adapter.chooseSecondSelection();
	}
}
