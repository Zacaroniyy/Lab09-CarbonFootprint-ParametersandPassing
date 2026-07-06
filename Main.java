// PARTNER NAME: Sean Leblanc
// PARTNER NAME: Sean Leblanc
// CS111 SECTION #: 09
// DATE: 10/06/2026


public class Main {

    public static void main(String[] args) {

        int vehicle = calcVehicleEmissions(25.0, 1200.0);
        int gas = calcNaturalGasEmissions(50.0, 11.7);

        System.out.println("Vehicle emissions: " + vehicle);
        System.out.println("Natural gas emissions: " + gas);
    }

    public static int calcVehicleEmissions(double mpg, double avgMilesDriven) {
        double emissions = (avgMilesDriven / mpg) * 19.6;
        return (int) Math.round(emissions);
    }

    public static int calcNaturalGasEmissions(double natGasConsumption, double natGasEF) {
        double emissions = natGasConsumption * natGasEF;
        return (int) Math.round(emissions);
    }
}