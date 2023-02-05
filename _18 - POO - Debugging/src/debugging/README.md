<h1>Debugging Java</h1>
<p>Curso que apresenta conceitos introdut�rios sobre como podemos trabalhar com debugging na linguagem Java. 
Curso este ministrado por mim em nome da <strong> <a href="https://web.digitalinnovation.one/home"> DIGITAL INNOVATION ONE  </a></strong> ?? e disponibilizado de forma gratuita para a comunidade dos desenvolvedores Java.

<h2>
? Pr�-requistos
</h2>

- [x] Java JDK 8 ou superior
- [x] IDE para desenvolvimento Java

<h2> ? Ementa</h2>
<ol>
    <li>Vis�o Geral</li>
    <li>Pilha de Execu��o de um programa Java</li>
</ol>

<h2>Vis�o Geral</h2>

<p>Erros de programa��o s�o denominados bugs e o processo de encontrar e corrigir bugs � chamado de depura��o ou debugging.</p>
<p>De forma geral, a depura��o � uma tarefa dif�cil e trabalhosa, e a dificuldade varia de acordo com o ambiente de desenvolvimento, o que inclui a linguagem de programa��o e as ferramentas dispon�veis, como depuradores.</p>

<p>Existem duas grandes categorias que englobam a natureza do erro:</p>
<ul>
    <li><h3>Erros de Sintaxe:</h3>� um erro nas regras estabelecidas da linguagem:
        <ol>
            <li>Par�nteses, chaves, colchetes que abrem mas n�o fecham.</li>
            <li>Duas instru��es sem um ponto-e-v�rgula entre elas;</li>
            <li>Uma palavra-chave sendo usada numa posi��o inesperada.</li>        
        </ol>
    </li>
    <li><h3>Erros de Sem�ntica:</h3>  � um erro na "l�gica do c�digo", em sua sem�ntica, o c�digo est� sintaticamente correto, por�m n�o faz o que se esperava dele.
        <ol>
            <li>Tentar dividir um n�mero por uma String ou por zero.</li>
            <li>Atribuir um valor incoerente a um tipo de dado.</li>
            <li>Tentar fechar um arquivo que n�o foi aberto.</li>
        </ol>
    </li>
</ul>

<div align="center">
    <img src="https://media1.giphy.com/media/9o9dh1JRGThC1qxGTJ/giphy.gif?cid=ecf05e47e4eg6hhx3ku1sec3j55c616p31sgn63m6kf0kcmu&rid=giphy.gif&ct=g" width="600" height="400">
</div>

<h2>Depura��o/Debugging</h2>
<p>Linguagens de alto n�vel tornam a depura��o mais f�cil, pois fornecem mais ferramentas para identificar erros, como o tratamento de exce��es. </p>
<p>Os depuradores funcionam assumindo o controle do tempo de execu��o de um programa e permitindo que voc� o observe e controle. Para fazer isso, ele mostra a pilha do programa e permite que voc� a atravesse em qualquer dire��o. Quando voc� est� em um depurador, obt�m uma imagem mais completa de um quadro de pilha do que quando olha os rastreamentos de pilha em uma mensagem de log.</p>

<h2>Pilha de Execu��o de um Programa Java/Stack Trace</h2>
<p><h3>Pilha de Execu��o:</h3> Toda invoca��o de m�todo � empilhada em uma estrutura de dados que isola a �rea de mem�ria de cada um. Quando um m�todo termina (retorna), ele volta para o m�todo que o invocou.</p>
<p><h3>Stack Trace:</h3> � a matriz onde encontramos a pilha de excecu��o da exce��o. Em outras palavras, podemos dizer que o rastreamento da pilha busca (rastreio) para a pr�xima linha onde a exce��o pode surgir.</p>

<h2>? Links �teis</h2>
<ul>
    <li>https://confluence.jetbrains.com/display/IntelliJIDEA/14.+Depurador</li>
    <li>https://www.eclipse.org/community/eclipse_newsletter/2017/june/article1.php</li>
</ul>

<h2>? Refer�ncias </h2>
<ul>
    <li>https://www.hostgator.com.br/blog/debug-desenvolvimento-web/</li>
    <li>https://www.alura.com.br/conteudo/java-excecoes</li>
    <li>https://pt.wikipedia.org/wiki/Depura%C3%A7%C3%A3o</li>
    <li>https://www.sentinelone.com/blog/java-stack-trace-understanding/</li>
    <li>https://www.caelum.com.br/apostila-java-orientacao-objetos/excecoes-e-controle-de-erros#exercicio-para-comecar-com-os-conceitos</li>
</ul>

<h2>? ?Redes Socias</h2>
<p align="center">
<a href="https://www.youtube.com/channel/UCqchrwxLd023IrA8KlCpH9g">YouTube</a> ??
<a href="https://www.instagram.com/estudant.i/">Instagram 1</a> ??
<a href="https://www.instagram.com/camimi_la/">Instagram 2</a> ??
<a href="https://www.linkedin.com/in/cami-la/">LinkedIn</a>
</p>


<h2> ? Contribuindo </h2>

Este reposit�rio foi criado para fins de estudo, ent�o contribua com ele.
Se te ajudei de alguma forma, ficarei feliz em saber. E caso voc� conhe�a algu�m que se identidique com o conte�do, n�o deixe de compatilhar.

Se poss�vel:

??  Star o projeto

? Encontrar e relatar issues


------------

Disponibilizado com ? por [cami-la](https://www.linkedin.com/in/cami-la/ "cami-la").
Gratid�o a professora Camila Cavalcanti!