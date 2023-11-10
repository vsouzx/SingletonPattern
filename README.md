# SingletonPattern
Simples implementação do Pardão de Projeto 'Singleton'!

# O que é o Singleton e quais são os casos de uso?

O singleton, é um padrão de projeto criacional, que garante que exista apenas uma ÚNICA instância de um objeto/classe, fazendo assim com que ele forneça um ponto de acesso único em qualquer parte do código, como se fosse uma especie de 'variável global'.

É usado geralmente para Cache, Gerenciamentos de Sessões (Banco de dados, WebSocket), Logs, etc.

# Como implementar:

<p>-Construtor deve ser privado</p>
<p>-Deve existir um método público e estático que retorne a instância</p>
<p>-O tipo da instancia deve ser 'private static'</p>

# Tipos de inicialização:

<p>-Eager</p>
<p>-Lazy</p>
<p>-Thread safe method</p>
<p>-Thread safe block</p>
