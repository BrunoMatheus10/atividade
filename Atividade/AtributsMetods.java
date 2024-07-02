

public class AtributsMetods {

    public static void main(String[] args) {
        
        Pessoa p;
        p = new Pessoa();
        
        Carro c; 
        c = new Carro();

        Time t;
        t = new Time();

        p.nome ="fulano";
        p.idade = 25;
        p.datnasc = "05/03/2000";
        p.rg = "55.777.888";
        p.cpf = "111.222.333.44";
        p.nomedPa = "jose";
        p.nomedMa = "maria";
        p.peso = "80 kl";
        p.altura = "1,80 cm";
        p.numero = "(11) 9 8000-7000";
        p.email = "fulano@email.com";

        c.modelo = "opala";
        c.marca = "chevrolet";
        c.ano = "1996";
        c.motor = "4.1";
        c.cambio = "manual";
        c.freio = "a disco";
        c.suspensão = "integrada";
        c.rodas = "liga leve";
        c.dimensoes = "1,65 cm";
        c.desempenho = "...";

        t.nome = "corinthians";
        t.ano = "1910";
        t.titulo1 = "(2012)";
        t.titulo2 = "(2012)";
        t.titulo3 = "(2013)";
        t.titulo4 = "(2005, 2011, 2015 e 2017)";
        t.titulo5 = "(2008)";
        t.titulo6 = "(2002)";
        t.titulo7 = "(2002 e 2009)";
        t.titulo8 = "(2001, 2003, 2009, 2013, 2017, 2018 e 2019)";

        System.out.println("*Pessoa");

        System.out.println("nome:" + p.nome);
        System.out.println("idade:" + p.idade);
        System.out.println("data de nascimento:" + p.datnasc);
        System.out.println("rg:"+ p.rg);
        System.out.println("cpf:"+ p.cpf);
        System.out.println("nome do pai:"+ p.nomedPa);
        System.out.println("nome da Mae:"+ p.nomedMa);
        System.out.println("peso:"+ p.peso);
        System.out.println("altura:"+ p.altura);
        System.out.println("numero:"+ p.numero);
        System.out.println("email:"+ p.email);

        System.out.println("*Carro");

        System.out.println("modelo:"+ c.modelo);
        System.out.println("marca:"+ c.marca);
        System.out.println("ano:"+ c.ano);
        System.out.println("motor:"+ c.motor);
        System.out.println("cambio:"+ c.cambio);
        System.out.println("freio:"+ c.freio);
        System.out.println("suspensão:"+ c.suspensão);
        System.out.println("rodas:"+ c.rodas);
        System.out.println("dimensões:"+ c.dimensoes);
        System.out.println("desempenho:"+ c.desempenho);
        
        System.out.println("*time");

        System.out.println("nome:"+ t.nome);
        System.out.println("ano de fundação:"+ t.ano);
        System.out.println(" titulos");
        System.out.println("1 Mundial de clubes"+ t.titulo1);
        System.out.println("1 Copa libertadores"+ t.titulo2);
        System.out.println("1 recopa Sul-Americana"+ t.titulo3);
        System.out.println("4 Campeonatos brasileiros"+ t.titulo4);
        System.out.println("1 Brasileiro da Serie B"+ t.titulo5);
        System.out.println("1 Torneio Rio-são paulo"+ t.titulo6);
        System.out.println("2 Copas do brasil"+ t.titulo7);
        System.out.println("7 Campeonatos Paulistas"+ t.titulo8);

    }
}