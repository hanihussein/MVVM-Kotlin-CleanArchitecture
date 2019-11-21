package com.hani.Modules.login

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.RootMatchers.withDecorView
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import com.hani.baseandroid.R
import com.hani.baseandroid.core.Util.EspressoIdlingResource
import com.hani.baseandroid.presentation.login.LoginActivity
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.not
import org.junit.Before
import org.junit.Rule
import org.junit.Test


@LargeTest

class LoginInstrumentedTest {


    @get:Rule
    var mActivityRule = ActivityTestRule<LoginActivity>(LoginActivity::class.java)


    @Before
    fun init() {

        IdlingRegistry.getInstance().register(EspressoIdlingResource.getIdlingResource())
    }

    @Test
    fun login_enterValidCredentials_true() {

        onView(ViewMatchers.withId(R.id.username))
            .perform(typeText("hani"), closeSoftKeyboard())
        onView(withId(R.id.password))
            .perform(typeText("123456"), closeSoftKeyboard())
        onView(withId(R.id.login)).perform(click())

        onView(withText("Login Success")).inRoot(withDecorView(not(`is`(mActivityRule.activity.getWindow().getDecorView()))))
            .check(ViewAssertions.matches(isDisplayed()))

    }


    @Test
    fun login_enterInvalidCredentials_true() {

        onView(ViewMatchers.withId(R.id.username))
            .perform(typeText("Joee"), closeSoftKeyboard())
        onView(withId(R.id.password))
            .perform(typeText("123r5"), closeSoftKeyboard())
        onView(withId(R.id.login)).perform(click())

        onView(withText("Invalid username or password")).inRoot(withDecorView(not(`is`(mActivityRule.activity.getWindow().getDecorView()))))
            .check(ViewAssertions.matches(isDisplayed()))

    }
}