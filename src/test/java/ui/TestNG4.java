package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG4 {
	@Test
	public void a() {
		Assert.assertTrue(3>12);
		System.out.println("This is a");
	}
	@Test(dependsOnMethods="a")
	public void b() {
		System.out.println("This is b");
	}

}
