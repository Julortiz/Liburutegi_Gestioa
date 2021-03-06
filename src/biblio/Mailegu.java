package biblio;

import obrak.Obra;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Mailegu {
    private int erregistroZenbakia;
    private String bazkideIzena;
    private Date maileguData, itzultzeData;


    /**
     * Eraikitzailea
     *
     * @param erregistroZenbakia Erregistro zenbakia
     * @param bazkideIzena       Bazkide izena
     * @param maileguData        Mailegu data
     * @param itzultzeData       Itzultze data
     */
    Mailegu(int erregistroZenbakia, String bazkideIzena, Date maileguData, Date itzultzeData) {

    }


    /**
     * Maileguen atributuak idazten ditu pantailan, lerro bakarrean.
     */
    public void idatziFitxategian(PrintWriter pw) {
        SimpleDateFormat dF = new SimpleDateFormat("yyyy-MM-dd");
        pw.printf("%-17s %-12s %-13s",
                this.bazkideIzena,
                dF.format(this.maileguData),
                dF.format(this.itzultzeData));
    }


    /**
     * Erregistro zenbakia-ren getter-a
     *
     * @return Erregistro zenbakia
     */
    int getErregistroZenbakia() {
        return erregistroZenbakia;
    }


    /**
     * Erregistro zenbakia-ren setter-a
     *
     * @param erregistroZenbakia Erregistro zenbakia
     */
    public void setErregistroZenbakia(int erregistroZenbakia) {
        this.erregistroZenbakia = erregistroZenbakia;
    }


    /**
     * @return
     */
    public String getBazkideIzena() {
        return bazkideIzena;
    }


    /**
     * @param bazkideIzena Bazkide izena
     */
    public void setBazkideIzena(String bazkideIzena) {
        this.bazkideIzena = bazkideIzena;
    }


    /**
     * @return Mailegu data
     */
    public Date getMaileguData() {
        return maileguData;
    }


    /**
     * @param maileguData Mailegu data
     */
    public void setMaileguData(Date maileguData) {
        this.maileguData = maileguData;
    }


    /**
     * @return Itzultze data
     */
    public Date getItzultzeData() {
        return itzultzeData;
    }


    /**
     * @param itzultzeData Itzultze data
     */
    public void setItzultzeData(Date itzultzeData) {
        this.itzultzeData = itzultzeData;
    }


    ArrayList<String> maileguEzaugarriakGehituta(ArrayList<String> args) {
        args.set(4, bazkideIzena);
        SimpleDateFormat dF = new SimpleDateFormat("yyyy-MM-dd");
        if (maileguData != null)
            args.set(5, dF.format(maileguData));
        else
            args.set(5, "");
        if (itzultzeData != null)
            args.set(6, dF.format(itzultzeData));
        else
            args.set(6, "");
        return args;
    }
}
