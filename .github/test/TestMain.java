import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {
    @Test
    public void testCalcNaturalGasEmissions() {
// Average Natural Gas Emissions: 7,892 lbs of CO2e given 5500.0 for natGasConsumption and 119.58 for natGasEF
        boolean firstTest = Main.calcNaturalGasEmissions(5500.0, 119.58) == 7892;

// Average Natural Gas Emissions: 12,385 lbs of CO2e given 4500.3 for natGasConsumption and 229.33 for natGasEF
        boolean secondTest = Main.calcNaturalGasEmissions(4500.3, 229.33) == 12385;

        assertEquals(true, firstTest && secondTest);
    }

    @Test
    public void testCalcElectricityEmissions() {
// Average Electricity Emissions: 14,020 lbs of CO2e given that monthlyElectricityConsumption is 943.3333333333 and totalEF is 1238.5157
        boolean firstTest = Main.calcElectricityEmissions(943.3333333333, 1238.5157) == 14020;

// Average Electricity Emissions: 41,290 lbs of CO2e given that monthlyElectricityConsumption is 657.3242562 and totalEF is 5234.578
        boolean secondTest = Main.calcElectricityEmissions(657.3242562, 5234.578) == 41290;

        assertEquals(true,firstTest&&secondTest);
    }

    @Test
    public void testCalcFuelOilEmissions() {
// Average Gas Emissions: 12,460 lbs of CO2e given 45.9166666667 monthly fuel consumption and 22.6131018643 gallons
        boolean firstTest = Main.calcFuelOilEmissions(45.9166666667, 22.6131018643) == 12460;

// Average Gas Emissions: 23,358 lbs of CO2e given 63.476532 monthly fuel consumption and 30.664643 gallons
        boolean secondTest = Main.calcFuelOilEmissions(63.476532, 30.664643) == 23358;

        assertEquals(true, firstTest && secondTest);


    }

    @Test
    public void testCalcVehicleEmissions() {
// Average Car Emissions: 10,484 lbs of CO2e given 21.6 mpg and 11,398 average miles driven
        boolean firstTest = Main.calcVehicleEmissions(21.6, 11398.0) == 10484;

// Average Car Emissions: 9,312 lbs of CO2e given 33.2 mpg and 15,560.7 average miles driven
        boolean secondTest = Main.calcVehicleEmissions(33.2, 15560.7) == 9312;

        assertEquals(true, firstTest && secondTest);
    }

    @Test
    public void testCalcPropaneEmissions() {
//Average Propane Emissions: 5,766 lbs of CO2e given that monthlyPropaneConsumption is 38.6666666667 and propaneEF is 12.4260044804
        boolean firstTest = Main.calcPropaneEmissions(38.6666666667, 12.4260044804) == 5766;

// Average Propane Emissions: 2,304 lbs of CO2e given that monthlyPropaneConsumption is 24.43456654 and propaneEF is 7.8585833
        boolean secondTest = Main.calcPropaneEmissions(24.43456654, 7.8585833) == 2304;

        assertEquals(true, firstTest && secondTest);
    }
}