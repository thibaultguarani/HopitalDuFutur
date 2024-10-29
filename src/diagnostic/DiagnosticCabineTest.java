package diagnostic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class DiagnosticCabineTest {

    @Test
    void testProblemeCardiaque() {
        assertEquals("Cardiologie", DiagnosticCabine.obtenirUniteMedicale(33));
        assertEquals("Cardiologie", DiagnosticCabine.obtenirUniteMedicale(9));
    }

    @Test
    void testFracture() {
        assertEquals("Traumatologie", DiagnosticCabine.obtenirUniteMedicale(55));
        assertEquals("Traumatologie", DiagnosticCabine.obtenirUniteMedicale(10));
    }

    @Test
    void testProblemeCardiaqueEtFracture() {
        assertEquals("Cardiologie, Traumatologie", DiagnosticCabine.obtenirUniteMedicale(15));
        assertEquals("Cardiologie, Traumatologie", DiagnosticCabine.obtenirUniteMedicale(30));
    }

    @Test
    void testAucunePathologie() {
        assertEquals("Aucune pathologie détectée", DiagnosticCabine.obtenirUniteMedicale(7));
        assertEquals("Aucune pathologie détectée", DiagnosticCabine.obtenirUniteMedicale(11));
    }
}
