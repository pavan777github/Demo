package com.velocity;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		list.add("saloni");
		list.add("tejal");
		list.add("kasim");
		list.add("pavan");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}


	}


