public class ArrayDef {

    public static void main(String[] args) {

        String[] words = new String[3];

        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you";

        System.out.println(words[2]);

        String[] fruits = {"apple", "banana", "pear", "kiwi"};

        for(String fruit: fruits) { System.out.println(fruit);}

        int value = 0;
        String text = null;
        System.out.println(text);

        String[] texts = new String[2];
        //this above statement, indicates String will be having two references
        //and java will be assigned as null...!!!!

        System.out.println(texts[1]);
        texts[1] = "one";
    }
}