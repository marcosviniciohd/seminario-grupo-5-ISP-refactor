# SOLID

## Interface Segregation Principle (ISP) - Princípio da Segregação de Interface
### "Uma classe não deve ser forçada a implementar interfaces e métodos que não irão utilizar." -- Robert C. Martin

Utilizando o [princípio da segregação de interface](https://en.wikipedia.org/wiki/Interface_segregation_principle), podemos criar interfaces mais específicas para cada tipo de classe, evitando que uma classe implemente métodos que não serão utilizados.
Portanto implementamos a interface **ReajusteTributavel** que contém o método *valorImpostoDeRenda()*, facilitando a segregação de interfaces, a classe **Anuenio** não será mais obrigada a implementar o método *valorImpostoDeRenda()*. Podendo implementar a interface *Reajuste* que faz sentido para o seu comportamento.
