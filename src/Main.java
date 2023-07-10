import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();
        Sheep sheep = new Sheep();
        farm.setAddress("Hoolywood");
        farm.setOwnerName("john");


        Sheep[]sheep3 = new Sheep[3];
        sheep.setWeight(76.8);
        sheep.setAge(2);
        sheep.setGender("man");
        sheep.setNickName("matilda");


        Sheep sheep1 =new Sheep();
        sheep1.setWeight(69.8);
        sheep1.setAge(2);
        sheep1.setGender("man");
        sheep1.setNickName("vasiy");


        Sheep sheep2 = new Sheep();
        sheep2.setWeight(70.9);
        sheep2.setAge(1);
        sheep2.setGender("man");
        sheep2.setNickName("kashtan");


        Cow[]cow5 = new Cow[5];
        Cow cow = new Cow();
        cow.setWeight(450.6);
        cow.setAge(4);
        cow.setGender("woman");
        cow.setNickName("Matilda");

        Cow cow1 = new Cow();
        cow1.setWeight(532.4);
        cow1.setAge(5);
        cow1.setGender("man");
        cow1.setNickName("ferdinant");

        Cow cow2 = new Cow();
        cow2.setWeight(432.4);
        cow2.setAge(4);
        cow2.setGender("man");
        cow2.setNickName("Guapo");

        Cow cow3 = new Cow();
        cow3.setWeight(612.4);
        cow3.setAge(6);
        cow3.setGender("man");
        cow3.setNickName("mahito");

        Cow cow4 = new Cow();
        cow4.setWeight(332.4);
        cow4.setAge(3);
        cow4.setGender("man");
        cow4.setNickName("chamachalo");

        Hourse[]hourse2 = new Hourse[2];
        Hourse hourse = new Hourse();
        hourse.setWeight(332.4);
        hourse.setAge(4);
        hourse.setGender("man");
        hourse.setNickName("jorgo");


        Hourse hourse1 = new Hourse();
        hourse1.setWeight(342.4);
        hourse1.setAge(3);
        hourse1.setGender("man");
        hourse1.setNickName("mojo");


        //System.out.println("Farm 1 "+sheep);
        //System.out.println(sheep2);
        //System.out.println(sheep3);

       System.out.println(farm);
       // System.out.println(sheep3);


    }
        }