package day_5_15;

public class Time {

	private int hour;
	private int minute;
	private int second;
	private boolean am;

	public Time() {
		// System.out.println("time call");
		this(12, 0, 0, "am");
	}

	public Time(int h, int m, int s) {
		System.out.println("time call");
		this.setHour(h);
		this.setMinute(m);
		this.setSecond(s);
		this.setAm(true);
	}

	public Time(int h, int m, int sec, String s) {

		this(h, m, sec);

		if (s == "am") {
			this.am = true;
		} else if (s == "pm") {
			this.am = false;
		}
	}

	public void setHour(int hour) {
		if (0 <= hour && hour < 23) {
			this.hour = hour;
		}
	}

	public int getHour() {
		return this.hour;
	}

	public int getMinute() {
		return this.minute;
	}

	public void setMinute(int minute) {
		if (minute >= 0 && minute < 60) {
			this.minute = minute;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (minute >= 0 && minute < 60) {
			this.second = second;
		}
	}

	public boolean isAm() {
		return am;
	}

	public void setAm(boolean am) {
		this.am = am;
	}

	public void print() {

		String s = "am";

		if (this.am == false) {
			s = "pm";
		}

		System.out.println("Hour = " + this.hour);
		System.out.println("Minute = " + this.minute);
		System.out.println("Second = " + this.second);
		System.out.println(this.hour + "½Ã " + this.minute + "ºÐ " + this.second + "ÃÊ " + s);

	}

}
