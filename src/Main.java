public class Main {
    public static void main(String[] args) {
        Music m1 = new Music("Rude", "3:45", "pop", new Date(31,12,2013), new Singer("MAGIC!", "male", "American", new Date(1, 1, 2012)));
        Music m2 = new Music("With you", "2:34", "punjabi", new Date(11, 8, 2023), new Singer("AP Dhillon", "male", "Indian", new Date(23, 12, 2020)));

        System.out.println(m1);
        System.out.println();
        System.out.println(m2);
    }
}
