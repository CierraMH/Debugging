package Debugging;

        //The first problem I came across was that my first catch statement would not allow me to place both exceptions using "|".so I added a second catch statement to apply the arrayIndexOutOfBoundsException within my try and catch method.
        //To apply step 6. I added the = sign to my for loop index in my "debugging" class in line 8 to make it go out of bounds which produce the error message "ERROR". I added a breaking point to line 9 in "debuggin" and used the Step Over steps to go through the code to see what the problem was and to fix the ERROR I removed the = sign from my for loop after seeing that the index went to 5 which is not valid.

public class App {
    public static void main(String[] args) throws Exception {

        try {
            int[] nums = { 1, 2, 3, 4, 5 };
            double averages = Debugging.average(nums);
            System.out.println(averages);

            //line 12 is my catch statement to catch any null inputs
        } catch (NullPointerException npe) {
            System.out.println("Incorrect!");

            //line 15 is my catch statement that will catch if the array index is over
        } catch (ArrayIndexOutOfBoundsException ofb){
            System.out.println("ERROR! invalid index");
        }
    }
}
