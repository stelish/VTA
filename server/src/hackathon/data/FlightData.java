package hackathon.data;

import hackathon.model.FlightOption;
import hackathon.util.Time;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FlightData {
	
	public static List<FlightOption> FLIGHTS = new ArrayList<FlightOption>();
	static {
		FLIGHTS.add(new FlightOption("AKL", "WLG", Time.parse("2016-01-03T18:25"), Time.parse("2016-01-03T19:45"), new BigDecimal("99")));
		FLIGHTS.add(new FlightOption("WLG", "AKL", Time.parse("2016-01-05T09:25"), Time.parse("2016-01-05T10:45"), new BigDecimal("89")));
	}
}
