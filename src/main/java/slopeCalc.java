import java.util.Scanner;

public class slopeCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the distance and slope calculator!");
        
        double x, x2, y, y2;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the x-coordinate of your first point: ");
        x = scan.nextDouble();
        System.out.println("Please enter the y-coordinate of your first point: ");
        y = scan.nextDouble();
        System.out.println("Please enter the x-coordinate of your second point: ");
        x2 = scan.nextDouble();
        System.out.println("Please enter the y-coordinate of your second point: ");
        y2 = scan.nextDouble();
        
        if (x < 0){
            x = x * -1;
        }
        if (x2 < 0){
            x2 = x2 * -1;
        }
        if (y < 0){
            y = y * -1;
        }
        if (y2 < 0){
            y2 = y2 * -1;
        }
        double slope = (y2 - y) / (x2 - x);
        double distance = Math.sqrt((Math.pow(x2-x, 2)) + (Math.pow(y2-y, 2)));
        
        System.out.println("point 1: (" + (int)x +", " + (int)y +")");
        System.out.println("point 2: (" + (int)x2 +", " + (int)y2 +")");
        System.out.println("distance: " + distance);
        System.out.println("slope: " + slope);
    }
    
}
