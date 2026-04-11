class Inventory {
	
	private List<Supply> supplies = new ArrayList<>();
	
	int getQuantity(Supply supply) {
		if (supply == null) {
			throw new NullPointerException("supply must not be null");
		}
		
		int quantity = 0;
		for (Supply supplyInStock : supplies) {
			if (supply.equals(supplyInStock)) {
				quantity++;
			}
		}
		
		return quantity;
	}
}