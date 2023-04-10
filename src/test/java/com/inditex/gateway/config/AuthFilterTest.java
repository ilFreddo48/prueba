package com.inditex.gateway.config;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.cloud.gateway.filter.GatewayFilter;

class AuthFilterTest {

    private AuthFilter authFilterUnderTest;

    @BeforeEach
    void setUp() {
        authFilterUnderTest = new AuthFilter(null);
    }

    @Test
    void testApply() {
        // Setup
        final AuthFilter.Config config = new AuthFilter.Config();

        // Run the test
        final GatewayFilter result = authFilterUnderTest.apply(config);

        // Verify the results
    }
}
