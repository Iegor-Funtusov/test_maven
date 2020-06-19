package ua.com.alevel.nix.maventes.view;

import org.junit.jupiter.api.Test;
import ua.com.alevel.nix.maventest.calc.CalculationUtil;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void sum() {
        assertEquals(8, CalculationUtil.sum(2, 6));
    }
}
