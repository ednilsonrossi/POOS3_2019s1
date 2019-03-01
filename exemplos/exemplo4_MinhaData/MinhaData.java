public class MinhaData{

    //Atributos
    private int dia;
    private int mes;
    private int ano;

    //Construtor
    public MinhaData(int dia, int mes, int ano){
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public String dataBrazil(){
        String retorno;
        retorno = this.dia + "/" + this.mes + "/" + this.ano;
        return retorno;
    }

    public String dataUSA(){
        String retorno;
        retorno = ano + "-" + mes + "-" + dia;
        return retorno;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano >= 1900 ? ano : 1900;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        if(dia >= 1 && dia <= 30)
            this.dia = dia;
        else
            this.dia = 1;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes >= 1 && mes <= 12 ? mes : 1;
    }
}
