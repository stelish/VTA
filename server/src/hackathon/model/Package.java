package hackathon.model;

import java.math.BigDecimal;
import java.util.Collection;

public class Package {
	
	private Collection<PackageOption> options;
	
	public Package(Collection<PackageOption> options) {
		this.options = options;
	}
	
	public BigDecimal getTotalPrice() {
		BigDecimal result = BigDecimal.ZERO;
		for (PackageOption option : options) {
			result = result.add(option.getPrice());
		}
		return result;
	}
}
