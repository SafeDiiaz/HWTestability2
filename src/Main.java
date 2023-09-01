// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int height = 181;
        int weight = 80;
        int result = service.calculate(height , weight );
        System.out.println (result);




        }
    }
