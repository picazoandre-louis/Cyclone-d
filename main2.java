public class Main {

    public static void main(String[] args) {

        double dis1to2 = calcCoor(25, 15, 23, 20);
        double dis2to3 = calcCoor(23, 20, 21, 24);
        double dis3to4 = calcCoor(21, 24, 20, 27);
        double dis4to5 = calcCoor(20, 27, 19, 35);
        double dis5to6 = calcCoor(19, 35, 21, 46);
        double dis6to7 = calcCoor(21, 46, 23, 56);
        double dis7to8 = calcCoor(23, 56, 25, 65);
        double dis8to9 = calcCoor(25, 65, 28, 70);
        double dis9to10 = calcCoor(28, 70, 32, 73);
        double dis10to11 = calcCoor(32, 73, 34, 74);
        double dis11to12 = calcCoor(34, 74, 36, 74);
        double dis12to13 = calcCoor(36, 74, 39, 74);

        double totaldist = dis1to2 + dis2to3 + dis3to4 + dis4to5 + dis5to6 + dis6to7 + dis7to8 + dis8to9 + dis9to10 + dis10to11 + dis11to12 + dis12to13;
        System.out.printf("The total distance over the course of 13 days is ~%.2f kilometers. \n", totaldist);
}


    public static double calcCoor(double lat1, double long1, double lat2, double long2) {
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


    return d;
}

    }

