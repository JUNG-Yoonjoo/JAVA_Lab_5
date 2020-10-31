
public class MyDate implements Comparable {
	private int year, month, day;
	
	public int compareTo(Object other) {
	    MyDate date = (MyDate) other;
		int diffYear = year - date.year;
		if (diffYear < 0) return -1;
		else if (diffYear > 0) return 1;
		
		int diffMonth = month - date.month;
		if (diffMonth < 0) return -1;
		else if (diffMonth > 0) return 1;
		
		int diffDay = day - date.day;
		if (diffDay < 0) return -1;
		else if (diffDay > 0) return 1;
		
		return 0;
	}
	
	public MyDate(int year, int month, int day) {
		this.year = (year >= 1000 && year <= 3000) ? year : 2000;
		this.month = (month >= 1 && month <= 12) ? month : 1;
		this.day = (day >= 1 && day <= 31) ? day : 1;
	}
	
	public boolean equals(MyDate date) {
		return (year == date.year && month == date.month && day == date.day);
	}
	
	
	public String toString() {
		return day + "/" + month + "/" + year;
	}
}
