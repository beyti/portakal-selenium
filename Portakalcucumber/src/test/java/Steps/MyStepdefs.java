package Steps;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class MyStepdefs extends BaseUtil {

    private BaseUtil base;
    private Random r = new Random();
    private UUID uuid = UUID.randomUUID();
    private String randomUUIDString = uuid.toString();


    public MyStepdefs(BaseUtil base) {
        this.base = base;
    }

    @And("^I enter restoran adi with correct format$")
    public void IEnterRestoranAdiWithCorrectFormat() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        base.driver.findElement(By.id("restaurant-name")).sendKeys(randomUUIDString);


    }

    @And("^I choose il from the il combobox$")
    public void IChooseIlFromTheIlCombobox() throws Throwable {


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

    @And("^I choose ilce from the ilce combobox$")
    public void IChooseIlceFromTheIlceCombobox() throws Throwable {

        //ilçe

        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        Select s2 = new Select(base.driver.findElement(By.id("restaurant-county")));
        int listSize = s2.getOptions().size();

        int optionIndex = getRandomNumberInRange(r, 1, listSize - 1);
        if (listSize > 1) {
            s2.selectByIndex(optionIndex);
        }
        if (listSize <= 1) {
            System.out.println("seçenek yok");
        }
    }

    @And("^I choose semt from the semt combobox$")
    public void iChooseSemtFromTheSemtCombobox() throws Throwable {

        //semt

        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        Select s2 = new Select(base.driver.findElement(By.id("restaurant-district")));

        int listSize = s2.getOptions().size();

        int optionIndex = getRandomNumberInRange(r, 1, listSize - 1);


        if (listSize > 1) {
            s2.selectByIndex(optionIndex);
        }

        if (listSize <= 1) {
            System.out.println("seçenek yok");
        }
    }

    @And("^I enter restoran adresi with correct format$")
    public void IEnterRestoranAdresiWithCorrectFormat() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        base.driver.findElement(By.id("restaurant-address")).sendKeys(randomUUIDString);
    }

    @And("^I enter restoran sahibi ad with correct format$")
    public void IEnterRestoranSahibiAdWithCorrectFormat() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);


        base.driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/input[1]")).sendKeys(base.uret());
    }

    @And("^I enter restoran sahibi soyadi with correct format$")
    public void IEnterRestoranSahibiSoyadiWithCorrectFormat() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        base.driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/input[2]")).sendKeys(base.uret());

    }

    @And("^I enter restoran sahibi telefon no with correct format$")
    public void iEnterRestoranSahibiTelefonNoWithCorrectFormat() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        base.driver.findElement(By.id("restaurant-owner-phone")).sendKeys("5508637460");
    }

    @And("^I enter restoran telefon no with correct format$")
    public void IEnterRestoranTelefonNoWithCorrectFormat() throws Throwable {
        int randomNumber = r.nextInt(899999) + 1000000;

        //restoran telefon no
        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        base.driver.findElement(By.id("restaurant-owner-email")).sendKeys("212" + randomNumber);


    }

    @And("^I enter e-mail bas with correct format$")
    public void IEnterEMailBasWithCorrectFormat() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        //String emailBas = base.uret();
        String emailBas = "belemir.karabacakoglu";
        base.driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[6]/input[1]")).sendKeys(emailBas);

    }

    @And("^I enter e-mail son with correct format$")
    public void IEnterEMailSonWithCorrectFormat() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        String emailSon = "gmail.com";
        base.driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[6]/input[2]")).sendKeys(emailSon);

    }

    @And("^I click kayitol button$")
    public void IClickKayitolButton() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        base.driver.findElement(By.id("register-my-restaurant")).click();

    }


    @Given("^I navigate to the register page$")
    public void iNavigateToTheRegisterPage() throws Throwable {

        base.driver.get("http://portakal.ystest.com");
    }

    @And("^I click Hemen uye ol button$")
    public void IClickHemenUyeOlButton() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        base.driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[1]/div[2]/a")).click();
    }

    @And("^I see the islem gerceklestiriliyor pop up$")
    public void ISeeTheIslemGerceklestiriliyorPopUp() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

        try {
            Alert alt1 = base.driver.switchTo().alert();
            alt1.accept();
        } catch (NoAlertPresentException noe) {
            System.out.println("ISeeTheIslemGerceklestiriliyorPopUp exception");
        }

        base.driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
    }

    @And("^I see the bilgilendirme pop up$")
    public void ISeeTheBilgilendirmePopUp() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

        try {
            Alert alt2 = base.driver.switchTo().alert();
            alt2.accept();

        } catch (NoAlertPresentException noe) {
            System.out.println("ISeeTheBilgilendirmePopUp exception");
        }
    }

    @Then("^I confirm the pop up message$")
    public void IConfirmThePopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        //base.driver.findElement(By.xpath("/html/body/div[2]/div[2]")).click();
        try {
            String ab = base.driver.findElement(By.id("restaurantRegisterSuccessMessage")).getText();
            Assert.assertEquals("Restoran Kaydınız başarıyla tamamlandı. Mail Adresinize ve telefonunuza gönderilen şifre ve kullanıcı adınızla sisteme giriş yapabilirsiniz.", ab);
        } catch (AssertionError ae) {
            Assert.fail();
        }


    }
}


