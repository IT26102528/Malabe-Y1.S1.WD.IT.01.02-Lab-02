public class IT26102528Lab2Q2 {

    public static void main(String[] args) {

        int side = 10; // Given side length of the square

        double perimeter;
        double radius;

        // Value of PI
        double PI = 3.14;

        // Calculate the perimeter of the square
        // Formula: Perimeter = 4 * side

        perimeter = 4 * side;

        // The same rope is used to create the circle
        // Therefore, circumference of circle = perimeter of square

        // Using the formula: Circumference = 2 * PI * radius
        // perimeter = 2 * PI * radius
        // radius = perimeter / (2 * PI)

        radius = perimeter / (2 * PI);

        // Output the result
        System.out.println("Radius of the circular fence: " + radius);
    }
}