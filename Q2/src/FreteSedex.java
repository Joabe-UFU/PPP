class FreteSedex implements FreteStrategy {
    @Override
    public double calcular(double Valor) {
        return 30.00 + (Valor * 0.05);
    }
}
