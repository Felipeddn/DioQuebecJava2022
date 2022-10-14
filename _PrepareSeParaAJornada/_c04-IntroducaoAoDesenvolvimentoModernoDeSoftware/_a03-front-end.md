# Front-End  

Denilson Bonatti  
Tech Lead (lider de Tech)

## Modelo Cliente-Servidor

O modelo cliente-servidor é uma estrutura de aplicação que distribui as tarefas e cargas de trabalho entre os fornecedores de um recurso ou serviço, designados como servidores, e os requerentes dos serviços, designados como cliente.

O Desenvolvimento moderno se dá de forma que profissionais criam a aplicação para os requerentes de um serviços/produtos, que são os clientes, e profissionais que criam a aplicação para os fornecedores desses serviços/produtos requisitados, que são os servidores.

**Front-end** faz a aplicação dos clientes para que eles possam fazer requisições.  
**Back-end** faz a aplicação para os servidores para que eles possam fornecer as requisições realizadas pelos clientes.

Existem linguagens de programação que atende melhor cada uma dessas divisões.

## Desenvolvedor front-end  
O desenvolvedor front-end é que programa a parte visual de um site ou aplicativo, ou seja, aquilo que conseguimos interagir. Quem trabalha com front-end é responsável por desenvolver por meio de código uma interface gráfica, normalmente com as tecnologias base da Web (HTML, CSS e JavaScript).

## Onde que os programadores criam seus códigos?  

**Em uma IDE!**

Um ambiente de desenvolvimento integrado (IDE) é um software para criar aplicações que combina ferramentas comuns de desenvolvimento em uma única interface gráfica do usuário (GUI).

Um programador *raiz* consegue programar até em um editor de texto, mas é uma coisa pouca produtiva, porém nada impede que um excelente programador programe em IDE ou editor de texto, essa diferença não serve para distinguir bons programadores, é só sobre qual a ferramenta minima para programar.

Exemplos de códigos front-end

Linguagem de marcação HTML

~~~html

<!Doctype html>
<html lang="pt-br">
    <head>
        <title>Título da página</title>
        <meta charset="utf-8">
    <head>
    <body>
        <p>Aqui vai o código HTML que fará o site aparecer.</p>
    </body>
</html>

~~~

Linguagem de programação JavaScript

~~~javascript

function startTime(){
    let today = new Date();
    let hora = today.getHours();
    let minuto = today.getMinutes();
    let segundo = today.getSeconds();

    minuto = checkTime(minuto);
    segundo = checkTime(segundo);
    documento.getElementById('txt').innerHTML = hora + ":" + minuto + ":" + segundo;
    tempo = setTimeout('startTime()', 500);
}

function checkTime(contador){
    if (contador < 10) {
        contador = "0" + 1;
    }
    return contador;
}

~~~

Criar aplicação por processadores de texto dificulta muito a produtividade do programador por que a interface gráfica não informa de possíveis erros, o que significa que fica tudo por conta do programador, se ele for procurar um erro de digitação, por exemplo, em um código não será sinalizado para ele nem a linha que contenha esse erro de digitação, já a IDE aponta erros de digitação de forma assentuada. 

Exemplos de IDE gratuitas

VS Code (visual studio code - Microsoft)

Fim da aula 
