package genericDeser.util;

import genericDeser.fileOperations.Logger;

public class First {
	private int IntValue;
	private String StringValue; 
	private short ShortValue;
	private float FloatValue;
	private byte ByteValue;
	private long LongValue;
	private double DoubleValue;
	private boolean BooleanValue;
	private char CharValue;
	
	public First(){
		Logger.writeMessage("Constructor of First Called",Logger.DebugLevel.CONSTRUCTOR);
	}

	public int getIntValue() {
		return IntValue;
	}

	public void setIntValue(int intValue) {
		IntValue = intValue;
	}

	public String getStringValue() {
		return StringValue;
	}

	public void setStringValue(String stringValue) {
		StringValue = stringValue;
	}

	public short getShortValue() {
		return ShortValue;
	}

	public void setShortValue(short shortValue) {
		ShortValue = shortValue;
	}

	public float getFloatValue() {
		return FloatValue;
	}

	public void setFloatValue(float floatValue) {
		FloatValue = floatValue;
	}

	public byte getByteValue() {
		return ByteValue;
	}

	public void setByteValue(byte byteValue) {
		ByteValue = byteValue;
	}

	public long getLongValue() {
		return LongValue;
	}

	public void setLongValue(long longValue) {
		LongValue = longValue;
	}

	public double getDoubleValue() {
		return DoubleValue;
	}

	public void setDoubleValue(double doubleValue) {
		DoubleValue = doubleValue;
	}

	public boolean isBooleanValue() {
		return BooleanValue;
	}

	public void setBooleanValue(boolean booleanValue) {
		BooleanValue = booleanValue;
	}

	public char getCharValue() {
		return CharValue;
	}

	public void setCharValue(char charValue) {
		CharValue = charValue;
	}
}
