package hiding;

public class BirthDay {

	private int year;
	private int month;
	private int day;
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("날짜 오류입니다.");
			}
		}
		else {
			this.day = day;		
		}
	}
}
