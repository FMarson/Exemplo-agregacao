public class Data {
    private int dia;
    private int iMes;
    private String sMes;
    private int ano;

    public Data(int dia, int mes, int ano){
        setAno(ano);   
        setMes(iMes);
        setDia(dia);
     }

    public void setDia(int dia){
        //1 - 31 (28, 29,30 ou 31)
        if(dia >= 1 && dia <= 28)
            this.dia = dia;
        else if((iMes == 1 || iMes == 3 || iMes == 5 || iMes == 7 || iMes == 8 || iMes == 10 || iMes == 12) && dia >= 1 && dia <= 31)
            this.dia = dia;
        else if((iMes == 4 || iMes == 6 || iMes == 9 || iMes == 11) && dia >= 1 && dia <= 30)
            this.dia = dia;
        else if(iMes == 2 && dia == 29){
            if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0))
                this.dia = 29;
            else
                this.dia = 28;
        }
        else 
            this.dia = 1;
    }

    public void setMes(int mes){
        //1 - 12
        if(mes >= 1 && mes <= 12)
            this.iMes = mes;
        else
            this.iMes = 1;
    }

    public void setMes(String mes){
        //1 - 12

    }

    public void setAno(int ano){
        //1900 - 2030
        if(ano >= 1900 && ano <= 2030)
            this.ano = ano;
        else
            this.ano = 2024;
    }

    //imprimir data
    
    @Override
    public String toString(){
        return dia + "/" + iMes + "/" + ano;
    }
}
