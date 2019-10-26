<%-- 
    Document   : newjsp
    Created on : 16/09/2019, 20:51:21
    Author     : alunoead
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style type="text/css">
            
            body,
            input,
            button {
                font-family: Arial, Helvetica, sans-serif;
            }
            
            #containerMaior{
                width: 50%;
                margin-left: 25%;
                margin-top: 12.5%;
            }
            #containerEsquerda{
                float:left;
                width: 45%;
                height: 100%
            }
            #containerDireita{
                float:right;
                width: 45%;
                height: 100%
            }
            
            #labelContainer{
                float: left;
                width: 50%;  
            }
            
            #labelContainer > label{
                display: block;
            }
            
            #inputContainer {
                display: flex;
                flex-direction: column;
                float: right;
                width: 50%;
            }
            
            #inputContainer label {
                padding-top: 30px;
            }
            
            #containerBaixo{
                clear: both;
            }
            
                 #containerBaixo button {
                margin-top: 10px;
                border: 0;
                border-radius: 4px;
                height: 48px;
                font-size: 16px;
                background: #200040;
                font-weight: bold;
                color: #FFF;
                cursor: pointer;
            }
            
            .ipt {
                margin-top: 20px;
                border: 1px solid #ddd;
                border-radius: 4px;
                height: 48px;
                padding: 0 5px;
                font-size: 16px;
                color: #666;
            }
            
            select {
                margin-top: 20px;
                border: 1px solid #ddd;
                border-radius: 4px;
                height: 48px;
                padding: 0 20px;
                font-size: 16px;
                color: #666;
            }

            input::placeholder {
                color: #999;
            }
            
            select::placeholder {
                color: #999;
            }
            
            @media (max-width: 580px) {
             .body {
             font-size: 18px;
             }
             #containerEsquerda{
               
                width: 100%;
                height: 50%
            }
            #containerDireita{
                width: 100%;
                height: 50%
            }
}
            .labelSalarioBruto {
               margin-right: 5px;
            }
        </style>
    </head>
    
    <body>
        <form id="containerMaior" method="POST" action="servlet">
            <div id="containerEsquerda">
                <h3>Dados do Salário</h3>
                <label class="labelSalarioBruto">Salário Bruto(R$)</label><input class="ipt" input type="number" name="INPsalarioBruto"/><br>
                <h3>Turno de Trabalho</h3>
                <select id="SLTturnoTrabalho" name="SLTturnoTrabalho" required>   
                    <option value="1"> Diurno </option>
                    <option value="2"> Vespertino </option>
                    <option value="3"> Noturno </option>
                </select>
                <br>
                <h3>Categoria do Funcionário</h3>
                <input  id="operario" name="RDfuncionario" type="radio" value="Operário" required><label for="operario">Operário</label>
                <input  id="gerente"  name="RDfuncionario" type="radio"  value="Gerente" required><label for="gerente">Gerente</label>
            </div>
            
            <div id="containerDireita">
                <h3>Demonstrativo do Cálculo</h3>
                <%  
                    DecimalFormat formato = new DecimalFormat("0.00");
                    double salarioBruto = 0;
                    double imposto = 0;
                    double salarioLiquido = 0;
                  
                    if( request.getParameter("salarioBruto") != null){
                    salarioBruto =  Double.parseDouble(request.getParameter("salarioBruto"));
                                 
                    }
                    
                    if( request.getParameter("imposto") != null){
                    imposto = Double.parseDouble(request.getParameter("imposto"));
                    }
                    
                    if( request.getParameter("salarioLiquido") != null){
                    salarioLiquido = Double.parseDouble(request.getParameter("salarioLiquido"));
                    }
                   


                    
                     %>
                <div id="inputContainer">
                    <label>Salário Bruto(R$)</label><input class="ipt" type="number" name="INPsalarioBrutoM" value=<%= salarioBruto %>  readonly>
                    <label>Imposto</label><input class="ipt" type="number" name="INPimposto" value=<%= imposto %>  readonly>
                    <label>Salário Líquido(R$)</label><input class="ipt" type="number" name="INPsalarioLiquidoM" value=<%= salarioLiquido %> readonly>
                </div>
                    
            </div>
            <div id="containerBaixo">
                <button type="submit" name="calcular">Calcular</button> 
                <button type="reset" name="limpar">Limpar</button> 
                <button type="button" name="sair">Sair</button> 
            </div>
        </form>
    </body> 
</html>
