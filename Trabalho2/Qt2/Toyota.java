public class Toyota implements IVehicleMaker{

    public IVehicle makeVehicle(String modelo) {
        if(modelo.equals("civic")){
            return new Civic();
        }
        return null;
    }
}
