import java.util.Arrays;

public class App {

    public static int[] cutArray(int[] array, int[] commands) {

        int arrayIdx = commands[1] - commands[0];
        int[] cutArray = new int[arrayIdx + 1];
        for (int j = 0; j <= arrayIdx; j++) {
            cutArray[j] = array[commands[0] - 1 + j];
        }
        Arrays.sort(cutArray);
        return cutArray;
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {

            answer[i] = cutArray(array, commands[i])[commands[i][2] - 1];
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        int[] array = { 1, 5, 2, 6, 3, 7, 4 };
        int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
        System.out.println(solution(array, commands));
    }
}
