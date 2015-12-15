package hackathon.data;

import hackathon.model.HotelPackageOption;
import hackathon.model.PackageOption;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HotelData {

	public static List<PackageOption> HOTELS = new ArrayList<PackageOption>();
	static {
		HOTELS.add(new HotelPackageOption("WLG", "Hilton Wellington", new BigDecimal(100)));
	}
}
