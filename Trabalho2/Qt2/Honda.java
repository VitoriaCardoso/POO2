public class Honda implements IVehicleMaker{
    @Override
    public IVehicle makeVehicle(String modelo) {
        if(modelo.equals("hilux")){
            return new Hilux();
        }
        return null;
    }
}
