package practice.corejava.interview;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class FindIPInRange {

	private static long ipToLong(InetAddress ip) {
        byte[] octets = ip.getAddress();
        long result = 0;
        for (byte octet : octets) {
            result <<= 8;
            result |= octet & 0xff;
        }
        return result;
    }

	private static String getRegion(long inputIP) throws UnknownHostException {
		long rangeINLow = ipToLong(InetAddress.getByName("10.1.0.0"));
		long rangeINHigh = ipToLong(InetAddress.getByName("10.10.1.1"));
		long rangeUS1Low = ipToLong(InetAddress.getByName("18.1.1.0"));
		long rangeUS1High = ipToLong(InetAddress.getByName("25.0.0.1"));
		long rangeBRLow = ipToLong(InetAddress.getByName("55.10.1.0"));
		long rangeBRHigh = ipToLong(InetAddress.getByName("75.1.0.255"));
		long rangeUKLow = ipToLong(InetAddress.getByName("101.1.0.1"));
		long rangeUKHigh = ipToLong(InetAddress.getByName("120.1.0.255"));
		long rangeUS2Low = ipToLong(InetAddress.getByName("255.0.0.1"));
		long rangeUS2High = ipToLong(InetAddress.getByName("255.255.255.0"));
		
		if (inputIP >= rangeINLow && inputIP <= rangeINHigh) {
			return "IN";
		}
		if ((inputIP >= rangeUS1Low && inputIP <= rangeUS1High)
				|| (inputIP >= rangeUS2Low && inputIP <= rangeUS2High)) {
			return "US";
		}
		if (inputIP >= rangeBRLow && inputIP <= rangeBRHigh) {
			return "BR";
		}
		if (inputIP >= rangeUKLow && inputIP <= rangeUKHigh) {
			return "UK";
		}
		return null;
	}

	public static void main(String[] args) throws UnknownHostException {
        long inputIP1 = ipToLong(InetAddress.getByName("10.1.1.1"));
        long inputIP2 = ipToLong(InetAddress.getByName("102.1.1.0"));
        System.out.println(getRegion(inputIP1));
        System.out.println(getRegion(inputIP2));
	}

}
