_Estudos realizados por @basiern através do curso de formaçao de Java oferecido pela Digital Innovation One em conjunto com estudos da disciplina Lógica de Programação na Uninassau._

# ESTUDO SOBRE ESTRUTURAS
# CONDICIONAIS, TENÁRIOS E REPETIÇÃO

## CONDICIONAIS

### ✏️ IF-ELSE

🔸Estrutura condicional simples se-então-senão.

🔸 A estrutura em java é: 

_if (condição){_
    _Instruções caso a condição seja positiva_
_} else {_
    _Instruções caso a condição seja negativa_
_}_

🔸Também é possível adicionar else-if caso deseje colocar mais condições, como um sistema de notas que deva retornar se o aluno foi aprovado (IF), se foi para final (ELSE-IF) ou se foi reprovado (ELSE).

### ✏️ SWITCH-CASE

🔸Já o SWICH-CASE é uma estrutura condicional múltipla escolha. O usuário digita um valor e o programa executa uma ação de acordo com o valor digitado.

🔸 A estrutura em java é:

_switch (valor){_
    _case 1:_
        _Instruções caso o valor seja 1_
        _break;_
    _case 2:_
        _Instruções caso o valor seja 2_
        _break;_
    _default:_
        _Instruções caso o valor não seja nem 1 nem 2_
        _break;_
_}_

## TERNARIOS

🔸O operador ternário é uma estrutura condicional que permite fazer uma comparação entre dois valores e retornar um terceiro valor, normalmente substitui o IF-ELSE.

🔸 A estrutura em java é:

_variavel = (condição) ? valor1 : valor2;_

## REPETIÇÃO

### ✏️ FOR

🔸O FOR é uma estrutura de repetição com variável de controle, ou seja, o número de repetições é definido previamente.

🔸 A estrutura em java é:

_for (variavel de inicialização; condição de validação; incremento) {_
    _Instruções que serão executadas até que a condição seja falsa_
    _}_

🔸Para incrementar basta adicionar ++, para decrementar é --.

### ✏️ WHILE

🔸O WHILE é uma estrutura de repetição com teste lógico no início, ou seja, o número de repetições não é definido previamente.

🔸 Nesse caso, o programa para de executar assim que a condição for falsa (ou nem a executa, se a condição já começar falsa)

🔸 A estrutura em java é:

_while (condição) {_
    _Instruções que serão executadas até que a condição seja falsa_
    _}_

### ✏️ DO-WHILE

🔸O DO-WHILE é uma estrutura de repetição com teste lógico no final, ou seja, o número de repetições não é definido previamente.

🔸 Nesse caso, o programa executa pelo menos uma vez, mesmo que a condição seja falsa, considerando que o teste só vem no final.

🔸 A estrutura em java é:

_do {_
    _Instruções que serão executadas até que a condição seja falsa_
    _} while (condição);_
    
### Extra: Break e Continue

🔸O break é utilizado para interromper a execução de um laço de repetição, ou seja, ele sai do laço e vai para a próxima instrução.

🔸O continue é utilizado para pular uma iteração do laço de repetição, ou seja, ele pula a instrução e vai para a próxima iteração.
