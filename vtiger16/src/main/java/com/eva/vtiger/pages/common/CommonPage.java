package com.eva.vtiger.pages.common;

import com.eva.vtiger.objectrepository_orlayer.CommonPageOr;
import com.eva.vtiger.utils.WebUtil;

public class CommonPage extends CommonPageOr {
	private WebUtil wt;// null

	public CommonPage(WebUtil wu) {
		super(wu);
		this.wt = wu;
	}

	public void login(String userName, String password) {
		
		wt.sendKeys(getUserNameTB(), userName);
		wt.sendKeys(getPasswordTB(), password);
		wt.click(getLoginBT());
	}

	public void logOut() {
		wt.click(getSignOutBT());
	}

	public void creatNewPluseButton() {
		wt.click(getCreatNewPluseBT());
	}

	public void saveButton() {
		wt.click(getSaveBT());

	}

	public String searchForElement(String expName, String searchTypeAttributeValue) {
		wt.myClear(getSearchforTB());
		wt.sendKeys(getSearchforTB(), expName);
		wt.selectByValueAttribute(getSelectTypeDD(), searchTypeAttributeValue);
		wt.click(getSearchButtonBT());
		wt.myThread(3000);
		return expName;
	}

	public int getTableColumnHeaderCount() {
		int countColumn = getListColumns().size();
		return countColumn;
	}

	// _______________ Marketing Methods ___________________

	public void clickMarketing() {
		wt.mouseMoveToElement(getMarketingLK());
		wt.click(getMarketingLK());
	}

	public void clickMarketingCampaignsLink() {
		wt.mouseMoveToElement(getMarketingLK());
		wt.click(getMarketingCampaignsLK());
	}

	public void clickMarketingAccountsLink() {
		wt.mouseMoveToElement(getMarketingLK());
		wt.click(getMarketingAccountsLK());
	}

	public void clickMarketingContactsLink() {
		wt.mouseMoveToElement(getMarketingLK());
		wt.click(getMarketingContactsLK());
	}

	public void clickMarketingWebmailLink() {
		wt.mouseMoveToElement(getMarketingLK());
		wt.click(getMarketingWebmailLK());
	}

	public void clickMarketingLeadsLink() {
		wt.mouseMoveToElement(getMarketingLK());
		wt.click(getMarketingLeadsLK());
	}

	public void clickMarketingCalendarLink() {
		wt.mouseMoveToElement(getMarketingLK());
		wt.click(getMarketingCalendarLK());
	}

	public void clickMarketingDocumentsLink() {
		wt.mouseMoveToElement(getMarketingLK());
		wt.click(getMarketingDocumentsLK());
	}

	// _______________ Sales Methods ___________________

	public void clickSalesLink() {
		wt.mouseMoveToElement(getSalesLK());
		wt.click(getSalesLK());
	}

	public void clickSalesLeadsLink() {
		wt.mouseMoveToElement(getSalesLK());
		wt.click(getSalesLeadsLK());
	}

	public void clickSalesContactsLink() {
		wt.mouseMoveToElement(getSalesLK());
		wt.click(getSalesContactsLK());
	}

	public void clickSalesPotentialsLink() {
		wt.mouseMoveToElement(getSalesLK());
		wt.click(getSalesPotentialsLK());
	}

	public void clickSalesQuotesLink() {
		wt.mouseMoveToElement(getSalesLK());
		wt.click(getSalesQuotesLK());
	}

	public void clickSalesSalesOrderLink() {
		wt.mouseMoveToElement(getSalesLK());
		wt.click(getSalesSalesOrderLK());
	}

	public void clickSalesInvoiceLink() {
		wt.mouseMoveToElement(getSalesLK());
		wt.click(getSalesInvoiceLK());
	}

	public void clickSalesPriceBooksLink() {
		wt.mouseMoveToElement(getSalesLK());
		wt.click(getSalesPriceBooksLK());
	}

	public void clickSalesDocumentsLink() {
		wt.mouseMoveToElement(getSalesLK());
		wt.click(getSalesDocumentsLK());
	}

	public void clickSalesCalendarLink() {
		wt.mouseMoveToElement(getSalesLK());
		wt.click(getSalesCalendarLK());
	}

	// _______________ Inventory Methods ___________________

	public void clickInventoryLink() {
		wt.mouseMoveToElement(getInventoryLK());
		wt.click(getInventoryLK());
	}

	public void clickInventoryProductsLink() {
		wt.mouseMoveToElement(getInventoryLK());
		wt.click(getInventoryProductsLK());
	}

	public void clickInventoryVendorsLink() {
		wt.mouseMoveToElement(getInventoryLK());
		wt.click(getInventoryVendorsLK());
	}

	public void clickInventoryPriceBooksLink() {
		wt.mouseMoveToElement(getInventoryLK());
		wt.click(getInventoryPriceBooksLK());
	}

	public void clickInventoryPurchaseOrderLink() {
		wt.mouseMoveToElement(getInventoryLK());
		wt.click(getInventoryPurchaseOrderLK());
	}

	public void clickInventorySalesOrderLink() {
		wt.mouseMoveToElement(getInventoryLK());
		wt.click(getInventorySalesOrderLK());
	}

	public void clickInventoryQuotesLink() {
		wt.mouseMoveToElement(getInventoryLK());
		wt.click(getInventoryQuotesLK());
	}

	public void clickInventoryInvoiceLink() {
		wt.mouseMoveToElement(getInventoryLK());
		wt.click(getInventoryInvoiceLK());
	}

	public void clickInventoryServicesLink() {
		wt.mouseMoveToElement(getInventoryLK());
		wt.click(getInventoryServicesLK());
	}

	public void clickInventoryAssetsLink() {
		wt.mouseMoveToElement(getInventoryLK());
		wt.click(getInventoryAssetsLK());
	}
}
