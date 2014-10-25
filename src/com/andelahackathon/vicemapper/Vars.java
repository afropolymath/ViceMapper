package com.andelahackathon.vicemapper;

import java.util.ArrayList;

import com.firebase.client.DataSnapshot;

public class Vars {
	
	private static String toLocation;
	private static DataSnapshot snapRecords;
	private static String fromLocation;
	
	public static void setDirectionSet(String fromLocation, String toLocation) {
		Vars.toLocation = toLocation;
		Vars.fromLocation = fromLocation;
	}
	
	public static ArrayList<String> getDirectionSet() {
		ArrayList<String> resultSet = new ArrayList<String>();
		resultSet.add(Vars.toLocation);
		resultSet.add(Vars.fromLocation);
		return resultSet;
	}

	public static DataSnapshot getSnapRecords() {
		return snapRecords;
	}

	public static void setSnapRecords(DataSnapshot snapRecords) {
		Vars.snapRecords = snapRecords;
	}
}
