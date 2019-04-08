public class AnimalsTest {
    public static void main(String[] args){
       //public void add() {


            Animals[] animal = new Animals[5];
            animal[0] = new Cat();
            animal[1] = new Dog();
            animal[2] = new Wolf();
            animal[3] = new Tiger();
            animal[4] = new Hippo();

            for (int i = 0; i < animal.length; i++) {
                animal[i].makeNoise();

            }
      //  }


    }
}
