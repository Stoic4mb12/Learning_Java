class AccessSpecifiers {
    public int publicValue = 10;
    private int privateValue = 20;

    public int getPrivateValue() {
        return privateValue;
    }

    public void setValues(int publicValue, int privateValue) {
        this.publicValue = publicValue;
        this.privateValue = privateValue;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Name : Meet Prajapati");
        System.out.println("23BCP265");
      
        AccessSpecifiers obj = new AccessSpecifiers();
        System.out.println("Public value: " + obj.publicValue);
        System.out.println("Private value: " + obj.getPrivateValue());

        obj.setValues(30, 40);
        System.out.println("Modified public value: " + obj.publicValue);
        System.out.println("Modified private value: " + obj.getPrivateValue());

        int x = 5;
        System.out.println("Original x: " + x);
        modifyPrimitive(x);
        System.out.println("x after modification: " + x);

        AccessSpecifiers refObj = new AccessSpecifiers();
        refObj.publicValue = 50;
        System.out.println("Original refObj public value: " + refObj.publicValue);
        modifyObject(refObj);
        System.out.println("Modified refObj public value: " + refObj.publicValue);

        final int constant = 15;
        System.out.println("Final constant: " + constant);

        final AccessSpecifiers finalObj = new AccessSpecifiers();
        finalObj.publicValue = 60;
        System.out.println("Modified finalObj public value: " + finalObj.publicValue);
    }

    static void modifyPrimitive(int num) {
        num = 100;
    }

    static void modifyObject(AccessSpecifiers obj) {
        obj.publicValue = 70;
    }
}
