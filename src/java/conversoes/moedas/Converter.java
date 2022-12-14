package conversoes.moedas;
import classe.acessorio.Acessorio;
import java.text.DecimalFormat;

public class Converter {
    
    DecimalFormat df = new DecimalFormat();
    
    private double valorReal;
    private String option;
    
    public double getValorReal() {
        return valorReal;
    }

    public void setValorReal(double valorReal) {
        this.valorReal = valorReal;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

 public String convertendo(){
        
        String msg = "";
        if(this.getOption().equalsIgnoreCase("Dolar")){
            msg += "<p><strong>R$ " + this.getValorReal() + " reais</strong> é igual a <strong>US$ " + df.format(Acessorio.convertendoParaDolar(this.getValorReal())) + " dólar(es)</strong></p>";
        }
            return msg;
    }
}
