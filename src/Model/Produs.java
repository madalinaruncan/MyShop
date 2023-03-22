package Model;

public class Produs {
    String denumire;
    String tip;
    int stocInitial;
    int vandute;
    int pret;

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getStocInitial() {
        return stocInitial;
    }

    public void setStocInitial(int stocInitial) {
        this.stocInitial = stocInitial;
    }

    public int getVandute() {
        return vandute;
    }

    public void setVandute(int vandute) {
        this.vandute = vandute;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }


}
