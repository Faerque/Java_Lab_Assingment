package Lab_Array_2;

public class StudentSurvey {


    public static void main(String[] args) {

        int responses[] = { 1, 2, 5, 6 , 7 , 9, 10, 1, 6, 3, 8, 7, 6, 10, 3, 8, 5, 4, 7, 9, 3, 10, 2, 5, 5, 7, 8, 9, 4, 10, 1, 9, 7, 4, 9, 3, 8, 6, 9, 3 };

        int freq[] = new int[11];

        for(int ans = 0; ans < responses.length; ans++)
            ++freq[responses[ans]];
        System.out.printf("%s%10s","Rating", "Total");

        for (int rating = 1; rating< freq.length; rating++)
            System.out.printf("%d%10d", rating, freq[rating]);

    }

}
