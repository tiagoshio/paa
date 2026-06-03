# Algoritmo de Dijkstra

## Como funciona

Dado um grafo com pesos não negativos nas arestas:

1. Cria-se um vetor com as distâncias para cada vértice, inicializado com valores infinitos — exceto o índice que representa o vértice de origem, que recebe o valor zero.
2. A partir do vértice de origem, analisa-se a distância de cada vizinho não visitado. Se a soma da distância acumulada do vértice atual com a aresta para o vizinho for menor que o valor presente no vetor, a distância é atualizada. Esse processo é chamado de **relaxamento**.
3. Após o relaxamento, o vértice atual é marcado como visitado e o próximo vértice escolhido é o não visitado com a menor distância até a origem.
4. O processo se repete até que todos os vértices tenham sido visitados.

## Técnica utilizada

O algoritmo de Dijkstra é um **algoritmo guloso**: a cada iteração, ele faz a escolha localmente ótima — o vértice não visitado com a menor distância acumulada — esperando que essas escolhas levem a uma solução globalmente ótima.

## Complexidade

```
O((V + E) log V)
```

## Quando usar / não usar

| ✅ Quando usar | ❌ Quando não usar |
|---|---|
| Menor caminho de um ponto a todos | Grafos com ciclos negativos |
| Grafos com pesos não negativos | Arestas com pesos negativos |
| Grafos direcionados e não-direcionados | Grafos muito densos |
| Grafos com poucas arestas ||
 |  Quando é necessário conhecer o caminho completo |

## Exemplos de aplicação

- **GPS** — cálculo de rotas com menor distância ou tempo
- **Roteamento de pacotes na Internet** — protocolos como OSPF utilizam variações do algoritmo para encontrar o caminho de menor custo entre roteadores