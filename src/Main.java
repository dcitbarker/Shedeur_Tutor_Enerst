public class Main extends Persons {
    public static void main(String[] args){
        Persons person1= new Persons();
        Persons person2= new Persons();
        person1.setAge(20);
        person1.setName("Ernie");
        person1.setID("10950924adb");
        person1.setProgramme("CS with Statistics");

        person2.setAge(19);
        person2.setName("Kwame");
        person2.setID("2354adf567");
        person2.setProgramme("Earth Science");

        String name = person1.getName();




        System.out.println(name);
        System.out.println(person1.getAge());
        System.out.println(person1.getProgramme());
        System.out.println(person1.getID());

    }
}
