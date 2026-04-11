class Mission {
	
	Logbook logbook;
	LocalDate start;
	
	void update(String author, String message) {
		final LocalDate today = LocalDate.now();
		String entry = String.format("%S: [%tm-%<te-%<tY] (Day %d)>%s%n", author, today, ChronoUnit.Days.between(start, today) + 1, message);
		logbook.write(entry);
	}
}