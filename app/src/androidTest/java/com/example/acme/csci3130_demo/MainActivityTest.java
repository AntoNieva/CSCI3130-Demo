package com.example.acme.csci3130_demo;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static org.junit.Assert.*;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;


import org.hamcrest.core.AllOf;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;
/**
 * Created by Liwei on 2018/2/26.
 */

public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule =new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void test0(){
        Espresso.onView(withId(R.id.state)).perform(click());
        Espresso.onView(withId(R.id.textView2)).check(matches(isDisplayed()));
        Espresso.onView(withId(R.id.textView3)).check(matches(isDisplayed()));
        Espresso.onView(withId(R.id.textView4)).check(matches(isDisplayed()));
    }

    @Test
    public void test1(){
        Espresso.onView(withId(R.id.info)).perform(click());
        Espresso.onView(withId(R.id.textView)).check(matches(isDisplayed()));
    }

    @Test
    public void test2(){
        Espresso.onView(withId(R.id.pass)).perform(click());
        Espresso.onView(withId(R.id.textView5)).check(matches(isDisplayed()));
        Espresso.onView(withId(R.id.textView6)).check(matches(isDisplayed()));
        Espresso.onView(withId(R.id.editText2)).check(matches(isDisplayed()));
        Espresso.onView(withId(R.id.editText3)).check(matches(isDisplayed()));
        Espresso.onView(withId(R.id.confirm)).check(matches(isDisplayed()));
    }
}
