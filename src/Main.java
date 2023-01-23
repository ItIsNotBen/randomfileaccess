public class Main {

    public static void main(String[] args) {
        System.out.println("Random File Access");

        //print chars 5-10 inc.
        int i = 0;
        char letter = FileHandler.randomRead("data.txt", i);
        while(i != -1) {
            System.out.println(letter);
            i = i+2;
            letter = FileHandler.randomRead("data.txt", i);
        }
    }
}
