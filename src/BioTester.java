public class BioTester {
    public static void testBio() {
        Bio bio = new Bio();
        int[] testAges = {25, -5, 180, 0, 150};

        for (int age : testAges) {
            try {
                bio.checkAge(age);
            } catch (InvalidAgeException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}