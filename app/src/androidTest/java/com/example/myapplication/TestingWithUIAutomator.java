package com.example.myapplication;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;



import androidx.test.filters.SdkSuppress;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.runner.AndroidJUnitRunner;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiObject2;
import androidx.test.uiautomator.Until;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static  androidx.test.core.app.ApplicationProvider.getApplicationContext;





@RunWith(AndroidJUnit4.class)
@SdkSuppress(minSdkVersion = 18)
public class TestingWithUIAutomator {

    private static final String BASIC_SAMPLE_PACKAGE
            = "com.example.myapplication";
    private static final int LAUNCH_TIMEOUT = 5000;
    private static final String STRING_TO_BE_TYPED = "UiAutomator";
    private  UiDevice mDevice;

    @Before
    public  void Testing(){
        mDevice = UiDevice.getInstance(getInstrumentation());
    }
    @Test
    public  void Testing1(){
        mDevice.pressHome();
        
    }





}

