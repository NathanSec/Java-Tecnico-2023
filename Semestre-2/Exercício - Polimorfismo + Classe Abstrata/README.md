# Java-Tecnico-2023
1.Crie uma classe abstrata Veiculo com os seguintes atributos e métodos:
Atributos:
marca (String)

Métodos:

public abstract double calcularVelocidadeMaxima(): Este método deve ser implementado nas subclasses para calcular a velocidade máxima do veículo.

public abstract void imprimirDescricao(): Este método deve ser implementado nas subclasses para imprimir uma descrição do veículo, incluindo sua marca.


2 - Crie duas subclasses concretas de Veiculo: Carro e Bicicleta. Implemente o método calcularVelocidadeMaxima() de acordo com as características de cada tipo de veículo. Por exemplo, um carro pode ter uma fórmula que depende de sua potência, enquanto uma bicicleta pode ter uma fórmula com base na força do ciclista.

3 - Implemente o método imprimirDescricao() nas subclasses para exibir informações sobre o veículo, incluindo a marca e detalhes específicos, como o modelo do carro ou o tipo de bicicleta.

1.No programa principal, crie instâncias de diferentes tipos de veículos (carros e bicicletas) e chame os métodos calcularVelocidadeMaxima() e imprimirDescricao() para demonstrar o polimorfismo.