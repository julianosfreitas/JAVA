package tesla;

    class RodarAplicacao {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW Z4");
        carro1.setCapacidadeTanque(60);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(75));

        Carro carro2 = new Carro("Cinza", "Mercedez Benz SLK200", 55);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(60));
        
    }
}
