<%-- 
    Document   : Desenvolvimento WEB
    Created on : 16/09/2019
    Author     : 2653350, Luís Gustavo Borges de Lima
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Calculo de Salário</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="style.css" type="text/css"/>
    </head>
    <body>
        <form method="POST" action="servlet">
            <div id="containerInputs">
                <h3>Dados do Salário</h3>
                <%  
                DecimalFormat df = new DecimalFormat("###,###,###,###,##0.00");
                %>
                <input id="valor" class="ipt" type="number" min="1" step=",01" name="INPsalarioBruto" placeholder="Salario Bruto" required /><br>
               
                <h3>Turno de Trabalho</h3>
                <select id="SLTturnoTrabalho" name="SLTturnoTrabalho" required>   
                    <option value="1"> Matutino </option>
                    <option value="2"> Vespertino </option>
                    <option value="3"> Noturno </option>
                </select>
                <br>
                <h3> Categoria do Funcionario</h3>
                <ul>
                        <li>
                                <input type="radio" name="radioFuncionario" id="operario" value="operario" checked />
                                <label for="operario">Operario</label>
                                <div class="check"></div>
                        </li>

                        <li>
                                <input type="radio" name="radioFuncionario" id="gerente" value="Gerente" />
                                <label for="gerente">Gerente</label>

                                <div class="check"></div>
                        </li>
                </ul>
            </div>
            <hr/>
            <div id="containerResult">
                <h3>Demonstrativo do Cálculo</h3>
                <%  
                   
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
                    <label>Salário Bruto(R$)</label><input class="ipt" type="text" name="INPsalarioBrutoM" value=<%= df.format(salarioBruto) %>  readonly>
                    <label>Imposto</label><input class="ipt" type="text" name="INPimposto" value=<%= df.format(imposto) %>  readonly>
                    <label>Salário Líquido(R$)</label><input class="ipt" type="text" name="INPsalarioLiquidoM" value=<%= df.format(salarioLiquido) %> readonly>
                </div> 
            
                <hr/>
            <div id="btnContainer">
                <button id="calc" type="submit" name="calcular">Calcular</button> 
                <button id="limpar" type="reset" name="limpar"><a href="index.jsp">Limpar</a></button> 
            </div>
        </form>
    </body> 
    <script src="script.js"></script>
</html>
