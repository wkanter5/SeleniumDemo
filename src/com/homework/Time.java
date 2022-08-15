package com.homework;

public class Time {
	
	
	int day, hour;
	String minutes;
	float second;

	
	
	public void setTime(int d,int h) {
		
		this.day = d;
		this.hour = h;
		
	}
	
	public void setTime(String m) {
		this.minutes= m;
		
	}
	
	public void setTime(float s) {
		this.second = s;
		
	}
	
	public void setTime(int d,int h,String m,float s) {
		
		this.day = d;
		this.hour= h;
		this.minutes = m;
		this.second= s;
		
	}
	
	
	public static void main (String[] args) {
		
		Time  obj = new Time();
		
		obj.setTime(3,2,"5 minutes",(float) 120.33);
		
		System.out.println("day is:" +obj.day +", hour is: "+obj.hour+", minutes is:"+obj.minutes+ ", seconds is:"+obj.second );
		
		
	}
}
