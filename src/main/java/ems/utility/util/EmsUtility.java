package ems.utility.util;

import java.util.UUID;

import com.google.gson.Gson;

public class EmsUtility {

	public static boolean isNullOrEmpty(String s) {
		if (s.equals("") || s == null)
			return true;
		return false;
	}

	public static long getEpochTimeInMillis() {
		return System.currentTimeMillis();
	}

	public static String createUniqueId(String prefix) {

		UUID uniqueId = UUID.randomUUID();
		String epochTimeString = Long.toString(EmsUtility.getEpochTimeInMillis());
		String finalId = prefix + uniqueId + epochTimeString;
		finalId = finalId.replace("-", "");
		return finalId;
	}

	public static String toJsonString(Object obj) {
		Gson g = new Gson();
		return g.toJson(obj);
	}

}
