package tesla;
    public class Carro {

        String cor;
        String modelo;
        int capacidadeTanque;

        Carro() {

        }

        // Encapsulamento
        Carro(String cor, String modelo, int capacidadeTanque) {
            this.cor =  cor;
            this.modelo = modelo;
            this.capacidadeTanque = capacidadeTanque;
        }
        
        // Void (Diz que irá entrar algo na função)
        // Pegando a Cor (Guardar) - SET
        // This
        void setCor(String cor) {
        this.cor = cor;
        }
        // Imprimindo a Cor (Diz) - GET
        String getCor() {
            return cor;
        }

        //Pegando o Modelo (Guardar) - SET
        void setModelo(String modelo) {
            this.modelo = modelo;
        }
        //Imprimindo o Modelo (Diz) - GET
        String getModelo() {
            return modelo;
        }

        //Pegando o Modelo (Guardar) - SET
        void setCapacidadeTanque(int capacidadeTanque) {
            this.capacidadeTanque = capacidadeTanque;
        }
        //Imprimindo o Modelo (Diz) - GET
        int getCapacidadeTanque () {
            return capacidadeTanque;
        }
            
        double totalValorTanque(double valorCombustivel) {
            return capacidadeTanque * valorCombustivel;
        }
    }
