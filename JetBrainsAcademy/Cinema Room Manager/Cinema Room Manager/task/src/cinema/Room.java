package cinema;

public class Room {

    private int rows;
    private int seatsPerRow;

    private Seat[][] seatMap;

    public Room(int rows, int seatsPerRow) {
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;

        seatMap = new Seat[rows][seatsPerRow];

        for (int i = 0; i < seatMap.length; i++) {
            for (int j = 0; j < seatMap[i].length; j++) {
                seatMap[i][j] = new Seat();
            }
        }
    }

    public int calculateIncome() {
        int income = rows * seatsPerRow * 10;

        if (income > 600) {
            income -= ((rows+1)/2) * seatsPerRow * 2;
        }

        return income;
    }


    @Override
    public String toString() {
        StringBuffer value = new StringBuffer();
        for (int i = 0; i <= seatMap[0].length; i++) {
            value.append((i == 0 ? " " : i) + " ");
        }

        value.append("\n");

        for (int i = 0; i < seatMap.length; i++) {
            value.append(i + 1 + " ");
            for (int j = 0; j < seatMap[i].length; j++) {
                value.append(seatMap[i][j] + " ");
            }

            value.append("\n");
        }


        return value.toString();
    }


}
