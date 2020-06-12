/**
 * @author Daniel Teles
 * @version 1.0
 * @since 11/06/2020 - 20:43
 * @category Model
 */
public class Combustivel {

    private double litros;
    private double valor;
    private String tipoCombustivel;

    public Combustivel() {
    }

    /**
     *
     * @param litros Recebe a quantidade de litros
     * @param tipoCombustivel Recebe o Tipo de combustivel
     */
    public Combustivel(double litros, String tipoCombustivel) {
        this.litros = litros;
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getLitros() {
        return this.litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipoCombustivel () {
        return this.tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    /**
     * @return Retorna o valor de combustivel, com base
     * no total de litros e no tipo.
     * @param valor2 Recebe um valor auxiliar
     */
    public String calcularValorFinal(double valor2) {
        if(this.tipoCombustivel.equalsIgnoreCase("Gasolina")){
            this.valor = 4.49 * this.litros;
            return "Valor final: R$" + this.valor + " em gasolina.";
        } else if(this.tipoCombustivel.equalsIgnoreCase("Álcool")){
            this.valor = 3.68 * this.litros;
            return "Valor final: R$" + this.valor + " em álcool.";
        } else if (this.tipoCombustivel.equalsIgnoreCase("Diesel")){
            this.valor = 3.71 * this.litros;
            return "Valor final: R$" + this.valor + " em diesel.";
        } else if (this.tipoCombustivel.equalsIgnoreCase("Flex")) {
            this.valor = 4.49 * this.litros;
            valor2 = 3.68 * this.litros;
            return  "Valor final: R$" + this.valor + " em gasolina."
                    +"\nValor final: R$" + valor2 + " em álcool.";
        } {
            return "Combustivel inválido";
        }
    }

    @Override
    public String toString() {
        return "\nTipo de combustivel escolhido: " + this.tipoCombustivel
                +"\nQuantidade de litros: " + this.litros
                + "\n" + this.calcularValorFinal(0.0);
    }
}
