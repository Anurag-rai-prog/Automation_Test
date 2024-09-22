package ui;

import org.testng.annotations.Test;

public class TestNG2 {
	
	@Test(priority=-10)
	public void test1() {
		System.out.println("test1");
	}
	@Test(priority=1)
	public void test2() {
		System.out.println("test2");
	}
	@Test(priority=100)
	public void a() {
		System.out.println("a");

}
	@Test(priority=0)
	public void b() {
		System.out.println("there b");
	}
	//in case the priority is not set the priority by default is set to zero
	@Test
	public void b1() {
		System.out.println("there b1");
	}
}
