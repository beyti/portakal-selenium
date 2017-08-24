package Steps;

import Base.BaseUtil;
import com.sun.xml.internal.rngom.parse.host.Base;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;


public class MyStepdefs extends BaseUtil {

    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUIDString = uuid.toString();


    public MyStepdefs(BaseUtil base) {
        this.base = base;
    }

    @And("^ı enter restoran adi with correct format$")
    public void ıEnterRestoranAdiWithCorrectFormat() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        base.driver.findElement(By.id("restaurant-name")).sendKeys(randomUUIDString);


    }

    @And("^ı choose il from the il combobox$")
    public void ıChooseIlFromTheIlCombobox() throws Throwable {


        //şehir
        String[] sehir = {"ADANA", "ADIYAMAN", "AFYONKARAHİSAR", "AKSARAY", "AMASYA", "ANKARA", "ANTALYA", "AYDIN", "BALIKESİR", "BATMAN", "BİLECİK",
                "BOLU", "BURDUR", "BURSA", "ÇANAKKALE", "ÇANKIRI", "ÇORUM", "DENİZLİ", "DİYARBAKIR", "DÜZCE", "EDİRNE", "ELAZIĞ", "ERZİNCAN", "ERZURUM", "ESKİŞEHİR",
                "GAZİANTEP", "GİRESUN", "HATAY", "ISPARTA", "İSTANBUL", "İZMİR", "KAHRAMANMARAŞ", "KARABÜK", "KARAMAN", "KASTAMONU", "KAYSERİ", "KIBRIS", "KIRIKKALE", "KIRKLARELİ", "KIRŞEHİR",
                "KOCAELİ", "KONYA", "KÜTAHYA", "MALATYA", "MANİSA", "MARDİN", "MERSİN", "MUĞLA", "NEVŞEHİR", "NİĞDE", "ORDU", "OSMANİYE", "postakip", "RİZE", "SAKARYA", "SAMSUN", "ŞANLIURFA",
                "SİNOP", "SİVAS", "TEKİRDAĞ", "TOKAT", "TRABZON", "UŞAK", "VAN", "YALOVA", "YOZGAT", "ZONGULDAK"};


        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        Select s1 = new Select(base.driver.findElement(By.id("restaurant-city")));

        int gelensehir = r.nextInt(sehir.length);


        s1.selectByVisibleText(sehir[gelensehir]);

    }

    private int getRandomNumberInRange(Random r, int min, int max) {

        if (min > max) {
            Assert.assertTrue(false);
        }

        return r.nextInt((max - min) + 1) + min;
    }

    @And("^ı choose ilce from the ilce combobox$")
    public void ıChooseIlceFromTheIlceCombobox() throws Throwable {

        //ilçe

        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        Select s2 = new Select(base.driver.findElement(By.id("restaurant-county")));
        int listSize = s2.getOptions().size();

        int optionIndex = getRandomNumberInRange(r, 1, listSize-1);
        if(listSize>1) {
            s2.selectByIndex(optionIndex);
        }
        if(listSize==0 && listSize==1){
            System.out.println("seçenek yok");

        }
    }

    @And("^I choose semt from the semt combobox$")
    public void iChooseSemtFromTheSemtCombobox() throws Throwable {

        //semt

        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        Select s2 = new Select(base.driver.findElement(By.id("restaurant-district")));

        int listSize = s2.getOptions().size();

        int optionIndex = getRandomNumberInRange(r, 1, listSize-1);


        if(listSize>1){
        s2.selectByIndex(optionIndex);}

        if(listSize==0 && listSize==1){
            System.out.println("seçenek yok");

        }
    }

    @And("^ı enter restoran adresi with correct format$")
    public void ıEnterRestoranAdresiWithCorrectFormat() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        base.driver.findElement(By.id("restaurant-address")).sendKeys(randomUUIDString);
    }

    @And("^ı enter restoran sahibi ad with correct format$")
    public void ıEnterRestoranSahibiAdWithCorrectFormat() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);


        base.driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/input[1]")).sendKeys(base.uret());
    }

    @And("^ı enter restoran sahibi soyadi with correct format$")
    public void ıEnterRestoranSahibiSoyadiWithCorrectFormat() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        base.driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/input[2]")).sendKeys(base.uret());

    }

    @And("^I enter restoran sahibi telefon no with correct format$")
    public void iEnterRestoranSahibiTelefonNoWithCorrectFormat() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        base.driver.findElement(By.id("restaurant-owner-phone")).sendKeys("5508637460");
    }

    @And("^ı enter restoran telefon no with correct format$")
    public void ıEnterRestoranTelefonNoWithCorrectFormat() throws Throwable {
        int randomNumber = r.nextInt(899999) + 1000000;

        //restoran telefon no
        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        base.driver.findElement(By.id("restaurant-owner-email")).sendKeys("212" + randomNumber);


    }

    @And("^ı enter e-mail bas with correct format$")
    public void ıEnterEMailBasWithCorrectFormat() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        //String emailBas = base.uret();
        String emailBas = "belemir.karabacakoglu";
        base.driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[6]/input[1]")).sendKeys(emailBas);

    }

    @And("^ı enter e-mail son with correct format$")
    public void ıEnterEMailSonWithCorrectFormat() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        String emailSon = "gmail.com";
        base.driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[6]/input[2]")).sendKeys(emailSon);

    }

    @And("^ı click kayıtol button$")
    public void ıClickKayıtolButton() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        base.driver.findElement(By.id("register-my-restaurant")).click();

    }


    @Given("^I navigate to the register page$")
    public void iNavigateToTheRegisterPage() throws Throwable {

        base.driver.get("http://portakal.ystest.com");
    }

    @And("^ı click Hemen üye ol button$")
    public void ıClickHemenÜyeOlButton() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        base.driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[1]/div[2]/a")).click();
    }

    @And("^ı see the işlem gerçekleştiriliyor pop up$")
    public void ıSeeTheIşlemGerçekleştiriliyorPopUp() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

        try {
            Alert alt1 = base.driver.switchTo().alert();
            alt1.accept();
        } catch (NoAlertPresentException noe) {

        }

        base.driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
    }

    @And("^ı see the bilgilendirme pop up$")
    public void ıSeeTheBilgilendirmePopUp() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

        try {
            Alert alt2 = base.driver.switchTo().alert();
            alt2.accept();

        } catch (NoAlertPresentException noe) {
        }



    }

    @Then("^ı confirm the pop up message$")
    public void ıConfirmThePopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        //base.driver.findElement(By.xpath("/html/body/div[2]/div[2]")).click();
       try{
           String ab = base.driver.findElement(By.id("restaurantRegisterSuccessMessage")).getText();

        Assert.assertEquals("Restoran Kaydınız başarıyla tamamlandı. Mail Adresinize ve telefonunuza gönderilen şifre ve kullanıcı adınızla sisteme giriş yapabilirsiniz.", ab);

    } catch(AssertionError ae) {

           Assert.fail();
       }


}}


