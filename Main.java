public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de catálogo de itens colecionáveis!");
        int opcao = 0;
        do{
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar item");
            System.out.println("2 - Listar itens");
            System.out.println("3 - Sair");
            opcao = Integer.parseInt(System.console().readLine());
            switch(opcao){
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.println("Cadastrar item");
                    break;
                case 2:
                    System.out.println("Listar itens");
                    break;
                case 3:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);
    }
}