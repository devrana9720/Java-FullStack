
// Enum:-is the keyword used to declare an enumerated type in Java. 
//An enumerated type is a special data type that enables for a variable to be a set of predefined constants. 
// The variable must be equal to one of the values that have been predefined for it. Common examples include compass directions (values of NORTH, SOUTH, EAST, and WEST) and the days of the week.


enum Direction {
    NORTH, SOUTH, EAST, WEST
}

public class Enum {
    public static void main(String[] args) {
        Direction dir = Direction.NORTH;
        System.out.println("Direction: " + dir);
        System.out.println("Ordinal: " + dir.ordinal());
        System.out.println(Direction.values());

        // if(dir == Direction.NORTH) {
        //     System.out.println("You are heading North!");
        // } else if(dir == Direction.SOUTH) {
        //     System.out.println("You are heading South!");
        // } else if(dir == Direction.EAST) {
        //     System.out.println("You are heading East!");
        // } else if(dir == Direction.WEST) {
        //     System.out.println("You are heading West!");
        // }

        //by switch case
        switch(dir) {
            case NORTH:
                System.out.println("You are heading North!");
                break;
            case SOUTH:
                System.out.println("You are heading South!");
                break;
            case EAST:
                System.out.println("You are heading East!");
                break;
            case WEST:
                System.out.println("You are heading West!");
                break;
        }
    }
}
