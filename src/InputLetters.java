import java.util.*;

class InputLetters {

    private Scanner sc = new Scanner(System.in);

    private ArrayList<String> letters = new ArrayList<>();
            ArrayList<Character> letter = new ArrayList<>();

    void input() {

        System.out.println("Podaj liczbe ");
         int number_of_tests = sc.nextInt();
            sc.nextLine();

        for (int i = 0; i < number_of_tests; i++) {
            System.out.println("Podaj tekst");
            String text = sc.nextLine();
            String[] s = text.split(" ");
            letters.addAll(Arrays.asList(s));
            System.out.println(letters);
        }
    }
        void changeToChar(){

             for (String letter1 : letters) {
                 for (int j = 0; j < letter1.length(); j++) {
                     letter.add(letter1.charAt(j));
                 }
             }
             System.out.println(letter);
    }
}
