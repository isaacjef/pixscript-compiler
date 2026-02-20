# pixscript-compiler

projeto
A partir da linguagem apresentada, deseja-se criar um analisador léxico para geração de
código tokenizado e da tabela de símbolos. A seguir as características do programa:
- O analisador léxico poderá ser escrito nas linguagens: Java; Python; Javascript; C
ou C++;
- O programa deverá receber um arquivo no formato pix. O conteúdo do arquivo é
um texto;
- O programa deverá gerar um arquivo no formato pixobj. O conteúdo do arquivo é
um texto contendo o código tokenizado;
- O programa deverá gerar um arquivo no formato csv. O conteúdo do arquivo é um
texto no formato CSV contendo a tabela de símbolos;
- Caso haja algum erro durante o processo da análise léxica, será gerado um arquivo
log contendo o erro que foi gerado.

Exemplo de um código completo escrito em PIX Script.
```LEDGER transferencia
 LET @nome = 'Denecley Alvim'
 LET @produto = 'Placa Nvidia 5070RTX'
 LET $valor = 4999.99
 LET !pix = "soinformatica@gmail.com"
 IF (!pix != "") {
 $> 'Realizar transferência'
 }
 :: {
 $> 'Aguardando chave PIX'
 }
CLOSE```

