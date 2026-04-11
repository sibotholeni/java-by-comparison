class Inventory {
	
	private List<Supply> supplies = new ArrayList<>();
	
	void disposeContaminatedSupplies() {
		Iterator<Supply> iterator = supplies.iterator();
		while (iterator.hasNex()) {
			if (iterator.next().isContaminated()) {
				iterator.remove();
			}
		}
	}
}