class Inventory {
	
	private List<Supply> supplies = new ArrayList<>();
	
	List<Supply> find(String regex) {
		List<Supply> result = new LinkedList<>();
		for (Supply supply : supplies) {
			if (Pattern.matches(regex, supply.toString())) {
				result.add(supply);
			}
		}
		return result;
	}
}