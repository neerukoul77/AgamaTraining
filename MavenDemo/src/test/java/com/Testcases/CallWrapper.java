package com.Testcases;

		import java.io.IOException;

		public class CallWrapper {
			public static void main(String[] args) throws IOException  {
				  WrapperMethod wm = new WrapperMethod();
				  wm.insertapp("https://opensource-demo.orangehrmlive.com/");
				  wm.enterbyid("txtUsername", "Admin");
				  wm.enterbyid("txtPassword", "admin123");
				  wm.clickbyxpath("//*[@id=\'u_0_b\']");
				  wm.takesnap("E:\\takescreen\\file1.png");
				  wm.closeapp();
					}

		

	}


