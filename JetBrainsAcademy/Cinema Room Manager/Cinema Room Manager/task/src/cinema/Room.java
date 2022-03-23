package cinema;

public class Room {

    private final int ROWS = 7;
    private final int SEATS_PER_ROW = 8;

    private Seat[][] seats;

    public Room() {
        seats = new Seat[ROWS][SEATS_PER_ROW];

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = new Seat();
            }
        }
    }

    public Seat[][] getSeats() {
        return seats;
    }

    public void setSeats(Seat[][] seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        StringBuffer value = new StringBuffer();
        for (int i = 0; i <= seats[0].length; i++) {
            value.append((i == 0 ? " " : i) + " ");
        }

        value.append("\n");

        for (int i = 0; i < seats.length; i++) {
            value.append(i + 1 + " ");
            for (int j = 0; j < seats[i].length; j++) {
                value.append(seats[i][j] + " ");
            }

            value.append("\n");
        }


        return value.toString();
    }
}
