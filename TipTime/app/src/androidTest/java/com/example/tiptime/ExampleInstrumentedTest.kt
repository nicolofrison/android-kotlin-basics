package com.example.tiptime

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.Matchers.containsString

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule
import java.text.DecimalFormat

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule()
    val activity = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.tiptime", appContext.packageName)
    }

    @Test
    fun calculate_20_percent_tip() {
        onView(withId(R.id.edit_text_service_cost))
            .perform(typeText("50.00"))
            .perform(ViewActions.closeSoftKeyboard())

        onView(withId(R.id.button_calculate))
            .perform(click())

        onView(withId(R.id.text_tip_result))
            .check(matches(withText(containsString("$10.00"))))
    }

    @Test
    fun calculate_18_percent_tip_with_round_up() {
        val serviceCost = 175.85

        onView(withId(R.id.edit_text_service_cost))
            .perform(typeText(serviceCost.toString()))
            .perform(ViewActions.closeSoftKeyboard())

        onView(withId(R.id.radio_button_second_option))
            .perform(click())

        onView(withId(R.id.button_calculate))
            .perform(click())

        val expectedTipResult = Math.ceil(serviceCost * 0.18)

        onView(withId(R.id.text_tip_result))
            .check(matches(withText(containsString(expectedTipResult.toString()))))
    }

    @Test
    fun calculate_18_percent_tip_without_round_up() {
        val serviceCost = 175.85

        onView(withId(R.id.edit_text_service_cost))
            .perform(typeText(serviceCost.toString()))
            .perform(ViewActions.closeSoftKeyboard())

        onView(withId(R.id.radio_button_second_option))
            .perform(click())

        onView(withId(R.id.switch_round_up))
            .perform(click())

        onView(withId(R.id.button_calculate))
            .perform(click())
        val decimalFormat = DecimalFormat("#,###.##")
        val expectedTipResult = serviceCost * 0.18

        onView(withId(R.id.text_tip_result))
            .check(matches(withText(containsString(decimalFormat.format(expectedTipResult)))))
    }
}