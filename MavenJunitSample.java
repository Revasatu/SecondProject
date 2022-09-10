package org.testing1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MavenJunitSample {
	@BeforeClass
	public static void tc01() {
		System.out.println("test1");
	
	}
	@Test
	public void tc02() {
		System.out.println("test2");
	
	}
	@After
	public void tc03() {
		System.out.println("test3");
	
	}
	@Before
	public void tc04() {
		System.out.println("test4");
	}
	@AfterClass
	public static void tc05() {
		System.out.println("test5");
	
	}
	
	

}


