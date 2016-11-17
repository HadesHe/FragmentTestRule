package com.a21buttons.fragmenttestrule.samples;

import com.android21buttons.fragmenttestrule.FragmentTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.CoreMatchers.not;

public class ButtonFragmentTest {
    @Rule
    public FragmentTestRule<?, ButtonFragment> fragmentTestRule = FragmentTestRule.create(MainActivity.class, ButtonFragment.class);

    @Test
    public void buttonClickHidesTextView() throws Exception {
        onView(withId(R.id.button)).perform(click());

        onView(withId(R.id.textView)).check(matches(not(isDisplayed())));
    }
}