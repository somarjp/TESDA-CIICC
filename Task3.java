public class Task3{
    public static void main (String [] args){
        //change the variables in the first section, so that each if statement resolves as true

        String a = new String("Wow");
        String b = a;
        String c = "N/A";
        String d = "Wow!";

        boolean b1 = a == b;
        boolean b2 = d.equals(b+"!");
        boolean b3 = !c.equals(a);

        if (b1&&b2&&b3){
            System.out.println("Success!");
        }else{
            System.out.println("False");
        }
    }
}