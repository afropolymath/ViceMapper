package com.andelahackathon.vicemapper;

import com.firebase.client.DataSnapshot;

public class Vars {
	
	private static String toLocation;
	private static DataSnapshot snapRecords;
	
	public static void setToString(String toLocation) {
		Vars.toLocation = toLocation;
	}
	
	public static String getToString() {
		return Vars.toLocation;
	}

	public static DataSnapshot getSnapRecords() {
		return snapRecords;
	}

	public static void setSnapRecords(DataSnapshot snapRecords) {
		Vars.snapRecords = snapRecords;
	}
}
