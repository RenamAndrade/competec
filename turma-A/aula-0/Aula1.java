import java.util.Scanner;
public class Aula1 {
    
    public static void main(String[] args) {
    //Desafio 01
    /*double maca = 7.30;
    double abacaxi = 2.00;
    double pera = 3.00;

    Scanner entrada = new Scanner(System.in);
    System.out.println("Quantas maçãs você deseja?");
    maca *= entrada.nextInt();
    System.out.println("Quantos abacaxis você deseja?");
    abacaxi *= entrada.nextInt();
    System.out.println("Quantas pêras você deseja?");
    pera *= entrada.nextInt();

    double total = (maca + abacaxi + pera);

    System.out.println("O total de compra é R$" + total);*/

    //Desafio 02 - Comparações Lógicas
    //Ex 1
    /*System.out.println("Digite o primeiro valor: ");
    Scanner entradaI = new Scanner(System.in);
    int n1 = entradaI.nextInt();
    System.out.println("DIgite o segundo valor: ");
    int n2 = entradaI.nextInt();
    if (n1 == n2) {
        System.out.println("Os valores são i");

    }
    else {
        System.out.println("Não são valores iguais");
    }*/

    //Ex 2
    /*System.out.println("Digite sua idade: ");
    Scanner entradaID = new Scanner(System.in);
    int idade = entradaID.nextInt();
    if (idade >= 18) {
        System.out.println("Você possui maioridade.");
    }
    else {
        System.out.println("Não possui maioridade.");
    }*/

    //Ex 2.1
    /*System.out.println("Digite a primeira idade: ");
    Scanner entradaIDA = new Scanner(System.in);
    int id1 = entradaIDA.nextInt();
    System.out.println("Digite a segunda idade: ");
    int id2 = entradaIDA.nextInt();
    if (id1 == id2) {
        System.out.println("As idades são iguais.");
    }
    else if (id1 > id2) {
        System.out.println("O primeiro é o mais velho.");
    }
    else {
        System.out.println("O segundo é o mais velho.");
    }*/

    //Ex 2.2
    /*boolean chuva;
    boolean nublado;

    System.out.println("Está chovendo?");
    Scanner entradaC = new Scanner(System.in);
    chuva = entradaC.nextBoolean();
    System.out.println("Está nublado?");
    nublado = entradaC.nextBoolean();

    if (chuva == true && nublado == false) {
        System.out.println("Está chovendo");
    }
    else if (nublado == true && chuva == false) {
        System.out.println("Está nublado");
    }
    else if (chuva == false && nublado == false) {
        System.out.println("Está ensolarado");
    }*/

    //Ex 2.3

    /*System.out.println("Está chovendo?");
    Scanner entradaCG = new Scanner(System.in);
    boolean clima = entradaCG.nextBoolean();
    System.out.println("Está com o guarda-chuva?");
    boolean guarda_chuva = entradaCG.nextBoolean();

    if (clima == true && guarda_chuva == true) {
        System.out.println("Ótimo! Boa viagem.");
    }
    else if (clima == true && guarda_chuva == false) {
        System.out.println("Se ferrou!");
    }*/

    //Switch
    //Ex 1
    /*System.out.println("Digite um número: ");
    Scanner entradaM = new Scanner(System.in);
    int num = entradaM.nextInt();

    if (num%3 == 0 && num%5 == 0) {
        System.out.println("Verdadeiro, múltiplo de ambos.");
    }
    else  if (num%3 == 0 || num%5 == 0){
        System.out.println("Falso");
    }*/

    //Desafio - DDD's dos estados brasileiros

    System.out.println("Insira um dos DDD da lista abaixo\n");
    System.out.println("Região Norte:\n" + "Acre (68)\n" + "Amapá (96)\n" + "Amazonas (92 e 97)\n" +  "Pará (91, 93 e 94)\n" + "Rondônia (69)\n" + "Roraima (95)\n" + "Tocantins (63)\n");
    System.out.println("Região Nordeste:\n" + "Alagoas (82)\n" + "Bahia (71, 73, 74, 75 e 77)\n" + "Ceará (85 e 88)\n" + "Maranhão (98 e 99)\n" + "Paraíba (83)\n" + "Pernambuco (81 e 87)\n" + "Piauí (86 e 89)\n" + "Rio Grande do Norte (84)\n" + "Sergipe (79)\n");
    System.out.println("Região Centro-Oeste:\n" + "Distrito Federal (61)\n" + "Goiás (62 e 64)\n" + "Mato Grosso (65 e 66)\n" + "Mato Grosso do Sul (67)\n");
    System.out.println("Região Sudeste:\n" + "São Paulo (11, 12, 13, 14, 15, 16, 17, 18 e 19)\n" + "Rio de Janeiro (21, 22 e 24)\n" + "Minas Gerais (31, 32, 33, 34, 35, 37 e 38)\n" + "Espírito Santo (27 e 28)\n");
    System.out.println("Região Sul:\n" + "Paraná (41, 42, 43, 44, 45 e 46)\n" + "Rio Grande do Sul (51, 53, 54 e 55)\n" + "Santa Catarina (47, 48 e 49)\n");

    System.out.println("Por favor, digite algum DDD:");
    Scanner Tel = new Scanner(System.in);
    int DDD = Tel.nextInt();
    
    if (DDD == 68) {
        System.out.println("-Acre\n" + "-Entrada: " + DDD + "\n-Saída: Dinossauro.");
    }
    else if (DDD == 96) {
        System.out.println("-Amapá\n" + "-Entrada: " + DDD + "\n-Saída: Mapa.");
    }
    else if (DDD == 92 || DDD == 97) {
        System.out.println("-Amazonas\n" + "-Entrada: " + DDD + "\n-Saída: Floresta.");
    }
    else if (DDD == 91 || DDD == 93 || DDD == 94) {
        System.out.println("-Pará\n" + "-Entrada: " + DDD + "\n-Saída: Parei.");
    }
    else if (DDD == 69) {
        System.out.println("-Rondônia\n" + "-Entrada: " + DDD + "\n-Saída: Redondo.");
    }
    else if (DDD == 95) {
        System.out.println("-Roraima\n" + "-Entrada: " + DDD + "\n-Saída: Roer.");
    }
    else if (DDD == 63) {
        System.out.println("-Tocantis\n" + "-Entrada: " + DDD + "\n-Saída: Toca aqui.");
    }
    else if (DDD == 82) {
        System.out.println("-Alagoas\n" + "-Entrada: " + DDD + "\n-Saída: Alagou tudo.");
    }
    else if (DDD == 71 || DDD == 73 || DDD == 74 || DDD == 75 || DDD == 77) {
        System.out.println("-Bahia\n" + "-Entrada: " + DDD + "\n-Saída: A mimir.");
    }
    else if (DDD == 85 || DDD == 88) {
        System.out.println("-Ceará\n" + "-Entrada: " + DDD + "\n-Saída: Caixa d'água.");
    }
    else if (DDD == 98 || DDD == 99) {
        System.out.println("-Maranhão\n" + "-Entrada: " + DDD + "\n-Saída: Baião de dois.");
    }
    else if (DDD == 83) {
        System.out.println("-Paraíba\n" + "-Entrada: " + DDD + "\n-Saída: Paraibano.");
    }
    else if (DDD == 81 || DDD == 87) {
        System.out.println("-Pernambuco\n" + "-Entrada: " + DDD + "\n-Saída: Cangaço.");
    }
    else if (DDD == 86 || DDD == 89) {
        System.out.println("-Piauí\n" + "-Entrada: " + DDD + "\n-Saída: Windows Nunes.");
    }
    else if (DDD == 84) {
        System.out.println("-Rio Grande do Norte\n" + "-Entrada: " + DDD + "\n-Saída: Quente.");
    }
    else if (DDD == 79) {
        System.out.println("-Sergipe\n" + "-Entrada: " + DDD + "\n-Saída: Zíper.");
    }
    else if (DDD == 61) {
        System.out.println("-Distrito Federal\n" + "-Entrada: " + DDD + "\n-Saída: Malditos engravatados!");
    }
    else if (DDD == 62 || DDD == 64) {
        System.out.println("-Goiás\n" + "-Entrada: " + DDD + "\n-Saída: Sertanejo.");
    }
    else if (DDD == 65 || DDD == 66) {
        System.out.println("-Mato Grosso\n" + "-Entrada: " + DDD + "\n-Saída: Grama alta.");
    }
    else if (DDD == 67) {
        System.out.println("-Mato Grosso do Sul\n" + "-Entrada: " + DDD + "\n-Saída: Grama ainda alta.");
    }
    else if (DDD == 11 || DDD == 12 || DDD == 13 || DDD == 14 || DDD == 15 || DDD == 16 || DDD == 17 || DDD == 18 || DDD == 19) {
        System.out.println("-São Paulo\n" + "-Entrada: " + DDD + "\n-Saída: Terra da garoa.");
    }
    else if (DDD == 21 || DDD == 22 || DDD == 24) {
        System.out.println("-Rio de Janeiro\n" + "-Entrada: " + DDD + "\n-Saída: Copacabana.");
    }
    else if (DDD == 31 || DDD == 32 || DDD == 33 || DDD == 34 || DDD == 35 || DDD == 37 || DDD == 38) {
        System.out.println("-Minas Gerais\n" + "-Entrada: " + DDD + "\n-Saída: Pão de Queijo.");
    }
    else if (DDD == 27 || DDD == 28) {
        System.out.println("-Espírito Santo\n" + "-Entrada: " + DDD + "\n-Saída: Amém.");
    }
    else if (DDD == 41 || DDD == 42 || DDD == 43 || DDD == 44 || DDD == 45 || DDD == 46) {
        System.out.println("-Paraná\n" + "-Entrada: " + DDD + "\n-Saída: Sulista 1.");
    }
    else if (DDD == 51 || DDD == 53 || DDD == 54 || DDD == 55) {
        System.out.println("-Rio Grande do Sul\n" + "-Entrada: " + DDD + "\n-Saída: Sulista 2.");
    }
    else if (DDD == 47 || DDD == 48 || DDD == 49) {
        System.out.println("-Santa Catarina\n" + "-Entrada: " + DDD + "\n-Saída: Sulista 3.");
    }
    else {
        System.out.println("Erro!");
    }

}
}
