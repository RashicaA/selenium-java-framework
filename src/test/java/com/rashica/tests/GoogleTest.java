package com.rashica.tests;

import com.rashica.base.BaseTest;
import com.rashica.pages.GooglePage;
import org.junit.jupiter.api.Test;

public class GoogleTest extends BaseTest {

    @Test
    public void searchTest() {

        GooglePage googlePage = new GooglePage(driver);
        googlePage.open();
        googlePage.search("SDET Automation");

    }
}