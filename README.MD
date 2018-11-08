# Padrões adicionados

## Singleton - Persistência de arquivos (Obter uma única instância da classe)
## Facade - Cadastro de clientes (Tratar os dados e armazenar em um banco de dados)
## Template Method - Utilizado na emissão de relatórios - PDF, TXT, HTML
## Command - Realiza pesquisas no Banco por "Nome" e "Tipo de mateial"
## Command - Status da compra (Carrinho - Escolher produtos; Pagamento - Meios de pagamento ; Compra Conluída)
## Memento - Status da compra (Memento salvo ao avançar a compra e pode ser desfeito caso o usuário deseje ou o servidor apresente algum problema)
## Factory Method - Para gerar conxões com diferentes tipos de banco
## Fabrica - Retorna instância de persistências em memória RAM, Arquivos e Bancos de dados



```java

        Compras compra = new Compras();				//contem carrinho de compras
        MementoCompra mementoCompra = new MementoCompra();
        CareTaker listaEstado = new CareTaker();

        System.err.println("\n** Padrão Memento **\n");

        System.out.println("Início da compra");

        //Escolhendo produtos
        compra.addCarrinho(produtoTeste);
        compra.addCarrinho(produtoTeste);
        mementoCompra.getStatus(compra);    //Carrinho

        //Salvando o carrinho de compras
        listaEstado.adicionarMemento(mementoCompra);


        System.out.println("\nAvançando para forma de pagamento");
        mementoCompra.avancar();
        mementoCompra.getStatus(compra);    //Pagamento

		//Salvando o memento de pagamento
        listaEstado.adicionarMemento(mementoCompra);

        System.out.println("\nConcluindo pagamento");
        mementoCompra.avancar();			//Padrão Command
        mementoCompra.getStatus(compra);    //Pagamento Concluido

        System.out.println("\nRetornando para estado anterior (Pagamento)");
        mementoCompra = listaEstado.getUltimoEstadoSalvo();
        mementoCompra.getStatus(compra);    //Pagamento

        System.out.println("\nRetornando para estado anterior (Carrinho de compra)");
        mementoCompra = listaEstado.getUltimoEstadoSalvo();
        mementoCompra.getStatus(compra);    //Carrinho de compra

        //Vai repetir o primeiro estado pois nao ha mais estados anteriores
        //Dessa maneira nao eh preciso retornar "null" o que pode ocasionar problemas futuros
        System.err.println("\nRetornando para estado anterior (Carrinho de compra)");
        mementoCompra = listaEstado.getUltimoEstadoSalvo();
        mementoCompra.getStatus(compra);    //Carrinho de compra

        System.err.println("\nRetornando para estado anterior (Carrinho de compra)");
        mementoCompra = listaEstado.getUltimoEstadoSalvo();
        mementoCompra.getStatus(compra);    //Carrinho de compra
```
Ao detectar que existe apenas um estado na pilha de mementos, este estado não é deletado, assim não é necessário retornar nulo, evitando possíveis problemas.

O status da compra utiliza o padrão Command para avançar os estados, obetendo assim um memento de comandos.

```java
	mementoCompra.avancar();
```
### Saídas

02 ou mais maneiras de login
```
Você realizou Login Local
Você está logando com o Facebook
```

CRUD em mais de um tipo de persistência
```
 Adicionando Usuario1	Senha do Usuario 1 armazenado em RAM
Adicionando 84	Panfleto	Papel Couchê 90g	true	false	0.018em Banco de Arquivos TXT
```
Comando de pesquisa de usuário
```
Pesquisando por Nome = Usuario1
```
** Padrão Memento **

Início da compra
```
Compra adicioada
Compra adicioada
Status da compra: Adicionando ao Carrinho
```
Avançando na compra
```
Status da compra: Pagamento
```
Avançando na compra
```
Concluindo pagamento
Status da compra: Compra Concluída
```

Retornando para estado anterior (Pagamento)
```
Status da compra: Pagamento
```

Retornando para estado anterior (Carrinho de compra)
```
Status da compra: Adicionando ao Carrinho
```

Status da compra: Adicionando ao Carrinho
```
Retornando para estado anterior (Carrinho de compra)
```

Status da compra: Adicionando ao Carrinho
```
Retornando para estado anterior (Carrinho de compra)
```