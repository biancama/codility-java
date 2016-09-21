package com.biancama.codility.linkedlist;

/**
 * Created by massimo on 14/09/16.
 */
public class LinkedListLength {
	public int solution(IntList L) {
		if (L == null) {
			return 0;
		} else {
			return 1 + solution(L.next);
		}

	}


}

class IntList {
	public IntList(char value, IntList next) {
		this.value = value;
		this.next = next;
	}

	public char value;
	public IntList next;
}