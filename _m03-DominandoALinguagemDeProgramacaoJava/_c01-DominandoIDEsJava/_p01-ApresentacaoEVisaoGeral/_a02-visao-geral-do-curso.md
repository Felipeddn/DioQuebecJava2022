# Visão geral do curso  

Camila Cavalcante  
cientista da computação

## Objetivo da aula  

- Conhecer a história do Java  
- A plataforma Java e a linguagem Java  
- Versões do Java  
- O que é IDE? 

## Pré-requisitos

- Aula teórica  
- Vontade de aprender  

## História do Java  

Java é uma linguagem de programação orientada a objetos desenvolvida na década de 90, na empresa Sun Microsystem e posteriormente adquirida pela Oracle em 2008.

Quem está aprendendo Java terá muita dificuldade em programar se não entender o paradigma de orientação à objetos.

Desde seu lançamento, em maio de 1995, a plataforma Java foi adotada mais rapidamente do que qualquer outra linguagem de programação na história da computação.

Tornou-se popular pelo seu uso na internet e está presente em navegadores, programas e jogos de computador, celular, calculadores, etc.

## Características do Java

O Java é uma **linguagem interpretada**.

Quando um programador faz códigos Java ao salvar o documento no fim esse arquivo deve ser salvo como nome_do_arquivo.java, o compilador JavaC transforma esse arquivo nome_do_arquivo.java em arquivo nome_do_arquivo.class, esse arquivo nome_do_arquivo.class é interpretado pela JVM (Java Virtual Machine) em linguagem de máquina da respectiva plataforma, windows, linux, macintosh ou mobile, que será executado a partir de então executado por essa plataforma.

Diferente das linguagens de programação compiladas, a compilação do código se dá ainda em tempo de desenvolvimento, a linguagem Java é compilada para um **bytecode**(arquivo *.class) que é interpretada por uma máquina virtual (Java Virtual Machine).

Um código C compilado funciona assim(estamos abstraindo muito): código -> compilação do código -> codigo de máquina -> execução do código de máquina.  
Um código interpretado java funciona assim(estamos abstraindo muito): código java -> compilaçaõo do código por JavaC -> bytecode -> interpretação do bytecode pela JVM -> execução do código de máquina interpretado pela JVM.

## Plataforma Java x Linguagem Java

A linguagem de programação Java é a linguagem convencional da Plataforma Java, mas não é a sua única linguagem.

Groove, Jruby e Jython são outras linguagens da plataforma Java.

Uma grande vantagem da plataforma é a de não estar presa a um único sistema operacional ou *hardware*, pois seus programas são executados através de uma máquina virtual que pode ser emulada.

once right, run anywhere (escreva uma vez, execute em qualquer lugar).  

Para ler programas Java precisamos ter em nossa máquina o ambiente Java, que é o pacote de programas JRE (Java Run Environment - ambiente de execução Java). 

Java SE (Java Plataform, Standard Edition - Plataforma Java, edição padrão) - edição padrão.  
Java EE (Java Plataform, Enterprise Edition - Plataforma Java, edição empresarial) - edição que pode ser utilizada para desenvolvimento web.  
Java ME (Java Plataform, Micro Edition - Plataforma Java, edição pequena) - edição para desenvolvimento de dispositivos móveis e sistemas embarcados.  

Tem mais duas plataformas Java Card e JavaFX.

## Fase da execução Java

1. Escrevemos o código-fonte (que será salvo como arquivo de extensão .java)  
2. Utilizamos o **JDK** para compilar o código-fonte e gerar o arquivo *bytecode* (arquivo de extensão .class)  
3. Para executar o seu programa, a **JVM** (Java Virtual Machine) lê o arquivo compilado (.class) e as bibliotecas padrões do Java que estão no **JRE**.

O **JDK** (Java Development Kit - Conjunto de desenvolvimento Java) é um conjunto de softwares que deve ser instalado com o propósito de desenvolver aplicações Java, pessoas que desejam apenas executar programas Java não precisarão dos softwares incluídos nesse pacote.

O **JRE** (Java Run Environment - Ambiente de execução Java) é o pacote para quem deseja apenas executar aplicações Java, desenvolvedores já tem esse pacote dentro do JDK.

O **JVM** (Java Virtual Machine - Maquina virtual Java) é a maquina virtual do Java que interpreta o código Java para a linguagem de máquina.

## JDK x JRE

**JDK** (Java Development Kit - Conjunto de desenvolvimento Java) é o conjuto de softwares de desenvolvimento Java responsável por compilar código-fonte (.java) em *bytecode* (.class).

**JVM** (Java Virtual Machine - Máquina virtual Java) é a máquina virtual do Java responsável por executar *bytecode* (.class).

**JRE** (Java Run Environment - Ambiente de execução Java) é o ambiente de execução do Java que fornece as bibliotecas padrões do Java para o JDK compilar o seu código e para a JVM executar o seu programa.

## Versões do Java

A principal diferença entre o OpenJDK (gratuito) e JDK Oracle (pago): O **OpenJDK** é um Java totalmente open source (código aberto, você pode ver esse código e até fazer contribuições para sua melhora) com uma GNU General Public License (tipo de licensa que permite e proibe algumas coisas) e já o **JDK Oracle** requer uma licensa comercial sob o contrato de licensa de código binário Oracle.

Por conta de ser pago, o JDK Oracle tem uma equipe de suporte que pode ajudar caso haja necessidade de fazer alguma implementação específica nesse pacote de desenvolvimento (JDK Oracle) que atenda a necessidade específica de uma grande empresa.

Os lançamentos da versão **OpenJDK LTS (long time suport - suporte de longo prazo)** acontecem pelo menos a cada quatro anos. Será a versão que iremos usar.

## O que é IDE?

IDE (Integrated Development Environment), ou ambiente de desenvolvimento integrado, é um software que combina ferramentas comuns de desenvolvimento em uma única interface gráfica do usuário (GUI - Graphic User Interface), facilitando o desenvolvimento de aplicações.

O Java possui um conjunto de ferramentas para ser desenvolver programas baseados nele, que são conhecidos como **Java Development kit** ou **JDK**, sendo este o ambiente voltado para os desenvolvedores.

A **JDK** faz parte do funcionamento das IDE´s - programas de desenvolvimento como o Intellij, Eclipse, Netbeans, entre outros.

Nesse curso iremos tratar das IDEs intellij e eclipse.

### Eclipse

Eclipse é uma IDE para o desenvolvimento Java, porém suporta várias outras linguagens. Ele foi feito em Java e segue o modelo open source de desenvolvimento de software.

### Intellij

O Intellij é um ambiente de desenvolvimento integrado escrito em Java para o desenvolvimento de software de computador. Está disponível como uma edição da comunidade licenciada Apache 2, e em uma edição comercial proprietária.

### Outras IDEs para programar Java  

- Visual Studio code  
- Netbeans  
- BlueJ  
- Jcreator 

Não se apegue a IDE, pare de ser fanático, não seja esse tipo de pessoa, IDEs são ferramentas. Por isso que se apenas, e só apenas, eu identificar que uma ferramenta está demasiado complicado para o propósito de aprendizado, eu faço prevalecer meu desejo, caso contrário eu gosto de aprender o novo mesmo, no caso já fiz um curso Java que usa a IDE NetBeans, e eu gostei muito do NetBeans, mas nesse curso eu quero usar um pouco de eclipse e um pouco de Intellij, inclusive eu tenho o intellij na máquina já, então assim comigo não tem isso não eu adoro experimentar para saber o que cada um tem de bom e assim fazer minha escolha.

Fim da aula 
