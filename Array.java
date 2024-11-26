public class Array {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[3];
        
        stringArray[0] = "Apel";
        stringArray[1] = "Pisang";
        stringArray[2] = "Ceri";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        String[] namaNama ={
            "satu", "dua", "tiga"
        };

        namaNama[0] = null; //menghapus isi data array

        int[] arrayInt = new int[]{
            1,2,3,4,5
        };

        long[] arrayLong = {
            10L, 20L, 30L
        };

        arrayLong[0] = 0; //menghapus isi data array

        System.out.println(arrayLong.length); //melihat panjang array

        System.out.println(namaNama[0]);
        System.out.println(arrayInt[0]);
        System.out.println(arrayLong[0]);

        //Array di dalam array
        String[][] members = {
            {"EKO", "BAMBANG"},
            {"BUDI", "NUGROHO"},
            {"JOKO"}
        };
        System.out.println(members[0][1]);
        System.out.println(members[1][0]);






    }
}
