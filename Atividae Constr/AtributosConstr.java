public class AtributosConstr {

    public static void main(String[] args) {
        
        PessoaConstr p = new PessoaConstr("Fulano", 25, "05/03/2000", "55.777.888", "111.222.333.44",
                              "Jose", "Maria", "80 kg", "1,80 m", "(11) 9 8000-7000",
                              "fulano@email.com");
        
        CarroConstr c = new CarroConstr("Opala", "Chevrolet", "1969", "2.8", "Manual",
                            "A disco", "Integrada", "Liga leve", "1.100 kg", "155km/h");
        
        TimeConstr t = new TimeConstr("Corinthians", "1910", "(2012)", "(2012)", "(2013)",
                          "(2005, 2011, 2015 e 2017)", "(2008)", "(2002)",
                          "(2002 e 2009)", "(2001, 2003, 2009, 2013, 2017, 2018 e 2019)");

   
        System.out.println("*Pessoa");
        System.out.println("Nome: " + p.nome);
        System.out.println("Idade: " + p.idade);
        System.out.println("Data de Nascimento: " + p.datnasc);
        System.out.println("RG: " + p.rg);
        System.out.println("CPF: " + p.cpf);
        System.out.println("Nome do Pai: " + p.nomedPa);
        System.out.println("Nome da Mãe: " + p.nomedMa);
        System.out.println("Peso: " + p.peso);
        System.out.println("Altura: " + p.altura);
        System.out.println("Número: " + p.numero);
        System.out.println("Email: " + p.email);
       
        System.out.println("\n*Carro");
        System.out.println("Modelo: " + c.modelo);
        System.out.println("Marca: " + c.marca);
        System.out.println("Ano: " + c.ano);
        System.out.println("Motor: " + c.motor);
        System.out.println("Câmbio: " + c.cambio);
        System.out.println("Freio: " + c.freio);
        System.out.println("Suspensão: " + c.suspensao);
        System.out.println("Rodas: " + c.rodas);
        System.out.println("Dimensões: " + c.peso);
        System.out.println("Desempenho: " + c.desempenho);
        
        System.out.println("\n*Time");
        System.out.println("Nome: " + t.nome);
        System.out.println("Ano de Fundação: " + t.ano);
        System.out.println("Títulos Mundiais de Clubes: " + t.titulo1);
        System.out.println("Copa Libertadores: " + t.titulo2);
        System.out.println("Recopa Sul-Americana: " + t.titulo3);
        System.out.println("Campeonatos Brasileiros: " + t.titulo4);
        System.out.println("Brasileiro da Série B: " + t.titulo5);
        System.out.println("Torneio Rio-São Paulo: " + t.titulo6);
        System.out.println("Copas do Brasil: " + t.titulo7);
        System.out.println("Campeonatos Paulistas: " + t.titulo8);
       
    }
}