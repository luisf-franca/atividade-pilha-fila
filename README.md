# Implementação de Navegador e Fila Hospitalar

Este projeto contém a implementação de dois sistemas em Java:

1. Sistema de Navegação – Gerencia os botões de avançar e voltar do navegador usando pilhas.
2. Sistema de Fila de Pacientes – Controla a ordem de atendimento em um hospital usando filas.

## Tecnologias Utilizadas

- Java (Estruturas de Dados: Stack e Queue)
- LaTeX (Overleaf) para documentação

## Estrutura do Projeto

```
projeto-mozilla
 ├── navegador.java  (Código do navegador)
 ├── hospital.java  (Código do sistema hospitalar)
 ├── README.md  (Este documento)
 ├── documentacao.pdf  (Relatório final em LaTeX)
```

## Funcionamento

### Navegador Web

- Mantém um histórico de páginas navegadas.
- O botão Voltar armazena a página atual na pilha de avanço.
- O botão Avançar restaura a última página visitada.

### Fila de Pacientes

- Gera senhas numeradas para os pacientes.
- O paciente chamado é removido da fila e enviado para atendimento.
- Mantém um histórico de chamadas.

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/luisf-franca/projeto-mozilla
   cd projeto-mozilla
   ```
2. Compile e execute o código Java:
   ```bash
   javac Navegador.java && java Navegador
   javac Hospital.java && java Hospital
   ```
3. Para visualizar a documentação, abra o documentacao.pdf.

## Documentação

A documentação completa está disponível no arquivo documentacao.pdf e foi escrita em LaTeX (Overleaf).

## Autor

Luís Filipe França
Contato: luisfranca@outlook.com
