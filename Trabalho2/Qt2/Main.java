public class Main {
    public static void main(String[] args) {
        IVehicleMaker toyota = IVehicleMakerSingleton.getInstance("toyota");

        // Foi implementado o Padrao Fabrica pois nele é utilizado Métodos Abstratos e Concretos
        // pois com o padrão de encapsulamento de objetos permite que a classe crie qual objeto
        // for necessário.
        IVehicle marcaToyota = toyota.makeVehicle("civic");

        marcaToyota.drive();
        marcaToyota.start();
        marcaToyota.stop();
        System.out.println("Tudo certo, Civic!");

        IVehicleMaker honda = IVehicleMakerSingleton.getInstance("honda");
        IVehicle marcaHonda = honda.makeVehicle("hilux");

        marcaHonda.drive();
        marcaHonda.start();
        marcaHonda.stop();
        System.out.println("Tudo certo, Hilux!");
    }
}
