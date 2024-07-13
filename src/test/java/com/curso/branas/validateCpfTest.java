package com.curso.branas;

import io.quarkus.test.junit.QuarkusTest;
    import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class validateCpfTest {

    @Inject
    ValidateCpf validateCpf;

    @Test
    void validCpf() {
        Assertions.assertTrue(validateCpf.execute("37553905828"));
    }
    @Test
    void InvalidCpfEqualsDigit() {
        Assertions.assertFalse(validateCpf.execute("11111111"));
    }
}
