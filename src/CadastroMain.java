import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroMain {
    public static void main (String [] args) {
        Scanner leia = new Scanner (System.in);
        List<Motorista> motoristas = new ArrayList<>();

        int opcao;
        do{
            System.out.println ("\n      MENU DE CADASTRO DE MOTORISTA        ");
            System.out.println ("      1 - ADICIONAR MOTORISTA                ");
            System.out.println ("      2 - LISTAR MOTORISTAS CADASTRADOS      ");
            System.out.println ("      3 - ATUALIZAR MOTORISTA                 ");
            System.out.println ("      4 - EXCLUIR MOTORISTA                   ");
            System.out.println ("      0 - SAIR                               ");
            System.out.println ("             ESCOLHA UMA OPÇÃO               ");
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println ("\n--- ADICIONAR NOVO MOTORISTA ---");

                    System.out.print("Nome: ");
                    String nome = leia.nextLine();

                    System.out.print("CPF: ");
                    String cpf = leia.nextLine();

                    System.out.print("RG: ");
                    String rg = leia.nextLine();

                    System.out.print("Número da Carteira de Habilitação: ");
                    String numeroDaCarteira = leia.nextLine();

                    System.out.print("Categoria da Carteira (A, B, C, D ou E): ");
                    String categoriaDaCarteira = leia.nextLine();


                    System.out.println("\n--- Cadastro de Endereço ---"); //Cria um cadastro de endereço
                    System.out.print("Cidade: ");
                    String cidade = leia.nextLine();

                    System.out.print("Estado: ");
                    String estado = leia.nextLine ();

                    System.out.print("Bairro: ");
                    String bairro = leia.nextLine();

                    System.out.print("Rua: ");
                    String nomeDaRua = leia.nextLine();

                    System.out.print("Número: ");
                    int numeroDaCasa = leia.nextInt();

                    leia.nextLine();

                    System.out.print("CEP: ");
                    int cep = leia.nextInt();

            
                    System.out.println ("---------- Cadastro de caminhão ----------"); //Cria um cadastro de caminhão

                    System.out.print("Modelo do Caminhao: ");
                    String modeloCaminhao = leia.nextLine();

                    System.out.print("Tipo de Carroceria: ");
                    String carroceria = leia.nextLine();

                    System.out.print ("Renavam: ");
                    String renavam = leia.nextLine();

                    leia.nextLine();

                    System.out.print ("Ano de Fabricação: ");
                    int anoDeFabricacao = leia.nextInt();

                    leia.nextLine();

                    System.out.print("Quilometragem: ");
                    double quilometragem = leia.nextDouble();

                    leia.nextLine();

                    System.out.print("Total de Viagens: ");
                    int totalDeViagens = leia.nextInt();

                    leia.nextLine();

                    System.out.print("Placa: ");
                    String placa = leia.nextLine();

                    leia.nextLine();

                    // Criando o objeto Endereco
                    Endereco endereco = new Endereco(cidade, estado, bairro, nomeDaRua, numeroDaCasa, cep);
                    //Criando o objeto caminhão
                    Caminhao caminhao = new Caminhao(modeloCaminhao, carroceria, renavam,anoDeFabricacao, quilometragem, totalDeViagens, endereco, placa);


                    // Criando o objeto motorista
                    Motorista motorista = new Motorista (nome, categoriaDaCarteira, cpf, rg, numeroDaCarteira, endereco, caminhao);

                    // Adiciona o motorista à lista
                    motoristas.add(motorista);

                    System.out.println("Motorista '" + motorista.getNome() + "' cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE MOTORISTAS ---");
                    if (motoristas.isEmpty()) {
                        System.out.println("Nenhum motorista cadastrado.");
                    } else {
                        for (Motorista m : motoristas) {
                            System.out.println("------------------------------------");
                            System.out.println("Nome: " + m.getNome());
                            System.out.println("CPF: " + m.getCpf());
                            System.out.println("Número da Carteira: " + m.getNumeroDaCarteira());
                            System.out.println("Categoria: " + m.getCategoriaDaCarteira());
                            System.out.println("Caminhão: " + m.getCaminhao ());
                            // Acessando os dados do endereço
                            System.out.println("Endereço: " + m.getEndereco().getNomeDaRua() + ", " + m.getEndereco().getNumeroDaCasa() + " - " + m.getEndereco().getCidade());
                        }
                        System.out.println("------------------------------------");
                    }
                    break;

                case 3:

                    System.out.println("\n--- ATUALIZAR MOTORISTA ---");
                    System.out.print("Digite o CPF do motorista que deseja atualizar: ");
                    String cpfBusca = leia.nextLine();

                    Motorista motoristaParaAtualizar = null; // Variável para guardar o motorista encontrado

                    //Procura o motorista na lista usando um loop
                    for (Motorista m : motoristas) {
                        // Se o CPF do motorista na lista for igual ao CPF digitado
                        if (m.getCpf().equals(cpfBusca)) {
                            motoristaParaAtualizar = m; // Guarda a referência do objeto encontrado
                            break;
                        }
                    }

                    //Verifica se o motorista foi encontrado
                    if (motoristaParaAtualizar != null) {
                        System.out.println("Motorista '" + motoristaParaAtualizar.getNome() + "' encontrado!");

                        System.out.print("Digite o novo nome (ou pressione Enter para manter o atual): ");
                        String novoNome = leia.nextLine();
                        if (!novoNome.isEmpty()) {
                            motoristaParaAtualizar.setNome(novoNome);
                        }

                        System.out.print("Digite a nova categoria da carteira (ou Enter): ");
                        String novaCategoria = leia.nextLine();
                        if (!novaCategoria.isEmpty()) {
                            motoristaParaAtualizar.setCategoriaDaCarteira(novaCategoria);
                        }

                        System.out.print("Digite a nova placa do caminhão (ou Enter)");
                        String novaPlaca = leia.nextLine();
                        if (!novaPlaca.isEmpty()){
                            motoristaParaAtualizar.getCaminhao().setPlaca(novaPlaca);
                        }

                        System.out.println("\nMotorista atualizado com sucesso!");

                    } else {
                        
                        System.out.println("Erro: Motorista com CPF " + cpfBusca + " não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- EXCLUIR MOTORISTA ---");
                    System.out.print("Digite o CPF do motorista que deseja excluir: ");
                    String cpfExclusao = leia.nextLine();

                    Motorista motoristaParaRemover = null;

                    
                    for (Motorista m : motoristas) {
                        if (m.getCpf().equals(cpfExclusao)) {
                            motoristaParaRemover = m; 
                            break;
                        }
                    }

                    
                    if (motoristaParaRemover != null) {
                        
                        motoristas.remove(motoristaParaRemover);
                        System.out.println("Motorista com CPF " + cpfExclusao + " excluído com sucesso!");
                    } else {
                        
                        System.out.println("Erro: Motorista com CPF " + cpfExclusao + " não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        leia.close();
    }

}
