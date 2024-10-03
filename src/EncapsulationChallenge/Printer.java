package EncapsulationChallenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel,boolean duplex) {
        if(tonerLevel > -1 && tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount > 0 && tonerAmount <= 100){
            if((tonerAmount + tonerLevel) > 100){
                return -1;
            }else{
                tonerLevel += tonerAmount;
            }
        }else{
            return -1;
        }
        return tonerLevel;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if (duplex){
            pagesToPrint = pagesToPrint / 2 + pagesToPrint % 2;
        }else {
            pagesPrinted += pagesToPrint;
        }
        this.pagesPrinted +=pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
