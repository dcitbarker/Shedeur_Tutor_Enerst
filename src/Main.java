public class Main extends Person
/**
 implement is for multiple blue-prints
 there are two other classes; abstract and interface

 */
{
    public static void main(String[]args)
    {
        String home = "TF";
        Person person1=new Person();
        Person person2=new Person();

        person1.setAge(20);
        person1.setName("Dela");
        person1.setId("AD21034C8");
        person1.setProgramme("Bsc. Computer Science");

        person2.setAge(19);
        person2.setName("Aba");
        person2.setId("AD31065D9");
        person2.setProgramme("Bsc. Food Science");

        String Eii = person1.getName();

        System.out.println("Your name is "+Eii);
        System.out.println("Your age is "+person1.getAge());
        System.out.println("You offer "+person1.getProgramme());
        System.out.println("Your Id is "+person1.getId());



    }
}

