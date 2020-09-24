package day13;

public class WeatherCountries {
    public static void main(String[] args) {
        System.out.println(cityweather("Berlin"));
        System.out.println(cityweather("Valencia"));
        System.out.println(cityweather("Moscow"));
        System.out.println(cityweather("Riga"));
    }

    private static int cityweather(String city) {
        int temperatureMonday = gettemperatureData(city);
        return temperatureMonday + 6;

    }

    private static int gettemperatureData(String cityName) {
        int output = 0;
        switch (cityName) {
            case "Berlin":
                output = 15;
                break;
            case "Valencia":
                output = 23;
                break;
            case "Moscow":
                output = 8;
                break;
            case "Riga":
                output = 9;
                break;
            default:
                output = -120;
                break;

        }
        return output;
    }
}
