package com.yakindeveloper.kasirsaku.automationandroid.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.interactions.touch.TouchActions;

public class BarangPage extends PageObject {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout")
    private WebElementFacade fieldBarangTehPucuk;
//    private WebElement fieldBarangTehPucuk = getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout"));

    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_nama_create_barang")
    private WebElementFacade fieldNamaBarang;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_stok_create_barang")
    private WebElementFacade fieldStockBarang;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_harga_create_barang")
    private WebElementFacade fieldHargaSatuanBarang;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_harga_supplier_barang")
    private WebElementFacade fieldHargaSupplierBarang;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_barcode_create_barang")
    private WebElementFacade fieldBarcodeBarang;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/button_create_barang")
    private WebElementFacade buttonAddBarang;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/search_button")
    private WebElementFacade fieldSearchButton;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/search_src_text")
    private WebElementFacade fieldSearchtxt;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout")
    private WebElementFacade fieldStockBarang1;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView")
    private WebElementFacade btnAddBarang;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[6]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView")
    private WebElementFacade btnDeleteBarang;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText[1]")
    private WebElementFacade fieldTambahStock;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText[2]")
    private WebElementFacade fieldUpdateHargaSupplier;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText[3]")
    private WebElementFacade fieldUpdateHargaBaru;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
    private WebElementFacade btnOKtambahStock;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]")
    private WebElementFacade btnCancelTambahStock;

    public void clickAddButton(){
        fieldSearchButton.click();
    }

    public void typeNamaBarang(){
        fieldNamaBarang.sendKeys("A123");
    }

    public void typeStockBarang(){
        fieldStockBarang.sendKeys("123");
    }

    public void typeHargaSatuanBarang(){
        fieldHargaSatuanBarang.sendKeys("2000");
    }

    public void typeHargaSupplierBarang(){
        fieldHargaSupplierBarang.sendKeys("1500");
    }

    public void typeScanBarcode(){
        fieldBarcodeBarang.sendKeys("123456789");
    }

    public void longpressTehPucuk(){

        //getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout")).click();
       /* TouchAction Action = new TouchAction((PerformsTouchActions) getDriver());
        Action.longPress(getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout"))).perform();
*/
//       GoSoftMobileDriver driver = new GoSoftMobileDriver();
//        TouchActions action = new TouchActions(getDriver());
//        action.longPress(getDriver().findElement(By.id("com.yakindeveloper.bukakasir:id/search_src_text")));
//        action.perform();
//
//        buttonAddBarang

//        fieldBarangTehPucuk.click();


//        TouchActions ac=new TouchActions(getDriver());
//        ac.longPress(element(fieldBarangTehPucuk)).perform();

    }
    
}