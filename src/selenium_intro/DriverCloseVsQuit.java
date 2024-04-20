package selenium_intro;

public class DriverCloseVsQuit {
    //driver.close();
    // closes the current window but the WebDriver instance remains active,
    // and you can switchto another windpw or perform further actions.
    //closes the browser but not the elements/objects in it. objects stay in the memory
    //this method will close the browser but will keep the instance of the driver alive -> the reference to the object
    //will still be there

    // driver.quit();
    // closes all browser windows that the WebDriver instance is controlling,
    // you can't perform further actions using same WebDriver instance
    // completely terminates the WebDriver session.
    // closes the browser and removes the path that points to the elements. ultimately killing the elements
    //this method will close the browser but also will kill/remove the reference to the driver object which will make it null
    //that means , you need to create the driver object again if you need to use it driver = new ChromeDriver()
}
