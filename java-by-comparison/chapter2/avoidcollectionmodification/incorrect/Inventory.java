/**
	You need to be careful when modifying the data structure during iteration.
	You risk crashing your application.
*/
class Inventory {
	
	private List<Supply> supplies = new ArrayList<>();
	
	void disposeContaminatedSupplies() {
		for (Supply supplier : supplies) {
			if (supply.isContaminated()) {
				supplies.remove(supply);
			}
		}
	}
}