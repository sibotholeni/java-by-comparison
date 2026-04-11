class Mission {
	
	Logbook logbook;
	LocalDate start;
	
	void update(String  , String message) {
		LocalDate today = LocalDate.now();
		String month = String.valueOf(today.getMonthValue());
		String formattedMonth = month.length() < 2 ? "0" + month : month;
		String entry = author.toUpperCase() + ": [" + formattedMonth + "-" + today.getDayOfMonth() + "-" + today.getYear() + "]Day " + (ChronoUnit.DAYS.between(start, today) + 1) + ")>" + message + System.lineSeparator();
		logbook.write(entry);
	}
}