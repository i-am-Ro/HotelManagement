package HotelManagement;

import java.time.LocalDate;
import java.util.UUID;

public class Main {
        public static void main(String[] args) {

                GuestManager guestManager = new GuestManager();
                RoomManager roomManager = new RoomManager();
                ReservationManager reservationManager = new ReservationManager();

                // Test GuestManager ---->

                Guest g1 = guestManager.addGuest("+91 6294599756", "Rohit");
                System.out.println("Guest Added : " + g1.getName() + ", Phone : " + g1.getPhoneNumber());

                String otp = guestManager.generateOTP("+91 6294599756");
                System.out.println("OTP Generate : " + otp);

                boolean isValid = guestManager.validateOTP("+91 6294599756", otp);
                System.out.println("OTP Validation: " + isValid);

                // Test RoomManager
                Room room = roomManager.addRoom("101", RoomType.STANDARD, 1000.0);
                System.out.println(
                                "Room Added -->  :   Type : " + room.getRoomType() + ", Price : "
                                                + room.getPrice());

                UUID roomId = room.getId();
                roomManager.updateRoom(roomId, RoomType.STANDARD);
                roomManager.updatePrice(roomId, RoomType.SUITE, 2000.0);
                Room updatedRoom = roomManager.getRoom(roomId);
                System.out.println(
                                "Updated Room --> :  Type : " + updatedRoom.getRoomType()
                                                + ", Price : " + updatedRoom.getPrice());

                // Test ReservationManager
                LocalDate startDate = LocalDate.of(2025, 6, 10);
                LocalDate endDate = LocalDate.of(2025, 6, 15);
                Reservation reservation = reservationManager.createReservation(g1, updatedRoom, startDate, endDate);
                System.out.println("Reservation Created --> :  Guest : "
                                + reservation.getGuest().getName() +
                                ", Room : " + reservation.getRoom().getRoomNumber() + ", From " + startDate + " to "
                                + endDate);
        }
}