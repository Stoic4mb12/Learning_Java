class Example {
    // Public member
    public int publicVar = 10;

    // Private member
    private int privateVar = 20;

    // Final member
    public final int finalVar = 30;

    // Method to demonstrate primitive data types passed by value
    public void modifyPrimitive(int num) {
        num = 100;
    }

    // Method to demonstrate objects passed by reference
    public void modifyObject(Data obj) {
        obj.value = 200;
    }

    // Method to access private member
    public int getPrivateVar() {
        return privateVar;
    }
}

class Data {
    int value;
}

public class Main {
    public static void main(String[] args) {
        Example example = new Example();
        Data data = new Data();
        data.value = 50;

        // Accessing public member
        System.out.println("Public Variable: " + example.publicVar);

        // Accessing private member via public method
        System.out.println("Private Variable: " + example.getPrivateVar());

        // Demonstrating final keyword
        System.out.println("Final Variable: " + example.finalVar);

        // Primitive data type passed by value
        int num = 10;
        example.modifyPrimitive(num);
        System.out.println("Primitive Value after method call: " + num);

        // Object passed by reference
        example.modifyObject(data);
        System.out.println("Object Value after method call: " + data.value);
    }
}



class lablist3_iii
{
	public static void main(String args[])
	{
		
	}
}
