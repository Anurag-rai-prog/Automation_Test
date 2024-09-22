package testNG_gitPush.copy;

import org.testng.annotations.Test;

public class TestNGclass2 {
	@Test(groups= {"smoke","sanity"})
	public void test6() {
		System.out.println("test6");
	}
	@Test(groups= {"smoke","regression"})
	public void test7() {
		System.out.println("test7");
	}
	@Test(groups= {"sanity","functional"})
	public void test8() {
		System.out.println("test8");

}
	@Test(groups= {"smoke"})
	public void test9() {
		System.out.println("test9");
	}
	//in case the priority is not set the priority by default is set to zero
	@Test(groups= {"regression","integration"})
	public void test10() {
		System.out.println("test10");
	}


}
