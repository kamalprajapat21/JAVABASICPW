class Test {
    // Non-Static Variables (Instance Variables)
    int a;
    String name;

    public static void main(String[] args) {
        // Creating an object of the Test class
        Test obj = new Test(); // className obj = new ClassName();
        
        // Accessing instance variable 'name' (default value is null)
        System.out.println("Name: " + obj.name); // Will print: Name: null

        // Example of a local variable
        int num = 10;
        System.out.println("Number: " + num); // Will print: Number: 10
    }
}
