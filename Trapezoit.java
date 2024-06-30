import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Trapezoit {
    public static void main(String[] args) {
        String filename = "C:\\Ayaa's\\PL\\src\\trapezoid.txt";
        List<Trapezium> a = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {

                String[] b = line.split(",");
                Trapezium c = new Trapezium();
                c.sisiA = Double.parseDouble(b[0]);
                c.sisiB = Double.parseDouble(b[1]);
                c.tinggi = Double.parseDouble(b[2]);
                a.add(c);
            }
        } catch (IOException x) {
            System.err.println(x.getMessage());
        }
        for (Trapezium y : a) {
            double luasTrapesium = y.luas();
            System.out.println("Luas Trapesium: " + luasTrapesium);
        } System.out.println("\n");
        for (Trapezium y : a) {
            double kelTrapesium = y.keliling();
            System.out.println("Keliling Trapesium: " + kelTrapesium);
        } System.out.println("\n");
        System.out.println("Luas Trapesium > 5000: ");
        for (Trapezium y : a){
            double luasTrapesium = y.luas();
            if (luasTrapesium > 5000){
                System.out.println("Luas Trapesium: "+ luasTrapesium);
            }
        }
    }
}