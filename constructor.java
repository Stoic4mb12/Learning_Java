class constructor {
    int value;

    // Default constructor
    constructor() {
        this(10);     }

    // Parameterized constructor
    constructor(int value) {
        this.value = value;
    }

    void display() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        System.out.println("Name : Meet Prajapati");
        System.out.println("23BCP265");
      
 // Calls the default constructor
        constructor obj = new constructor(); 
 // Displays the value set by the parameterized constructor
        obj.display(); 
    }
}
