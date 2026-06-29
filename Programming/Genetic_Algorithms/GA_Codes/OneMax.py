import numpy as np
import matplotlib.pyplot as plt
from prettytable import PrettyTable

# ==========================================
# 1. PARÂMETROS DO ALGORITMO GENÉTICO
# ==========================================
BIT_STRING_LENGTH = 30  # Tamanho da cadeia de bits
POPULATION_SIZE = 50    # Número de indivíduos
GENERATIONS = 60        # Máximo de gerações
CROSSOVER_RATE = 0.85   # Chance de cruzamento
MUTATION_RATE = 0.01    # Chance de mutação por bit
ELITE_SIZE = 2          # Melhores indivíduos preservados
TOURNAMENT_SIZE = 3     # Tamanho do torneio

# Listas para guardar o histórico do gráfico
history_generation = []
history_best_fitness = []
history_avg_fitness = []

# ==========================================
# 2. FUNÇÕES OPTIMIZADAS COM NUMPY
# ==========================================

def calculate_fitness(population):
    """Calcula a aptidão de toda a população de uma vez (soma das linhas)."""
    return np.sum(population, axis=1)

def selection_tournament(population, fitnesses):
    """Seleciona um indivíduo através de torneio."""
    indices = np.random.choice(len(population), TOURNAMENT_SIZE, replace=False)
    best_index = indices[np.argmax(fitnesses[indices])]
    return population[best_index].copy()

def crossover(parent1, parent2):
    """Cruzamento de ponto único usando fatiamento do NumPy."""
    if np.random.rand() < CROSSOVER_RATE:
        point = np.random.randint(1, BIT_STRING_LENGTH)
        child1 = np.concatenate([parent1[:point], parent2[point:]])
        child2 = np.concatenate([parent2[:point], parent1[point:]])
        return child1, child2
    return parent1.copy(), parent2.copy()

def mutate(individual):
    """Mutação vetorizada: inverte o bit onde a máscara aleatória for verdadeira."""
    mutation_mask = np.random.rand(BIT_STRING_LENGTH) < MUTATION_RATE
    # Inverte os bits usando a operação XOR (^)
    individual[mutation_mask] ^= 1
    return individual

# ==========================================
# 3. LOOP PRINCIPAL E RELATÓRIOS
# ==========================================

# Inicializa a população aleatoriamente com matriz NumPy (0s e 1s)
population = np.random.randint(2, size=(POPULATION_SIZE, BIT_STRING_LENGTH))

# Configuração da tabela de exibição
table = PrettyTable()
table.field_names = ["Geração", "Melhor Fitness", "Fitness Médio", "Melhor Indivíduo"]

print("Evoluindo a população...\n")

solution_found = False
for generation in range(GENERATIONS):
    # Calcula aptidão de todos
    fitnesses = calculate_fitness(population)
    
    # Ordena a população pelo fitness (decrescente)
    sorted_indices = np.argsort(fitnesses)[::-1]
    population = population[sorted_indices]
    fitnesses = fitnesses[sorted_indices]
    
    # Coleta de dados estatísticos
    best_ind = population[0]
    best_fit = fitnesses[0]
    avg_fit = np.mean(fitnesses)
    
    history_generation.append(generation)
    history_best_fitness.append(best_fit)
    history_avg_fitness.append(avg_fit)
    
    # Adiciona linha resumida na tabela (mostrando apenas algumas gerações ou a última)
    if generation % 5 == 0 or best_fit == BIT_STRING_LENGTH:
        ind_str = "".join(map(str, best_ind))
        table.add_row([generation, f"{best_fit}/{BIT_STRING_LENGTH}", f"{avg_fit:.2f}", ind_str])
    
    # Critério de parada
    if best_fit == BIT_STRING_LENGTH:
        solution_found = True
        break
        
    # Construção da nova geração
    next_generation = []
    
    # Elitismo
    for i in range(ELITE_SIZE):
        next_generation.append(population[i].copy())
        
    # Reprodução
    while len(next_generation) < POPULATION_SIZE:
        p1 = selection_tournament(population, fitnesses)
        p2 = selection_tournament(population, fitnesses)
        
        c1, c2 = crossover(p1, p2)
        
        next_generation.append(mutate(c1))
        if len(next_generation) < POPULATION_SIZE:
            next_generation.append(mutate(c2))
            
    population = np.array(next_generation)

# Exibe os resultados estruturados no terminal
print(table)
if solution_found:
    print(f"\n✨ Sucesso! O indivíduo ideal foi encontrado na geração {generation}!")
else:
    print("\nO limite de gerações foi atingido antes de encontrar a solução perfeita.")

# ==========================================
# 4. PLOTAGEM DO GRÁFICO (MATPLOTLIB)
# ==========================================
plt.figure(figsize=(10, 6))
plt.plot(history_generation, history_best_fitness, label="Melhor Fitness", color="green", linewidth=2)
plt.plot(history_generation, history_avg_fitness, label="Fitness Médio", color="blue", linestyle="--")
plt.axhline(y=BIT_STRING_LENGTH, color="red", linestyle=":", label="Objetivo Máximo")

plt.title("Evolução do Algoritmo Genético (Problema OneMax)", fontsize=14)
plt.xlabel("Geração", fontsize=12)
plt.ylabel("Aptidão (Quantidade de 1s)", fontsize=12)
plt.legend(loc="lower right")
plt.grid(True, linestyle=":", alpha=0.6)

# Exibe o gráfico na tela
plt.show()