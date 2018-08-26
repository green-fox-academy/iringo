import java.util.Random;

public class Reservation implements Reservationy {

    @Override
    public String getDowBooking() {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int index = new Random().nextInt(daysOfWeek.length);
        return daysOfWeek[index];
    }

    @Override
    public String getCodeBooking() {
        Random random = new Random();
        String code = "";
        String base = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < 8; i++) {
            code += base.charAt(random.nextInt(base.length()));
        }
        return code;
    }

    public void printReservation() {
        System.out.println("Booking# " + getCodeBooking() + " " + "for " + getDowBooking());
    }
}
