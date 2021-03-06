package obrak;

import java.util.ArrayList;

public class Aldizkari extends Obra {
    private int aleZenbakia;
    private String ISSN;

    public Aldizkari(int eZenb, String sig, String izenb, int aleZenbakia, String ISSN) {
        super(eZenb, sig, izenb);
        this.aleZenbakia = aleZenbakia;
        this.ISSN = ISSN;
    }

    public Aldizkari(String[] alea) {
        super(Integer.parseInt(alea[1]), alea[2], alea[3]);
        this.aleZenbakia = Integer.parseInt(alea[4]);
        this.ISSN = alea[5];
    }

    public int getAleZenbakia() {
        return aleZenbakia;
    }

    public void setAleZenbakia(int aleZenbakia) {
        this.aleZenbakia = aleZenbakia;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "{" +
                super.toString() +
                "aleZenbakia=" + aleZenbakia +
                ", ISSN='" + ISSN + '\'' +
                '}';
    }

    @Override
    public ArrayList<String> ezaugarrienLista() {
        ArrayList<String> eL = super.ezaugarrienLista();
        eL.add(Integer.toString(aleZenbakia));
        eL.add(ISSN);

        return eL;
    }
}
