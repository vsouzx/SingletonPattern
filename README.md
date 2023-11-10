# SingletonPattern
Simples implementação do Pardão de Projeto 'Singleton'!

# O que é o Singleton e quais são os casos de uso?

O singleton, é um padrão de projeto criacional, que garante que exista apenas uma ÚNICA instância de um objeto/classe, fazendo assim com que ele forneça um ponto de acesso único em qualquer parte do código, como se fosse uma especie de 'variável global'.

É usado geralmente para Cache, Gerenciamentos de Sessões (Banco de dados, WebSocket), Logs, etc.

# Como implementar:

-Construtor deve ser privado
-Deve existir um método público e estático que retorne a instância
-O tipo da instancia deve ser 'private static'

#Tipos de inicialização:

-Eager
-Lazy
-Thread safe method
-Thread safe block
