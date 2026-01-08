# Automação de Testes Web – Cadastro e Login (BDD)

Projeto de **automação de testes funcionais web** desenvolvido com **Java**, **Selenium WebDriver** e **Cucumber (BDD)**, com foco na validação dos fluxos de **cadastro de usuário** e **login** em um site de e-commerce.

Os testes simulam a navegação real do usuário, validando regras de negócio, mensagens de erro, preenchimento obrigatório de campos e fluxo de autenticação.

---

## 🎯 Objetivo do Projeto

- Demonstrar conhecimentos em **automação de testes web**
- Aplicar conceitos de **BDD (Behavior Driven Development)**
- Validar fluxos críticos de negócio:
  - Criação de conta
  - Validação de e-mail
  - Validação de campos obrigatórios
  - Login com sucesso
- Utilizar o padrão **Page Object** para organização e reutilização do código

---

## 🧪 Cenários de Teste Automatizados

Os cenários foram escritos em **Gherkin (PT-BR)** e cobrem os seguintes casos:

### ✅ Cadastro de usuário
- Cadastro com sucesso
- Validação de e-mail inválido
- Tentativa de cadastro sem preenchimento do formulário
- Validação de mensagens de erro obrigatórias

### ✅ Login
- Login com credenciais válidas
- Exibição da tela de boas-vindas após autenticação

### Exemplo de cenário BDD

```gherkin
Dado que o cliente opte por fazer o cadastro
Quando escrever um e-mail valido
E clicar no botao Crie a sua conta aqui
Entao deve apresentar a tela para o preenchimento das informacoes pessoais
🛠️ Tecnologias e Ferramentas
Java

Selenium WebDriver

Cucumber (BDD)

JUnit

ChromeDriver

Google Chrome

Page Object Pattern

⚙️ Estratégia de Testes
Testes funcionais em nível end-to-end

Interação com elementos via id, xpath, className e tagName

Validações de:

Conteúdo exibido em tela

Preenchimento correto dos campos

Mensagens de erro

Uso do padrão Page Object para separar regras de teste e elementos de tela

Execução controlada do navegador (setup e teardown)

▶️ Como Executar os Testes
Clonar este repositório

Configurar o caminho do chromedriver.exe conforme o ambiente local

Importar o projeto em uma IDE Java (Eclipse ou IntelliJ)

Executar os testes via:

Runner do Cucumber

Ou como JUnit Test

⚠️ Observações Importantes
Projeto desenvolvido para fins educacionais e portfólio

Os dados utilizados são apenas para testes

O uso de Thread.sleep foi aplicado para fins didáticos

O projeto pode ser evoluído com:

Hooks do Cucumber (@Before / @After)

Esperas explícitas (WebDriverWait)

Relatórios de execução

Parametrização de dados (Scenario Outline)

👤 Autor
Wagner Fontes
QA | Automação de Testes Web, API e Mobile
