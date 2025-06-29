package com.eligibilitychecker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ExamEligibilityTest {

    private ExamEligibility checker;

    @Before
    public void setUp() {
        System.out.println("Setup: Initializing eligibility checker before test");
        checker = new ExamEligibility();
    }

    @After
    public void tearDown() {
        System.out.println("Teardown: Cleaning up after test\n");
        checker = null;
    }

    @Test
    public void testEligibleStudent() {
        // Arrange: setup done
        // Act
        System.out.println("Checking for EligibleStudent");
        boolean result = checker.isEligible(85, 45);
        // Assert
        assertTrue("Student should be eligible", result);
    }

    @Test
    public void testLowAttendance() {
        System.out.println("Checking for LowAttendance");
        boolean result = checker.isEligible(60, 50);
        assertFalse("Student with low attendance should not be eligible", result);
    }

    @Test
    public void testLowInternalMarks() {
        System.out.println("Checking for LowInternalMarks");
        boolean result = checker.isEligible(80, 30);
        assertFalse("Student with low internal marks should not be eligible", result);
    }

    @Test
    public void testMinimumCriteria() {
        System.out.println("Checking for MinimumCriteria");
        boolean result = checker.isEligible(75, 40);
        assertTrue("Student exactly at threshold should be eligible", result);
    }
}
