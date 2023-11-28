public class Cliente {
        private double parcela1;
        private double parcela2;

        public double getParcela1() {
            return parcela1;
        }

        public void setParcela1(double parcela1) {
            this.parcela1 = parcela1;
        }

        public double getParcela2() {
            return parcela2;
        }

        public void setParcela2(double parcela2) {
            this.parcela2 = parcela2;
        }

        public double calcularEmprestimo() {
            return Banco.calcularEmprestimo(this.parcela1, this.parcela2);
        }
}
