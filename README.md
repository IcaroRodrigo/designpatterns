#DESIGN PATTERNS



# Padrão Singleton em Java

Este repositório contém um exemplo de implementação do padrão de projeto Singleton em Java. O padrão Singleton é um padrão de design criacional que garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a essa instância.

## Benefícios do Uso do Padrão Singleton

### 1. Controle de Instância Única

O padrão Singleton assegura que uma classe tenha apenas uma instância durante o tempo de execução da aplicação. Isso é útil para gerenciar recursos compartilhados, como conexões de banco de dados, caches, ou configurações globais.

### 2. Ponto de Acesso Global

O Singleton fornece um ponto de acesso global à sua única instância. Isso significa que qualquer parte do código pode acessar a instância Singleton facilmente, sem a necessidade de criar múltiplas instâncias.

### 3. Economia de Recursos

Como apenas uma instância do Singleton é criada, há economia de recursos. Isto é especialmente benéfico quando a criação da instância é cara em termos de tempo ou recursos, como em conexões de banco de dados.

### 4. Facilitação de Manutenção

Com o Singleton, você centraliza a gestão da instância única, o que facilita a manutenção do estado compartilhado. Qualquer modificação no estado ou comportamento pode ser feita na única instância, evitando inconsistências.

### 5. Controle Estrito de Acesso

O Singleton permite controle estrito sobre como e quando a instância é criada, o que pode ser útil para implementar lógica de inicialização e garantir que a instância esteja sempre em um estado válido.


# Padrão Factory em Java

Este repositório contém um exemplo de implementação do padrão de projeto Factory em Java. O padrão Factory é um dos padrões criacionais mais utilizados e é usado para criar objetos sem expor a lógica de criação ao cliente, referenciando a nova classe criada através de uma interface comum.

## Benefícios do Uso do Padrão Factory

### 1. Desacoplamento

O padrão Factory desacopla o código que usa os objetos do código que cria os objetos. Isso significa que, se você precisar mudar a forma como um objeto é criado, você só precisa modificar o código na fábrica, e não em todos os lugares onde os objetos são usados.

### 2. Princípio Aberto/Fechado

Seguindo o Princípio Aberto/Fechado (Open/Closed Principle) da programação orientada a objetos, o padrão Factory permite que você adicione novas classes de produtos sem modificar o código existente. Você pode criar novas subclasses de fábrica para produzir novos tipos de objetos sem alterar a lógica das classes clientes.

### 3. Gerenciamento de Complexidade

Se a lógica de criação de objetos é complexa, ela pode ser encapsulada dentro da fábrica. Isso simplifica o código cliente, que não precisa se preocupar com os detalhes da criação dos objetos.

### 4. Facilitação de Testes

Factories tornam mais fácil testar o código. Por exemplo, se você precisar substituir uma classe concreta por um mock ou stub em um teste, você pode simplesmente modificar a fábrica para retornar a classe de teste desejada.

### 5. Polimorfismo

Factories permitem o uso de polimorfismo. Ao invés de o código cliente depender de classes concretas, ele pode depender de interfaces ou classes abstratas. Isso facilita a substituição de implementações concretas sem alterar o código cliente.

### 6. Encapsulamento de Lógica de Instanciação

Às vezes, a criação de um objeto pode envolver lógica adicional, como configuração ou preparação de estado. A fábrica pode encapsular essa lógica, mantendo o código de criação organizado e separado.

