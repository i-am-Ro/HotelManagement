package HotelManagement;

import java.util.*;

public class GuestManager {

    private Map<String, Guest> guestMap = new HashMap<>();
    private Map<String, String> otpMap = new HashMap<>();

    public Guest addGuest(String phoneNumber, String name) {
        Guest guest = new Guest(name, phoneNumber);
        guestMap.put(phoneNumber, guest);
        return guest;
    }

    public String generateOTP(String phoneNumber) {
        String otp = String.valueOf(new Random().nextInt(9000) + 1000);
        otpMap.put(phoneNumber, otp);
        return otp;
    }

    public boolean validateOTP(String phoneNumber, String otp) {

        if (otpMap.containsKey(phoneNumber)) {
            String storedOtp = otpMap.get(phoneNumber);
            if (storedOtp.equals(otp)) {
                return true;
            }
        }
        return false;
    }

    public Guest getGuest(String phoneNumber) {
        return guestMap.get(phoneNumber);
    }
}