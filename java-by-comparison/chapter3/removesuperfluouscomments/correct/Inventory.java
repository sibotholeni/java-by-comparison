class Inventory {
	
	List<Supply> supplies = new ArrayList<>();
	
	int countContaminatedSupplies() {
		if (supplies == null || supplies.isEmpty()) {
			// No supliers => no contamination
			return 0;
		}
		
		int contaminatedCounter = 0;
		for (Supply supply : supplies) {
			if (supply.isContaminated()) {
				contaminatedCounter++;
			}
		}
		
		return contaminatedCounter;
	}
}