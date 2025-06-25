import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Mercado {

    private Scanner scan = new Scanner(System.in);

    public void start() {

        ArrayList<String> produtos = new ArrayList<>();
        ArrayList<Double> valores = new ArrayList<>();


        boolean executar = true;
        while (executar) {
            try {
                System.out.println("\n----- MENU -----");
                System.out.println("1 - Cadastrar Produto");
                System.out.println("2 - Lista de produtos");
                System.out.println("3 - Remover produto");
                System.out.println("4 - Atualizar produto");
                System.out.println("5 - Produto mais caro");
                System.out.println("6 - Média de preços");
                System.out.println("7 - Produtos com preços acima da média");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");
                int opcao = scan.nextInt();

                switch (opcao) {
                    case 1 -> cadastrarProduto(produtos, valores);
                    case 2 -> exibirLista(produtos, valores);
                    case 3 -> removerProduto(produtos, valores);
                    case 4 -> atualizarProduto(produtos, valores);
//                case 5 ->
                    case 0 -> {
                        System.out.println("Encerrando o programa...");
                        executar = false;
                    }
                    default -> throw new InputMismatchException();
                }


            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                scan.nextLine();
            } catch (Exception e) {
                System.out.println("Entrada invalida!");
                scan.nextLine();
            }
        }
    }

    public void cadastrarProduto(ArrayList<String> produtos, ArrayList<Double> valores) throws InputMismatchException {

        System.out.println("Informe o nome do produto que deseja cadastrar.");
        String resp = scan.next().toLowerCase();

        if (produtos.contains(resp)) throw new InputMismatchException("Já existe um produto cadastrado com esse nome");

        System.out.println("Informe o valor do produto");
        double valor = Double.parseDouble(scan.next().replace(",", "."));

        if (valor < 0) throw new InputMismatchException("Valor não pode ser negativo");

        produtos.add(resp.toLowerCase());
        valores.add(valor);
    }


    public void removerProduto(ArrayList<String> produtos, ArrayList<Double> valores) throws InputMismatchException {

        System.out.println("Informe o nome do produto que deseja remover!");
        String resp = scan.next().toLowerCase();
        if (produtos.contains(resp)) {
            System.out.println("Tem certeza que deseja remover o produto: " + resp + "? 'S' ou 'n'");
            String temp = scan.next();
            if (!temp.equalsIgnoreCase("S")) throw new InputMismatchException("Remover cancelado!");
            int idx = produtos.indexOf(resp);
            produtos.remove(resp);
            valores.remove(idx);
            System.out.println("Remover concluido!");
        } else {
            System.out.println("Produto com esse nome nao encontrado.");
        }

    }

    public void exibirLista(ArrayList<String> produtos, ArrayList<Double> valores) {
        System.out.println("---Lista de Produtos ---");
        double somaTotal = 0;
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(i + ": " + produtos.get(i) + " R$: " + valores.get(i));
            somaTotal += valores.get(i);
        }
        System.out.println("Valor Total: R$" + somaTotal);
    }

    public void atualizarProduto(ArrayList<String> produtos, ArrayList<Double> valores) throws InputMismatchException {

        System.out.println("Informe o nome do produto que deseja atualizar!");
        String resp = scan.next().toLowerCase();
        if (!produtos.contains(resp)) {
            throw new InputMismatchException("Produto com esse nome nao encontrado.");
        }
        System.out.println("produto encontrado: " + resp + " com o valor de R$" + valores.get(produtos.indexOf(resp)));
        System.out.println("'N' para atualizar o nome ou 'V' para atualizar o valor:");
        String temp = scan.next();

        if (temp.equalsIgnoreCase("N")) {
            System.out.println("Informe o nome para atualizar do produto: " + resp);
            String novoNome = scan.next();
            if (produtos.contains(novoNome))
                throw new InputMismatchException("Já existe um produto cadastrado com esse nome");
            produtos.set(produtos.indexOf(resp), novoNome);
            System.out.println("Nome do produto atualizado com sucesso!");
        } else if (temp.equalsIgnoreCase("V")) {
            System.out.println("Informe o valor para atualizar do produto: " + resp);
            double valor = Double.parseDouble(scan.next().replace(",", "."));
            if (valor < 0) throw new InputMismatchException("Valor não pode ser negativo");
            valores.set(produtos.indexOf(resp), valor);
            System.out.println("Valor atualizado com sucesso!");
        } else {
            throw new InputMismatchException("Atualizar cancelado! Resposta invalida!");
        }

    }

}

