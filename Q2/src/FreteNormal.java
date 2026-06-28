class FreteNormal implements FreteStrategy {
    @Override
    public double calcular(double Valor) {
        return Valor > 150 ? 0.00 : 20.00;
    }
}