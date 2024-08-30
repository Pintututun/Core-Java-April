package has_a_relation_21April;

public class Address {
private String cityName;
private String districtName;
private String stateName;
public Address(String cityName, String districtName, String stateName) {
	super();
	this.cityName = cityName;
	this.districtName = districtName;
	this.stateName = stateName;
}
@Override
public String toString() {
	return "Address \nCityName=" + cityName + "\n DistrictName=" + districtName + "\n StateName=" + stateName + "";
}

}
