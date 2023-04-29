import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        boolean stop = false;
        double porcentagemInfectado = 0.00;
        while(stop == false){
            System.out.println("Informe seu nome: ");
            String nome = scanner.next();
            System.out.println("Informe sua idade: ");
            int idade = scanner.nextInt();
            String cartaoVAC = "";
            String sintomas = "";
            String contato = "";
            String viagem = "";
            System.out.println("Faremos algumas pergutas para o diagnóstisco, responda apeas com 'SIM' ou 'NAO'. ");
            while(contador <= 3){
                System.out.println("Seu cartão de vacinação está em dia? (SIM/NÂO)");
                cartaoVAC = scanner.next().toUpperCase();
                if(cartaoVAC.equals("NAO") ){
                    porcentagemInfectado += 10;
                }
                if(cartaoVAC.equals("SIM") || cartaoVAC.equals("NAO")){
                    break;
                }
                
                else if(contador >= 3 ){
                    System.out.println("Não foi possível realizar o diagnóstico.\nGentileza procurar ajuda médica caso apareça algum sintoma.");
                    stop = true;
                }
                contador++;
            }
            if(stop == true){
                break;
            }
            contador = 0;
            while(contador <= 3){
                System.out.println("Teve sintomas recentes? (SIM/NÂO)");
                sintomas = scanner.next().toUpperCase();
                if(sintomas .equals("SIM")){
                    porcentagemInfectado += 30;
                }
                if(sintomas.equals("SIM") || sintomas.equals("NAO")){
                    break;
                }
                
                else if(contador >= 3 ){
                    System.out.println("Não foi possível realizar o diagnóstico.\n Gentileza procurar ajuda médica caso apareça algum sintoma.");
                    stop = true;
                }
                contador++;
            }
            if(stop == true){
                break;
            }
            contador = 0;
            while(contador <= 3){
                System.out.println("Teve contato com pessoas infectadas? (SIM/NÂO)");
                contato = scanner.next().toUpperCase();
                if(contato .equals("SIM")){
                    porcentagemInfectado += 30;
                }
                if(contato.equals("SIM") || contato.equals("NAO")){
                    break;
                }
                
                else if(contador >= 3 ){
                    System.out.println("Não foi possível realizar o diagnóstico.\n Gentileza procurar ajuda médica caso apareça algum sintoma.");
                    stop = true;
                }
                contador++;
            }
            if(stop == true){
                break;
            }
            contador = 0;
            while(contador <= 3){
                System.out.println("Retornou recentemente de viagem? (SIM/NÂO)");
                viagem = scanner.next().toUpperCase();
                if(sintomas .equals("SIM")){
                    porcentagemInfectado += 30;
                }
                if(viagem.equals("SIM") || viagem.equals("NAO")){
                    break;
                }
                
                else if(contador >= 3 ){
                    System.out.println("Não foi possível realizar o diagnóstico.\n Gentileza procurar ajuda médica caso apareça algum sintoma.");
                    stop = true;
                }
                contador++;
            }
            if(stop == true){
                break;
            }
            
            
            System.out.println("A sua ficha a seguir:");
            System.out.println("-----------------------------");
            System.out.println("NOME: " + nome);
            System.out.println("IDADE: " + idade) ;
            System.out.println("Cartão de vacina em dia: " + cartaoVAC);
            System.out.println("Teve sintomas recentes: " + sintomas);
            System.out.println("Teve contato com pessoas infectadas: " + contato);
            System.out.println("Retornou de viagem recentemente: " + viagem + "\n");
            System.out.println("A probabilidade de que você esteja infectado com COVID-19 é de: " + porcentagemInfectado + "%");
            scanner.close();
            if(viagem .equals("SIM")){
                System.out.println("Voce ficará sob observação por 05 dias");
            }
            if(porcentagemInfectado <= 30){
                System.out.println("Paciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica.");
            }
            if(porcentagemInfectado > 30 && porcentagemInfectado <= 60){
                System.out.println("Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.");
            }
            if(porcentagemInfectado > 60 && porcentagemInfectado < 90){
                System.out.println("Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 05 dias para ser acompanhado.");
            }
            if(porcentagemInfectado >= 90){
                System.out.println("Paciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado");
            }
            scanner.close();
            break;
        }
    }
}  