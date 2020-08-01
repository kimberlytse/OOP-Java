public class ClassDerivationEx { // Program used to run the GenericItem and ProduceItem
	public static void main(String[] args) {
		GenericItem miscItem = new GenericItem();
		ProduceItem perishItem = new ProduceItem();

		miscItem.setName("Smith Cereal");
		miscItem.setQuantity(9);
		miscItem.printItem();

		perishItem.setName("Apples");
		perishItem.setQuantity(40);
		perishItem.setExpiration("May 5, 2012");
		perishItem.printItem();

		System.out.println("  (Expires: " + perishItem.getExpiration() + ")");

		return;
	}
}