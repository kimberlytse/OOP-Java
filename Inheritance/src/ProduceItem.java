public class ProduceItem extends GenericItem { // ProduceItem derived from GenericItem
	private String expirationDate;

	public void setExpiration(String newDate) {
		expirationDate = newDate;
		return;
	}

	public String getExpiration() {
		return expirationDate;
	}

	@Override
	public void printItem() {
		System.out.println(itemName + " " + itemQuantity + " (Expires: " + expirationDate + ")"); // Notice how the
																									// itemName &
																									// itemQuantity
																									// variables are
																									// from
																									// GenericItem.java
		return;
	}

}