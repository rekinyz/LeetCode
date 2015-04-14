package com.leetcode.oj.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CollectionGen {
    public static <T> HashSet<T> toSet(T[] t) {
        HashSet<T> set = new HashSet<T>(t.length*2);
        for (T str : t) {
            set.add(str);
        }
        return set;
    }

    public static <T,V> HashMap<T, V> toMap(T[] s, V v) {
    	HashMap<T, V> set = new HashMap<T, V>(s.length*2);
    	for (T str : s) {
    		set.put(str, v);
    	}
    	return set;
    }
    public static <T> HashMap<T, Boolean> toMap(T[] s) {
        return toMap(s, false);
    }
    public static <T,V> HashMap<T, V> toMap(List<T> s, V v) {
        HashMap<T, V> set = new HashMap<T, V>(s.size()*2);
        for (T str : s) {
            set.put(str, v);
        }
        return set;
    }

    public static <T> HashMap<T,Integer> toMapCount(java.lang.Iterable<T> s) {
        HashMap<T, Integer> set = new HashMap<T, Integer>();
        for (T v : s) {
            Integer i = set.get(v);
            if (i == null) {
                set.put(v, 1);
            } else {
                i += 1;
            }
        }
        return set;
    }
    public static HashMap<Integer, Integer> toMapCount(int[] a) {
        HashMap<Integer, Integer> set = new HashMap<Integer, Integer>();
        for (int t : a) {
            Integer i = set.get(t);
            if (i == null) {
                set.put(t, 1);
            } else {
                i += 1;
            }
        }
        return set;
    }
    public static HashMap<Integer, Boolean> toMap(int[] a) {
        HashMap<Integer, Boolean> set = new HashMap<Integer, Boolean>(a.length*2);
        for (int i : a) {
            set.put(i, false);
        }
        return set;
    }
    
    public static <T> List<T> toList(T[] t) {
        List<T> a = new ArrayList<T>();
        for (T b : t) {
            a.add(b);
        }
        return a;
    }
    public static Integer[] intToInteger(int[] oldArray) {
        Integer[] newArray = new Integer[oldArray.length];
        int i = 0;
        for (int value : oldArray) {
            newArray[i++] = Integer.valueOf(value);
        }
        return newArray;
    }
}
