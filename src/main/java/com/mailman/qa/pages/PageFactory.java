package com.mailman.qa.pages;


import org.openqa.selenium.WebDriver;

public class PageFactory {

    private final WebDriver webDriver;

    public PageFactory(SharedDriver webDriver) {
        this.webDriver = webDriver;
    }

    public HomePage newHomePage() {
        return new HomePage(webDriver);
    }

    public MonthPage newMonthPage() {
        return new MonthPage(webDriver);
    }
}
