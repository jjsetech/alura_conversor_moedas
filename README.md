# 💱 Conversor de Moedas - Projeto Alura

Este é um projeto desenvolvido como parte dos estudos da **formação Java da Alura**. Trata-se de um **Conversor de Moedas** que utiliza uma API pública de taxas de câmbio em tempo real para converter valores entre diferentes moedas internacionais.

## 🚀 Funcionalidades

- Conversão em tempo real entre diferentes moedas
- Interface de linha de comando (CLI) interativa
- Utiliza a [ExchangeRate API](https://www.exchangerate-api.com/) para obter as taxas de câmbio
- Estrutura modular com boas práticas de programação em Java
- Suporte a múltiplas conversões:

  - Dólar (USD) → Real (BRL)
  - Real (BRL) → Dólar (USD)
  - Dólar (USD) → Iene Japonês (JPY)
  - Iene Japonês (JPY) → Dólar (USD)
  - Dólar (USD) → Peso Filipino (PHP)
  - Peso Filipino (PHP) → Dólar (USD)

## 🧠 Tecnologias utilizadas

- Java 17+
- API REST (HTTP GET)
- Gson (conversão JSON → Java)
- Padrão Enum + Serviço para escalabilidade

## 📂 Estrutura do Projeto

Alura_Conversor_Moedas/src/

├── Main.java  
├── model/  
│ └── ConversionType.java  
├── service/  
│ └── ExchangeRateService.java  
├── util/  
│ └── InputUtil.java

## ⚙️ Como executar

### 1. Clone o repositório
```bash
git clone https://github.com/seu-usuario/conversor-moedas-alura.git
```
```bash
cd conversor-moedas-alura
```

### 2. Compile e execute
Se estiver usando terminal com javac:

```bash
javac -d bin src/**/*.java
```
```bash
java -cp bin Main
```

Ou importe diretamente na sua IDE (IntelliJ, Eclipse, VS Code com Java) e execute a classe Main.

## 🛠️ Substitua sua chave de API
No arquivo ExchangeRateService.java, substitua:
```bash
private static final String API_KEY = "YOUR_API_KEY";
```
por sua chave obtida gratuitamente em: https://www.exchangerate-api.com/

## 📚 Aprendizados
Manipulação de APIs REST com Java
Leitura e parsing de JSON com Gson
Boas práticas de encapsulamento e modularização
Enum como estratégia de múltiplas conversões
Estrutura de menus interativos via CLI

## 🧑‍🏫 Projeto proposto por
Este projeto foi desenvolvido com base nos desafios e exercícios sugeridos pela Alura durante a formação Java.

## 📝 Licença
Este projeto está licenciado sob a Licença MIT. Veja o arquivo LICENSE para mais detalhes.

## 💬 Feedback
Se tiver sugestões ou melhorias, fique à vontade para abrir uma issue ou um pull request. 👊🚀
