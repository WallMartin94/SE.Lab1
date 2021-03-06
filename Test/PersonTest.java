import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




class PersonTest {
        private int age;
        private String name;
        private int ageExpected;
        private String nameExpected;

        private Person person = new Person("Hans",2);
    @Test
    void setName() {
        System.out.println("SetName");

        nameExpected="Hans";
        Assertions.assertEquals(nameExpected,person.getName());
    }

    @Test
    void setAge() {
        System.out.println("Setge");
        ageExpected=2;
        Assertions.assertEquals(ageExpected,person.getAge());


    }
    @Test
    void getName() {


        System.out.println("GetName");


        nameExpected="Hans";
        Assertions.assertEquals(nameExpected,person.getName());


    }


    @Test
    void getAge() {

        System.out.println("GetAge");


        ageExpected=2;
        Assertions.assertEquals(ageExpected,person.getAge());

    }



    @Test
    void reverseName() {
        System.out.println("ReverseName");


        nameExpected="snaH";
        Assertions.assertEquals(nameExpected,person.nameReverser(person.getName()));


    }
}