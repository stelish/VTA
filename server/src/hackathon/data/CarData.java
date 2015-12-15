package hackathon.data;

import hackathon.model.PackageOption;
import hackathon.model.RentalCarPackageOption;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarData {

	public static List<PackageOption> CARS = new ArrayList<PackageOption>();
	static {
		CARS.add(new RentalCarPackageOption("WLG", "Honda Jazz", new BigDecimal(45)));
	}
}
