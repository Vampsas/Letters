import java.util.Collections;

class OperationOnLetters extends InputLetters {

     void operations(){
        Collections.sort(letter);
         System.out.println(letter);

        for ( int m = 0; m < letter.size();){

            System.out.println(letter.get(m) + " " + Collections.frequency(letter, letter.get(m)));

            for (int l = 1; l < letter.size(); l ++) {
                if (letter.get(m).equals(letter.get(l))){
                    letter.remove(letter.get(l));
                    l = 0;

                }
            }

            letter.remove(letter.get(0));
        }

    }

}
