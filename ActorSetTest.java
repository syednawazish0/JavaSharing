package com.Collections.app.Set;

import java.awt.Desktop.Action;
import java.util.HashSet;
import java.util.Set;

import java.util.LinkedHashSet;

public class ActorSetTest {

	public static void main(String[] args) {

		// create actor object

		Set<String> setOfActor = new LinkedHashSet<String>();
		setOfActor.add("Nawazish");
		setOfActor.add("Tony");
		setOfActor.add("Shahid");
		setOfActor.add("Haris");
		setOfActor.add("Saif");

		System.out.println(setOfActor);

		System.out.println("------------------------------------------");
		for (String actor : setOfActor) {
			System.out.println(actor);
		}

	}

}
