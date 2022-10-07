public class QuizSoal3warnet {

    int scanfile;
    int printwarna;
    int tehbotol;

    public int getScanfile() {
        return scanfile;
    }

    public void setScanfile(int scanfile) {
        this.scanfile = scanfile;
    }

    public int getPrintwarna() {
        return printwarna;
    }

    public void setPrintwarna(int printwarna) {
        this.printwarna = printwarna;
    }

    public int getTehbotol() {
        return tehbotol;
    }

    public void setTehbotol(int tehbotol) {
        this.tehbotol = tehbotol;
    }

    public static void main(String[] args) {
        QuizSoal3warnet data = new QuizSoal3warnet();
        //=============Input=====================
        data.setScanfile(Integer.parseInt("1000"));
        data.setPrintwarna(Integer.parseInt("500"));
        data.setTehbotol(Integer.parseInt("3000"));
        //=============Output===============
        System.out.println("======BIAYA RENTAL WARNET======");
        System.out.println("harga scanfile: " + data.setScanfile());
        System.out.println("harga printwarna: " + data.setPrintwarna());
        System.out.println("harga tehbotol: " + data.setTehbotol());
    }

    private int setPrintwarna() {
        return printwarna;
    }

    private int setScanfile() {
        return scanfile;
    }
    private int setTehbotol() {
        return tehbotol;
    }
    private void tehbotol(String s) {
    }
    private void printwarna(String s) {
    }
}