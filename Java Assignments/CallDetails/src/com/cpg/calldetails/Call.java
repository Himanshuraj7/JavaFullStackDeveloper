package com.cpg.calldetails;

public class Call {
	
private int callId;
private long calledNumber;
private float duration;

public int getcallId() {
return callId;
}


public void setCallId(int callId) {
	this.callId = callId;
}

public long getCalledNumber() {
	return calledNumber;
}

public void setCalledNumber(long calledNumber) {
	this.calledNumber = calledNumber;
}

public float getDuration() {
	return duration;
}

public void setDuration(float duration) {
	this.duration = duration;
}

public void parsedata(String details) {
	String[] data= details.split(":");

	setCallId(Integer.parseInt(data[0]));
	setCalledNumber(Long.parseLong(data[1]));
	setDuration(Float.parseFloat(data[2]));
}

}
