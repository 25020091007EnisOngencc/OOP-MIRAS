package Ornek1;

public class Time {
	private long hour;
	private long minute;
	private long second;
	

public Time(long hour, long minute, long second) {
	this.hour = hour;
	this.minute = minute;
	this.second = second;
}

public Time() {
	setTime(System.currentTimeMillis());
	
}

public Time(long elapseTime) {
	setTime(elapseTime);
}

public void setTime(long elapseTime) {
	long totalMilliseconds = elapseTime;
	long totalSeconds = totalMilliseconds / 1000;
	this.second = (int) (totalSeconds % 60);
	
	long totalMinutes = totalSeconds / 60;
	this.minute = (int) (totalMinutes % 60);
	
	long totalHours = totalMinutes / 60;
	this.hour = (int) (totalHours % 24);
	
}	public long getHour() {
		return hour;
}
	public long getMinute() {
		return minute;
}
	public long getSecond() {
		return second;
}


}






