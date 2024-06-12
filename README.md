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

