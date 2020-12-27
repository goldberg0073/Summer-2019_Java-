package InterviewQuestion;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "ASEDEASDAEASSDEDZ";

        String NoDup = "";
        for (int i = 0; i < str.length(); i++) {
            if (!NoDup.contains("" + str.charAt(i))) {
                NoDup += str.charAt(i);
            }
        }
        System.out.println("NoDup = " + NoDup);

        for (int i = 0; i < NoDup.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (NoDup.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            System.out.println(NoDup.charAt(i) + " count = " + count);
        }
    }
}