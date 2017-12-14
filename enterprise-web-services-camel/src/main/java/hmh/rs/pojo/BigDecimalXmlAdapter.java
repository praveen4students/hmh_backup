package hmh.rs.pojo;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.xml.bind.annotation.adapters.XmlAdapter;


public class BigDecimalXmlAdapter extends XmlAdapter<String, BigDecimal> {

	@Override
	public String marshal(BigDecimal bigDecimal) throws Exception {
		if (bigDecimal != null) {
			BigDecimal ret = bigDecimal.setScale(2, RoundingMode.HALF_UP);
			return ret.toString();
		}
		else {
			return null;
		}
	}

	@Override
	public BigDecimal unmarshal(String s) throws Exception {
		try {
			return new BigDecimal(s);
		} catch (NumberFormatException e) {
			return null;
		}
	}

}
