public class MegaBytesConverter {
    public static void main(String[] args) {

    printMegaBytesAndKiloBytes(2500);
    printMegaBytesAndKiloBytes(-1024);
    printMegaBytesAndKiloBytes(5000);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        //"XX KB = YY MB and ZZ KB".
        //"2500 KB = 2 MB and 452 KB"
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }else {
            int megaBytes = kiloBytes / 1024;
            int rest = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + rest + " KB");
        }
    }
}
