import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Cliente cliente = new Cliente();
        cliente.setParcela1(2.0);
        cliente.setParcela2(5.0);

        assertEquals(9.0, cliente.calcularEmprestimo());
    }
}
