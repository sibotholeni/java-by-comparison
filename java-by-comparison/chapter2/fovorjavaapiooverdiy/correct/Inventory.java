class Inventory {
	
	private List<Supply> supplies = new ArrayList<>();
	
	int getQuantity(Supply supply) {
		Objects.requireNonNull(supply, "supply must not be null");
		
		return Collections.frequency(supplies, supply);
	}
}