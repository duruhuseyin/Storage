package interview;          //How to find duplicate value in Array?
public class First {

    public static void main(String[] args) {

        String name[] = {"friend", "brother", "relative", "brother"};
        for (int i = 1; i < name.length; i++) {
            for (int j = i + 1; j < name.length; j++) {
                if (name[i].equals(name[j])) {
                    System.out.println(name[i]);
                }
            }
        }
/*********************************************************/
//        String names[] = {"elma", "armut", "uzum", "elma", "armut"};
//
//        for (int i = 0; i < names.length; i++) {
//
//            for (int j = i+1; j < names.length ; j++) {
//
//                if (names[i].equals(names[j])){
//
//                    System.out.println(names[i]);
//                } } } }
/*********************************************************/
    }
}