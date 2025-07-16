public class starpattern {
    public static void main(String[] args) {
        int n = 4;
        int m = 5; // Number of rows for the star pattern

        // Loop for each row
        for (int i = 1; i <= n; i++) {
            // Two spaces for better alignment
        
        // Print star
        for (int j = 1; j <= m; j++) {
            System.out.print("*");
        }
        // Move to the next line after each row
        System.out.println();

    }
}
}
