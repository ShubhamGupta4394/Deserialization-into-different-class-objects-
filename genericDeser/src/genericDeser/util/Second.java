package genericDeser.util;

import genericDeser.fileOperations.Logger;

public class Second {
	private long LongValue;
	private short ShortValue;
	private double DoubleValue;
	private String StringValue;
	
	public Second(){
		Logger.writeMessage("Constructore of Second Called", Logger.DebugLevel.CONSTRUCTOR);
	}

	public long getLongValue() {
		return LongValue;
	}

	public void setLongValue(long longValue) {
		LongValue = longValue;
	}

	public short getShortValue() {
		return ShortValue;
	}

	public void setShortValue(short shortValue) {
		ShortValue = shortValue;
	}

	public double getDoubleValue() {
		return DoubleValue;
	}

	public void setDoubleValue(double doubleValue) {
		DoubleValue = doubleValue;
	}

	public String getStringValue() {
		return StringValue;
	}

	public void setStringValue(String stringValue) {
		StringValue = stringValue;
	}
	
}
