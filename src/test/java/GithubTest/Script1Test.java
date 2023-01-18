package GithubTest;

import org.testng.annotations.Test;

public class Script1Test {
	public class practice_maven {
		@Test(groups = "smoke")
		public void create() {
			System.out.println("created somke successfully");
		}
		@Test(groups = "regression")
		public void update() {
			System.out.println("update regression successfully");
		}

}
}