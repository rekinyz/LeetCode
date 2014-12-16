package com.leetcode.oj;

/**
 * Compare Version Numbers
 * 
 * Compare two version numbers version1 and version1. If version1 > version2
 * return 1, if version1 < version2 return -1, otherwise return 0.
 * 
 * You may assume that the version strings are non-empty and contain only digits
 * and the . character. The . character does not represent a decimal point and
 * is used to separate number sequences. For instance, 2.5 is not
 * "two and a half" or "half way to version three", it is the fifth second-level
 * revision of the second first-level revision.
 * 
 * Here is an example of version numbers ordering:
 * 
 * 0.1 < 1.1 < 1.2 < 13.37
 * 
 * @author rekinyz
 *
 */
public class CompareVersionNumbers {

	public int compareVersion1(String version1, String version2) {
		String[] ver1 = version1.split("\\.");
		String[] ver2 = version2.split("\\.");
		int maxLen = Math.max(ver1.length, ver2.length);
		int[] newVer1 = new int[maxLen];
		int[] newVer2 = new int[maxLen];
		for (int i = 0; i < maxLen; i++) {
			if (i < ver1.length) {
				newVer1[i] = Integer.parseInt(ver1[i]);
			}
			if (i < ver2.length) {
				newVer2[i] = Integer.parseInt(ver2[i]);
			}
			if (newVer1[i] > newVer2[i]) {
				return 1;
			} else if (newVer1[i] < newVer2[i]) {
				return -1;
			}
		}
		return 0;
	}

	public int compareVersion(String version1, String version2) {
		String[] ver1 = version1.split("\\.");
		String[] ver2 = version2.split("\\.");
		int l1 = ver1.length;
		int l2 = ver2.length;
		int maxLen = Math.max(l1, l2);
		int v1, v2;
		for (int i = 0; i < maxLen; i++) {
			v1 = (i >= l1 ? 0 : Integer.parseInt(ver1[i]));
			v2 = (i >= l2 ? 0 : Integer.parseInt(ver2[i]));
			if (v1 > v2) {
				return 1;
			} else if (v1 < v2) {
				return -1;
			}
		}
		return 0;
	}

}
