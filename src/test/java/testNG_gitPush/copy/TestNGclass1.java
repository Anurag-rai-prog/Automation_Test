package testNG_gitPush.copy;

import org.testng.annotations.Test;

public class TestNGclass1 {
	
	@Test(groups= {"smoke","sanity"})
	public void test1() {
		System.out.println("test1");
	}
	@Test(groups= {"smoke","regression"})
	public void test2() {
		System.out.println("test2");
	}
	@Test(groups= {"sanity"})
	public void test3() {
		System.out.println("test3");

}
	@Test(groups= {"smoke"})
	public void test4() {
		System.out.println("test4");
	}
	//in case the priority is not set the priority by default is set to zero
	@Test(groups= {"regression"})
	public void test5() {
		System.out.println("test5");
	}
}


