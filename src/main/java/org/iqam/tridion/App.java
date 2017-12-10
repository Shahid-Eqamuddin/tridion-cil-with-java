package org.iqam.tridion;

import com.tridion.dynamiccontent.ComponentPresentationAssembler;

/**
 * Hello world with Tridion CIL!
 *
 */
public class App {
	public static void main(String[] args) {
		ComponentPresentationAssembler cpa = new ComponentPresentationAssembler(11);
		String result = cpa.getContent("tcm:11-645", "tcm:11-643-32");
		System.out.println("cpa output is!:" + result);
	}
}
