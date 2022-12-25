public class Practice {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
        score = 10000;
        levelCompleted = 0;
        bonus = 200;

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);



        }
//        int[] myIntegers = getIntergers[5];

//        int[] myIntArray = new int[25];
//
//        for (int i = 0; i < myIntArray.length; i++){
//            myIntArray[i] = i * 10;
//        }
//
//        for (int i = 0; i < myIntArray.length; i++){
//            System.out.println("Element " + i + ", Value is " +myIntArray[i]);
//        }
        //The "You got the high score"
        //score > 99
        //score = 100
        //score = 0

    }
//        char[][] elements = {
//                {'X', 'O', 'X'},
//                {'X', 'O','X'},
//                {'X', 'X', 'O'} };
//
//        for (int row = 0; row < elements.length; row++) {
//            for (int column = 0; column < elements[row].length; column++){
//                System.out.print(elements[row][column] + " ");
//            }
//            System.out.println();
//            }
//        }

//        ArrayList<String> words = new ArrayList<>();
//        ArrayList<Integer> scores = (ArrayList<Integer>) List.of(3, 4, 5, 6, 8, 9 );
//        ArrayList<String> problems = new ArrayList<>();
//
//        words.add("G-string");
//        for (String nengi : words){
//            System.out.println(words);
//        }
//        int total = 0;
//        for (Integer score : scores){
//            total += score;
//        }

//        for(int i = -100; i <= 100; i++){
//            System.out.println(i + " squared = "+ (i * i));
//        }
//        for (int j = 2; j <= 12; ++j){
//            System.out.println(j);
//        }
//        for(int i = 1; i <= 10; i++){
//            System.out.print(i + " ");
//        }

//        for(int i = 1; i <= 6; i++){
//            for (int j = 1; j <=3; j++)
//                System.out.println(j);
//        }
//        for (int i = 1; i <= 6; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
//        int max;
//        int min = 10;
//        max = 17 - 4 /10;
//        max = max | 6;
//        min = max - min;
//        System.out.println(max *2);
//        System.out.println(max + min);
//        System.out.println(max);
//        System.out.println(min);

    }
