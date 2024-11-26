

public class SwitchStatement {

    public static void main(String[] args) {
        var nilai = "C";

        switch (nilai){
            case "A": 
                System.out.println(" Anda lulus dengan nilai A ");
                break;
            case "B":
            case "C":
                System.out.println(" Nilai anda Baik");
                break;
            case "D":
                System.out.println(" Anda tidak lulus");
                break;
            default:
                System.out.println("Anda salah jurusan kali");
        }

        //switch lambda
        switch (nilai){
            case "A" -> System.out.println(" Anda lulus dengan baik");
            case "B", "C" -> System.out.println(" Anda lulus dengan cukup baik");
            case "D" -> System.out.println(" Anda tidak lulus");
            default -> {
                System.out.println(" Anda salah jurusan kali");
            }

        }

        //switch yield
      






    }
}
