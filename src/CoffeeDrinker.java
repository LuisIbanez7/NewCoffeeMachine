public class CoffeeDrinker {

	public static void main(String[] args) {
		CoffeeTouchscreenAdapter adapter = new CoffeeTouchscreenAdapter(new OldCoffeeMachine());
		adapter.chooseFirstSelection();
		adapter.chooseSecondSelection();
	}

}
