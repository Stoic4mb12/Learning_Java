public interface Practice_Sheet_3_Strings
{
    public static void main(String[] args)
    {
        String a = "Meet Prajapati";

//  Question 1
        String b = a.toLowerCase();
        System.out.println(b);

//  Question 2
        String c = a.replace(" ", "_");
        System.out.println(c);

//  Question 3
        String letter = "<|Dear name|>, thanks a lot";
        letter = letter.replace("<|name|>","Meet");

//  Question 4
        String dou = ("  My name   is   Meet Prajapati");
        System.out.println(dou.indexOf("  "));
        System.out.println(dou.indexOf("   "));

//  Question 5
        String o = ("Dear Harry, \n\tThis Java Course is nice.\nThanks");
        System.out.println(o);
    }
}
