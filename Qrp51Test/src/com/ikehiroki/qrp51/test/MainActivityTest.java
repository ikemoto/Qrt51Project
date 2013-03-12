package com.ikehiroki.qrp51.test;

import com.ikehiroki.qrp51.MainActivity;

import android.test.ActivityInstrumentationTestCase2;


public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

	private MainActivity targetActivity;

	public MainActivityTest() {
		super(MainActivity.class);
	}

	@Override
    protected void setUp() throws Exception {
        super.setUp();
        targetActivity = getActivity();
    }
	
	public void testGetTest() {
        assertEquals(targetActivity.getTest(), "test");
    }

}
