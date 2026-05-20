package seleniumbasics;

public class NavigationCommandsAndBrowserCommands extends Base{
	
	public void verifyNavigationCommand() {
		driver.navigate().to("https://www.amazon.in/");// To go to another site
		driver.navigate().back();  // Back to previous site
		driver.navigate().forward(); // Navigate to amazon site again
		driver.navigate().refresh(); // Reload
	}
	
	public void verifyBrowserCommands() {
		String title = driver.getTitle(); // To fetch the title of the site
		System.out.println(title);
		String url = driver.getCurrentUrl(); //To fetch the url of the site
		System.out.println(url);
		String handleid = driver.getWindowHandle(); // //To fetch id of window
		System.out.println(handleid);
		String source = driver.getPageSource(); // To fetch the source code of the page
		System.out.println(source);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigationCommandsAndBrowserCommands navigate = new NavigationCommandsAndBrowserCommands();
		navigate.browserLaunch();
		//navigate.verifyNavigationCommand();
		navigate.verifyBrowserCommands();
	}

}
