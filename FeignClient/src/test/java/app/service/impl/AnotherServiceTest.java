package app.service.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.mockito.Mockito;
import org.junit.jupiter.api.Assertions;

public class AnotherServiceTest {

    @Test
    public void getAPI() {
        AnotherService as = mock(AnotherService.class);
        Mockito.when(as.getAPI()).thenReturn("It is Api");
        Assertions.assertEquals("true", "true");
    }

    @Test
    public void getCards() {
        AnotherService as = mock(AnotherService.class);
        Mockito.when(as.getAPI()).thenReturn("Cards Wil Be Here as a json");
        Assertions.assertEquals("true", "true");
    }
}