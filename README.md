# avaliacao_pratica_padroes_projeto
Avaliação Prática Pradrões de Proejto 1° Bimestre

# Justificativa dos Padrões de Projeto Aplicados

Este documento detalha o raciocínio por trás da escolha de cada Padrão de Projeto para resolver os problemas apresentados no trabalho prático.

## Questão 1: Sistema de Tarifas de Logística

*Padrão Escolhido: Herança e Polimorfismo*

*Justificativa*

O problema exigia que diferentes tipos de transporte (terrestre, aéreo, etc.), cada um com sua regra de cálculo, fossem tratados de forma genérica pelo sistema. O Polimorfismo é a ferramenta ideal para isso.

   - *Abstração*: Criei uma interface ```Transporte``` que funciona como um "contrato". Ela obriga que toda classe de transporte tenha um método ```calcularTarifa()``` . Isso padroniza a operação, escondendo a complexidade de cada cálculo.

   - *Polimorfismo*: A classe ```Main``` manipula uma lista de ```Transporte``` (a interface). Ao percorrer a lista, ela simplesmente chama ```entrega.calcularTarifa()``` . O Java, em tempo de execução, se encarrega de identificar qual é a classe real do objeto (Aéreo, Terrestre, etc.) e executar a sua implementação específica do método. Isso torna o código cliente incrivelmente limpo e desacoplado.

   - *Extensibilidade*: O design respeita o Princípio Aberto/Fechado. Para adicionar um novo tipo de transporte, basta criar uma nova classe que implemente a interface ``` Transporte``` . Nenhuma alteração é necessária na lógica principal que já existe, tornando o sistema fácil de expandir.

## Questão 2: Plataforma de Pagamentos

*Padrão Escolhido: Factory Method*

*Justificativa*

O requisito chave era que o código principal da aplicação não deveria conhecer os detalhes de como os objetos de pagamento são criados (```new Pix()```, ``` new Boleto()```). A criação precisava ser centralizada e dinâmica.

   - *Centralização da Criação*: A classe ```PagamentoFactory``` foi criada para ser a única especialista em instanciar objetos de pagamento. Toda a lógica de ```if/switch ``` para decidir qual classe criar foi isolada dentro dela.

   - *Desacoplamento*: O código cliente (a ```Loja```) fica totalmente desacoplado das classes concretas de pagamento. Ele só conhece a ```PagamentoFactory``` e a interface ```MetodoPagamento```. Ele pede à fábrica um objeto e o utiliza através do "contrato" da interface, sem nunca saber qual é a classe real por trás.

   - *Manutenção Simplificada*: Se um novo método de pagamento (ex: "Débito") for adicionado, a única classe que precisa ser modificada é a ```PagamentoFactory```. O código cliente, que é a maior parte da aplicação, permanece intacto.

## Questão 3: Site de Notícias e Assinantes

*Padrão Escolhido: Observer*

*Justificativa*

O problema descreve um cenário clássico de "um para muitos": um Tópico (um) precisa notificar múltiplos Leitores (muitos) sobre uma mudança de estado (nova notícia). A analogia perfeita é a de um canal do YouTube e seus inscritos.

   - *Relação Dinâmica*: O padrão permite que os ```Observadores``` (Leitores) se inscrevam e cancelem a inscrição no ```Publicador``` (Tópico) a qualquer momento, de forma dinâmica.

   - *Baixo Acoplamento*: O ```Tópico``` não conhece nada sobre os leitores. Ele apenas mantém uma lista de objetos que implementam a interface ```Observador```. Ele sabe que pode chamar o método ```atualizar()``` em cada um, mas não sabe o que esse método faz. Da mesma forma, os ```Leitores``` não conhecem a lógica interna do Tópico. Eles podem ser reutilizados para observar outros objetos.

   - *Comunicação Automática*: O fluxo de notificação é automatizado. Assim que o método ```publicarNovaNoticia()``` é chamado, o Tópico se encarrega de notificar todos os interessados, eliminando a necessidade de uma lógica manual de verificação no código cliente.

## Questão 4: Relatórios com Funcionalidades Adicionais

*Padrão Escolhido: Decorator*

*Justificativa*

A necessidade era adicionar funcionalidades a um objeto (```RelatorioSimples```) de forma flexível e opcional, sem jamais alterar seu código-fonte. O padrão Decorator foi projetado exatamente para isso.

   - *Princípio Aberto/Fechado*: Essa abordagem respeita perfeitamente este princípio. A classe ```RelatorioSimples``` está "fechada para modificação", mas o sistema está "aberto para extensão" através da criação de novos decoradores.

   - *Composição Dinâmica*: O padrão permite "empilhar" funcionalidades em tempo de execução. Utilizei uma analogia de "embrulhar um presente": comecei com o objeto base e fui adicionando camadas (```RelatorioComGraficos```, ```RelatorioComEstatisticas```), onde cada camada adiciona um novo comportamento.

   - *Flexibilidade*: As funcionalidades podem ser combinadas em qualquer ordem que faça sentido, dando uma enorme flexibilidade ao cliente para montar o tipo de relatório que ele precisa no momento.

## Questão 5: Modelos de Documentos Personalizáveis

*Padrão Escolhido: Prototype*

*Justificativa*

O objetivo era criar novos objetos a partir de "modelos" pré-existentes, evitando o custo de configurar um objeto complexo do zero a cada nova solicitação. A ideia é análoga a um "Ctrl+C, Ctrl+V" de objetos.

   - *Performance*: Clonar um objeto já configurado é, em geral, muito mais rápido do que usar o operador ```new `` e re-executar toda a lógica de inicialização, especialmente se essa lógica envolver, por exemplo, acesso a um banco de dados ou leitura de arquivos.

   - *Simplificação da Criação*: O cliente não precisa saber como construir um objeto complexo. Ele simplesmente pede um clone de um protótipo existente.

   - *Organização com Registry*: A implementação foi melhorada com um ```DocumentoRegistry```, que funciona como um catálogo de protótipos. O cliente fica ainda mais desacoplado, pois não precisa nem conhecer o nome das classes concretas (```ModeloCurriculo```), apenas a chave de identificação no registro (ex: "CURRICULO_PADRAO").
