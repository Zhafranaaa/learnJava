

public class IfStatement {

    public static void main(String[] args) {
        
        var nilai = 50;
        var absen = 20;

        if(nilai >= 75 && absen >= 75){
            System.out.println("Selamat Anda Lulus");
        } else{
            System.out.println("Silakan Coba Lagi");
        }

        if (nilai >= 80 && absen >= 80){
            System.out.println("nilai anda A");
        } else if (nilai >= 70 && absen >= 70){
            System.out.println("nilai anda B");
        } else if (nilai >= 60 && absen >= 60){
            System.out.println("nilai anda C");
        } else if (nilai >= 50 && absen >= 50){
            System.out.println("nilai anda D");
        } else {
            System.out.println("Nilai Anda E");
        }


    }
}
