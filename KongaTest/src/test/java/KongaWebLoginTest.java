import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


    public class KongaWebLoginTest {
         //1.import web driver
    private WebDriver driver;

    @BeforeTest
    public void setup() throws InterruptedException {
         //2.open chrome browser
         driver = new ChromeDriver();
         //3. input Konga Url: (https://www.konga.com/)
         driver.get("https://www.konga.com/");
         //5. maximize the browser
         driver.manage().window().maximize();
         Thread.sleep(3000);
    }

    @Test(priority = 0)
    public void login() throws InterruptedException {
         //6.click login/signup button
         driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/a")).click();
           Thread.sleep(3000);
         //7.locate the email address/phone number field an input your email address
         driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("********itoye@outlook.com");
         //8.Locate password field and input password
         driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345*****");
         //9. Click on the Login button
         driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
         Thread.sleep(10000);
    }

    @Test(priority = 1)
    public void selectCategory() throws InterruptedException {
         //11.From the Categories,click on the“Computers and Accessories”
         driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[2]/div/a[2]")).click();
         //12. Click on the Laptop SubCategory
            Thread.sleep(7000);
         driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[3]/section/div/section/div[2]/div[2]/ul/li[4]/a/label/span")).click();
        Thread.sleep(5000);
         //13. Click on the Apple MacBooks
         driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[3]/section/div/section/div[2]/div[2]/ul/li[4]/a/ul/li[1]/a/label/span")).click();
           Thread.sleep(5000);
    }

    @Test(priority = 2)
    public void addToCart() throws InterruptedException {
         //14. add item to cart
         driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[3]/section/section/section/section/ul/li[1]/div/div/div[2]/form/div[3]/button")).click();
         Thread.sleep(10000);
    }

    @Test (priority = 3)
    public void myCart() throws InterruptedException {
         System.out.println("Open my cart");
         //15.Locate and select the my cart button
         driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/a[2]/span[1]")).click();
         Thread.sleep(5000);
         System.out.println("Begin checkout");
         //16.Locate and select the checkout button
         driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/section/section/aside/div[3]/div/div[2]/button")).click();
         Thread.sleep(7000);
    }

    @Test(priority = 4)
    public void Checkout() throws InterruptedException {
         //17.change address
         driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[1]/div/div/div[1]/div[2]/div/button")).click();
         Thread.sleep(5000);
         //18. add delivery address
         driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[1]/div/div/div[2]/div[1]/div[2]/div[1]/div/button")).click();
         Thread.sleep(3000);
         //19.select address
         driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/section/aside/div[2]/div/div/div[2]/div[2]/form/button")).click();
         Thread.sleep(3000);
         //20.select use this addrress
         driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/section/aside/div[3]/div/div/div/a")).click();
         Thread.sleep(3000);
    }

@Test(priority = 5)
public void payment() throws InterruptedException {
    //21.locate and select pay now
    driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/main/div/form/div/div[1]/section[2]/div/div[2]/div[1]/div[1]/span/input")).click();
    Thread.sleep(3000);
    //22. locate and select continue to payment
    driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[2]/div/div[2]/div[3]/div[2]/div/button")).click();
    Thread.sleep(7000);
    }


@Test(priority = 6)
    public void selectCardMethod() throws InterruptedException {
        //23 select a card payment method
        //23a. change from default to iframe
        WebElement paymethod = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame("kpg-frame-component");
        Thread.sleep(7000);
        System.out.println("Payment Method");
        //23b. select card payment method
        WebElement cardpayment = driver.findElement(By.className("Card"));
        cardpayment.click();
        System.out.println("Select card method");
        Thread.sleep(5000);
    }

    @Test (priority = 7)
    public void inputCardDetails() throws InterruptedException {
        //24. input individual card details
        //24a. input card number in its field
        WebElement carddigit = driver.findElement(By.id("card-number"));
        carddigit.sendKeys("524282138312");
        Thread.sleep(3000);
        //25b. input date in its field
        WebElement datedigit = driver.findElement(By.id("expiry"));
        datedigit.sendKeys("1224");
        Thread.sleep(3000);
        //25c. input CVV in its field
        WebElement cvvdigit = driver.findElement(By.id("cvv"));
        cvvdigit.sendKeys("029");
        Thread.sleep(20000);
        System.out.println("input card details");
        driver.findElement(By.xpath("//*[@id=\"card-pin-new\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"keypads\"]/button[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"keypads\"]/button[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"keypads\"]/button[3]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"keypads\"]/button[4]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"validateCardForm\"]")).click();
        Thread.sleep(5000);
        System.out.println("input card pin");
        Thread.sleep(10000);
    }

    @Test (priority = 8)
    public void errorMessage() throws InterruptedException {
        //26 print out the error message
        WebElement error = driver.findElement(By.id("card-number_unhappy"));
        System.out.println(error.getText());
        Thread.sleep(10000);
    }

    @Test (priority = 9)
    public void closeFrame() throws InterruptedException {
        //27. close the Iframe that displays input card details
        WebElement exitframe = driver.findElement(By.className("data-card__close"));
        exitframe.click();
        System.out.println("Exit payment method iframe");
        Thread.sleep(10000);
    }

    @Test (priority = 10)
    public void exitIFrame() throws InterruptedException {
        //28. Exit iFrame web
        driver.switchTo().defaultContent();
        Thread.sleep(5000);
        System.out.println("Restore default page");
    }

    @AfterTest
    public void quitBrowser(){
        //29.close driver
        driver.quit();
    }


}







