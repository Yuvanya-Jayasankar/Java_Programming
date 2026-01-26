package first;

public class WeatherAnalyser {

	//USE CASE-1 FROM DAY 1
    public static void main(String[] args) {

        String city = args[0];
        float temperature = Float.parseFloat(args[1]);
        boolean isHot;
        int threshold =30;
        if(temperature > threshold) {
			isHot = true;
		}
		else {
			isHot = false;
		}
       
        System.out.println("City Name: " + city);
        System.out.println("Temperature: " + temperature + " °C");
        if(isHot){
        System.out.println("Condition: Hot day");
        } else{
            System.out.println("Condition: Normal Day");
        }
        WeatherRecord record = new WeatherRecord();

        record = null;
        
    }    
}
class WeatherRecord{
        float temperature;
        String city;
    }
