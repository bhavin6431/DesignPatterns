package org.hariom.designpatterns.abstractfactory;

import java.util.HashMap;
import java.util.Map;

public class Client {
	public static void main(String args[]) {

	}

	String kPeriodic(String s, int K) {
		// code here
		Map<Character, Integer> mp = new HashMap();
		for (int i = 0; i < s.length(); i++) {
			mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
		}
		if (mp.size() == 1) {
			return s;
		} else {
			if (s.length() % 2 != 0) {
				return "-1";
			}

			for (Character c : mp.keySet()) {
				if (mp.get(c) % 2 != 0) {
					return "-1";
				}
			}

			int l = 0;
			int r = (s.length() / 2);
			char ansv[] = new char[s.length()];
			for (Character c : mp.keySet()) {
				int count = mp.get(c);
				while (count > 0) {
					ansv[l++] = c;
					ansv[r++] = c;
					count -= 2;
				}
			}
			return new String(ansv);
		}
	}
}
