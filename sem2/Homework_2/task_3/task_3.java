package Java_Seminars.sem2.Homework_2.task_3;

    import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// привести строку из файла к виду select * from students where name = "Ivanov" AND country = "Russia" AND city = "Moscow"
public class task_3 {
    public static String task = "SELECT * FROM students WHERE ";
    public static String getString(String filename) throws IOException {//получение строки из файла
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String str;
        str = br.readLine();
        br.close();
        return str;
    }
    public static String[] getMassiv(String isfaila){//получение массива строк из строки из файла
        String result = (isfaila.replaceAll("[,\\[,\\],{,\",:,\\,,\\s,}]" , "1"));
        String [] xx = result.split("1");
        StringBuilder yy = new StringBuilder();
        for (String s : xx) {
            if (!s.equals("") && !s.equals("1")) {
                yy.append(s).append(" ");
            }
        }
        return (yy.toString()).split(" ");
    }
    public static String getResult(String[] arr){//использование массива для получения стрингбилдера без значения null
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < arr.length; i+=2) {
            if(i <= arr.length-2 && !arr[i+1].equals("null")){
                res.append(arr[i]).append(" = ").append("\"").append(arr[i+1]).append("\"");
            }
            if (i <= arr.length-3 && arr[i+3].equals("null")){
                res.append("");
            }
            if (i <= arr.length-4 && !arr[i+3].equals("null")){
                res.append(" AND ");
            }
        }
        return task.concat(res.toString());
    }
    public static void main(String[] args) throws IOException {
        String first = getString("/Users/SmirnovAnton/Desktop/JAVA/Java_Seminars/sem2/Homework_2/task_3/params.json");
        String[] second = getMassiv(first);
        String res = getResult(second);
        System.out.println(res);
    }
}