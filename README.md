💱 Conversor de Moedas - Java Console App
![Java](https://img.shields.io/badge/Java-17-blue.svg?logo=java) ![Gson](https://img.shields.io/badge/Gson-2.10-green.svg?logo=google) ![API REST](https://img.shields.io/badge/API-ExchangeRate-blueviolet) ![Console](https://img.shields.io/badge/Interface-Console-lightgrey)

🧾 Sobre o Projeto
Este é um projeto desenvolvido em Java, com foco em linha de comando (console), que realiza conversões monetárias entre diferentes moedas. As taxas de câmbio utilizadas são obtidas em tempo real por meio da ExchangeRate API, garantindo atualizações dinâmicas e precisão nas conversões.

O projeto é ideal para estudantes e iniciantes em Java que desejam praticar conceitos como:
- Manipulação de entrada e saída via console
- Consumo de APIs REST com HttpClient
- Leitura e manipulação de JSON com Gson
- Organização em classes separadas
  
🎯 Funcionalidades
- Conversão entre múltiplas moedas
- Taxas atualizadas em tempo real via API
- Interface textual clara e amigável
- Possibilidade de realizar várias conversões seguidas
- Suporte às moedas: USD, EUR, GBP, JPY, CAD, ARS, BRL
🔧 Tecnologias Utilizadas
- Java 17
- Gson (Google)
- java.net.http.HttpClient
- ExchangeRate API
🔗 API Utilizada
O projeto utiliza a API gratuita da ExchangeRate-API que oferece endpoints simples e rápidos para acessar as taxas de câmbio.

Exemplo de endpoint:
https://v6.exchangerate-api.com/v6/SUA_API_KEY/latest/USD

▶️ Demonstração
📷 Imagem do Programa Rodando
*(Substitua abaixo pelo caminho da imagem)*
![Demonstração](https://github.com/Evertonferrg/conversormoedasjava/blob/main/img/Captura%20de%20tela%202025-04-23%20164316.png)
🎥 Vídeo Demonstrativo
*(Adicione o link do seu vídeo abaixo)*
[▶️ Assista à demonstração](https://drive.google.com/file/d/1pQNNztbo4z-KVOZCdc4q4lZcwELSTxgq/view?usp=drive_link)

🚀 Como Executar o Projeto
1. Clone o repositório:
   git clone https://github.com/seu-usuario/conversor-moedas-java.git
   cd conversor-moedas-java

2. Compile os arquivos:
   javac CurrencyConverter.java ExchangeRateService.java

3. Execute o programa: 
   java CurrencyConverter
   
📁 Estrutura do Projeto
📦 conversor-moedas-java

├── CurrencyConverter.java        # Interface principal com menus e interação

├── ExchangeRateService.java      # Comunicação com a API e leitura das taxas

├── imagens/                      # Imagens da demonstração

├── README.md                     # Este arquivo

🙋‍♂️ Autor
Everton Ferreira Guedes
Desenvolvedor em formação com foco em Java e Full Stack
   
🔗 www.linkedin.com/in/everton-ferreira-guedes-8595371aa

🔧 https://github.com/evertonferrg

