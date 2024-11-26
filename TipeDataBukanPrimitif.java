public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        
        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;
        System.out.println(iniByte);
        iniByte = 100;

        int iniInt = 100;
        Integer iniInteger2 = iniInt; //Konversi ke bukan primitif

        Integer iniObject = iniInt; //konversi ke beda tipe pakai .method
        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();







    }
}
