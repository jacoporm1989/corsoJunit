package it.valdicogne;

import com.sun.source.tree.CaseTree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TestCalcolatrice")
class CalcolatriceTest {


    @DisplayName("test numero1 + numero2 = risultatoAttesoGiustoSomma")
    @Test
    void testSomma_whenTenSixtySummedByThirty_shouldReturnNinety() {
            // Arrange

            Calcolatrice calc = new Calcolatrice();

            int numero1 = 60;
            int numero2 = 30;
            int risultatoAttesoGiustoSomma = 90;
            int risultatoAttesoErratoSomma = 23;


            // Act

            int somma = calc.addizione(numero1,numero2);


            // Assert
            assertEquals(risultatoAttesoErratoSomma , somma, "TestFailed");

        }



}