package pacoteBase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2652017
 */
public class Funcionario {
    private float salarioBruto = 0;
    private String turnoTrabalho = "";
    private String categoriaFuncionario = "Operário";
    private float acrescimoBeneficio = 0 ;

    public Funcionario(float salarioBruto, int turno, String categoriaFuncionario){
        
        this.categoriaFuncionario = categoriaFuncionario;
        
        if(turno == 1 ){
            this.turnoTrabalho = "Matutino";
        }else if(turno == 2){
            this.turnoTrabalho = "Vespertino";
        }else if(turno == 3){
            this.turnoTrabalho = "Noturno";
        }
        
        if(categoriaFuncionario.equals("operario")){
            if(this.turnoTrabalho.equals("Matutino") || this.turnoTrabalho.equals("Vespertino")){
                this.acrescimoBeneficio = 0.005F;
            }
            else if (this.turnoTrabalho.equals("Noturno") )
            {
                this.acrescimoBeneficio = 0.007F;
            }
        }else if (categoriaFuncionario.equals("gerente")) {
            if(this.turnoTrabalho.equals("Matutino") || this.turnoTrabalho.equals("Vespertino")){
                this.acrescimoBeneficio = 0.007F;
            }
            else if (this.turnoTrabalho.equals("Noturno") )
            {
                this.acrescimoBeneficio = 0.01F;
            }
        }
        
        this.salarioBruto = (salarioBruto * acrescimoBeneficio) + salarioBruto;
    }
    /**
     * @return the salarioBruto
     */
    public float getSalarioBruto() {
        return salarioBruto;
    }

    /**
     * @param salarioBruto the salarioBruto to set
     */
    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    /**
     * @return the turnoTrabalho
     */
    public String getTurnoTrabalho() {
        return turnoTrabalho;
    }

    /**
     * @param turnoTrabalho the turnoTrabalho to set
     */
    public void setTurnoTrabalho(String turnoTrabalho) {
        this.turnoTrabalho = turnoTrabalho;
    }

    /**
     * @return the categoriaFuncionario
     */
    public String getCategoriaFuncionario() {
        return categoriaFuncionario;
    }

    /**
     * @param categoriaFuncionario the categoriaFuncionario to set
     */
    public void setCategoriaFuncionario(String categoriaFuncionario) {
        this.categoriaFuncionario = categoriaFuncionario;
    }
    
    public float calculoImposto(){
        float resultado = 0;
        float aliquota = 0;
        float parcelaDedutivel = 0;
        
        if(salarioBruto < 1499.16){
            aliquota = 0;
        }else if(salarioBruto < 2246.76){
            aliquota = 0.075F;
            parcelaDedutivel = 112.43F;
        }else if(salarioBruto < 2995.71){
            aliquota = 0.15F;
            parcelaDedutivel = 280.94F;
        }else if(salarioBruto < 3743.20){
            aliquota = 0.225F;
            parcelaDedutivel = 505.62F;
        }else{
            aliquota = 0.275F;
            parcelaDedutivel = 692.78F;
        }
        
        
        resultado = (salarioBruto * aliquota) - parcelaDedutivel;
        
        
        
        return resultado;
    }
    
    public float calculoSalarioLiquido(){
        float resultado = 0;
        resultado = salarioBruto - calculoImposto();
        
        return resultado;
    }
}
