import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

var i = 1;
double total = 0;
while (i < 14) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Latitude: ");
    double lat1 = sc.nextDouble();
    System.out.println("Enter Longitude: ");
    double long1 = sc.nextDouble();
    System.out.println("Enter Latitude: ");
    double lat2 = sc.nextDouble();
    System.out.println("Enter Longitude: ");
    double long2 = sc.nextDouble();

    //converting to radians
    double radlat1 = Math.toRadians(lat1);
    double radlat2 = Math.toRadians(lat2);
    double radlong = Math.toRadians(long1);

    //calculating
    double diflat = lat2 - lat1;
    double raddiflat = Math.toRadians(diflat);

    double diflong = long2 - long1;
    double raddiflong = Math.toRadians(diflong);

    double divlat = (raddiflat / 2);
    double divlong = (raddiflong / 2);

    double sinlat = Math.pow(Math.sin(divlat), 2);
    double sinlong = Math.pow(Math.sin(divlong), 2);
    double coslat1 = Math.cos(radlat1);
    double coslat2 = Math.cos(radlat2);

    double a = sinlat + coslat1 * coslat2 * sinlong;

    double roota = java.lang.Math.sqrt(a);
    double roota1 = java.lang.Math.sqrt(1 - a);
    //double twoa =
    double c = 2 * Math.atan2(roota, roota1);
    double d = c * 6371;
    System.out.printf("The distance is between the two points is ~%.2f kilometers. \n", d);
    
    total = total + d;
    i++;
}

System.out.printf("The total distance over the course of 13 days is ~%.2f kilometers. \n", total);
    }
}
