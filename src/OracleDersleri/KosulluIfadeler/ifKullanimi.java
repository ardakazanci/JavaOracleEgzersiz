package OracleDersleri.KosulluIfadeler;

public class ifKullanimi {


    public static void main(String[] args) {


        /*

            Kullanıcının almış olduğu test puanına göre aldığı harf puanı hesaplanıyor.



         */


        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
}



