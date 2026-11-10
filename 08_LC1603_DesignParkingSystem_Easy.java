
class ParkingSystem {

    private int[] parking;

    public ParkingSystem(int big, int medium, int small) {
        parking = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {

        if (parking[carType - 1] == 0) {
            return false;
        }

        parking[carType - 1]--;
        return true;
    }
}
