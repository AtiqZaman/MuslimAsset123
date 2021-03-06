package com.atiq.MuslimAsset;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.*;

public class MainActivityQuranTest {
    @Rule
    public ActivityTestRule<MainActivityQuran> mActivityTestRule=new ActivityTestRule<>(MainActivityQuran.class);
    private MainActivityQuran myActivity;

    @Before
    public void setUp() throws Exception {
        myActivity = mActivityTestRule.getActivity();
    }

    @Test
    public void testActivity(){
        View v = myActivity.findViewById(R.id.main_box);
        assertNotNull(v);

        View v1 = myActivity.findViewById(R.id.bottomNavView_Bar);
        assertNotNull(v1);

        View v2 = myActivity.findViewById(R.id.relLayoutTopBar);
        assertNotNull(v2);
    }

    @After
    public void tearDown() throws Exception {

        myActivity=null;
    }


}