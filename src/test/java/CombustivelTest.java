import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Daniel Teles
 * @version 1.0
 * @since 11/06/2020 - 20:58
 * @category Test
 */
class CombustivelTest {

    Combustivel combustivel = new Combustivel();

    @org.junit.jupiter.api.Test
    void calcularValorFinal() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }

    /**
     * Teste do metodo CalcularValorFinal()
     */
    public void testarCalcularValorFinal() {
        combustivel.setTipoCombustivel("Álcool");
        combustivel.setLitros(25.0);
        assertEquals("Valor final: R$92.0 em álcool.",
                combustivel.calcularValorFinal(0.0));

        combustivel.setTipoCombustivel("Gasolina");
        combustivel.setLitros(25.0);
        assertEquals("Valor final: R$112.25 em gasolina.",
                combustivel.calcularValorFinal(0.0));

        combustivel.setTipoCombustivel("Diesel");
        combustivel.setLitros(25.0);
        assertEquals("Valor final: R$92.75 em diesel.",
                combustivel.calcularValorFinal(0.0));

        combustivel.setTipoCombustivel("Flex");
        combustivel.setLitros(25.0);
        assertEquals("Valor final: R$112.25 em gasolina.\nValor final: R$92.0 em álcool.",
                combustivel.calcularValorFinal(0.0));
    }

    /**
     * Teste do metodo toString()
     */
    @Test
    public void testarToString() {
        combustivel.setTipoCombustivel("Gasolina");
        combustivel.setLitros(25.0);
        assertEquals("\nTipo de combustivel escolhido: Gasolina\nQuantidade de litros: 25.0\nValor final: R$112.25 em gasolina.", combustivel.toString());
    }
}