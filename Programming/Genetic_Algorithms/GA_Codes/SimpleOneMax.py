import random

# 1. PARÂMETROS DO ALGORITMO GENÉTICO
BIT_STRING_LENGTH = 20  # Tamanho da cadeia de bits (o objetivo é ter vinte '1's)
POPULATION_SIZE = 50    # Número de indivíduos na população
GENERATIONS = 100       # Número máximo de gerações
CROSSOVER_RATE = 0.8    # Chance de ocorrer cruzamento (80%)
MUTATION_RATE = 0.01    # Chance de mutação por bit (1%)
ELITE_SIZE = 1          # Quantidade de melhores indivíduos copiados direto para a próxima geração
TOURNAMENT_SIZE = 3     # Quantidade de indivíduos que disputam o torneio de seleção

# 2. FUNÇÕES DO AG
def create_individual():
    """Cria um indivíduo aleatório (lista de 0s e 1s)."""
    return [random.randint(0, 1) for _ in range(BIT_STRING_LENGTH)]

def fitness(individual):
    """Função de Aptidão: Conta quantos '1's o indivíduo possui."""
    return sum(individual)

def selection_tournament(population):
    """Seleção por Torneio: Escolhe o melhor entre indivíduos aleatórios."""
    tournament = random.sample(population, TOURNAMENT_SIZE)
    # Retorna o indivíduo com maior fitness no torneio
    return max(tournament, key=fitness)

def crossover(parent1, parent2):
    """Cruzamento de Ponto Único (Single-Point Crossover)."""
    if random.random() < CROSSOVER_RATE:
        point = random.randint(1, BIT_STRING_LENGTH - 1)
        child1 = parent1[:point] + parent2[point:]
        child2 = parent2[:point] + parent1[point:]
        return child1, child2
    else:
        # Se não houver cruzamento, os filhos são cópias exatas dos pais
        return parent1.copy(), parent2.copy()

def mutate(individual):
    """Mutação por inversão de bit (Flip Bit Mutation)."""
    for i in range(len(individual)):
        if random.random() < MUTATION_RATE:
            # Inverte o bit: 0 vira 1, 1 vira 0
            individual[i] = 1 - individual[i]
    return individual


# 3. LOOP PRINCIPAL DE EVOLUÇÃO
# Inicialização da População
population = [create_individual() for _ in range(POPULATION_SIZE)]

print(True, f"Iniciando evolução para encontrar {BIT_STRING_LENGTH} bits '1'...\n")

for generation in range(GENERATIONS):
    # Ordena a população com base no fitness (do melhor para o pior)
    population = sorted(population, key=fitness, reverse=True)
    
    best_ind = population[0]
    best_fit = fitness(best_ind)
    
    print(f"Geração {generation}: Melhor Fitness = {best_fit}/{BIT_STRING_LENGTH} -> {best_ind}")
    
    # Critério de parada: encontramos o indivíduo perfeito?
    if best_fit == BIT_STRING_LENGTH:
        print(f"\n Solução encontrada na geração {generation}!")
        break
        
    # Criação da nova população (Nova Geração)
    next_generation = []
    
    # Aplicando Elitismo: passa os melhores direto
    for i in range(ELITE_SIZE):
        next_generation.append(population[i].copy())
        
    # Preenche o resto da população com reprodução, cruzamento e mutação
    while len(next_generation) < POPULATION_SIZE:
        # Seleção dos pais
        parent1 = selection_tournament(population)
        parent2 = selection_tournament(population)
        
        # Cruzamento
        child1, child2 = crossover(parent1, parent2)
        
        # Mutação
        child1 = mutate(child1)
        child2 = mutate(child2)
        
        # Adiciona à nova população (respeitando o limite de tamanho)
        next_generation.append(child1)
        if len(next_generation) < POPULATION_SIZE:
            next_generation.append(child2)
            
    # Atualiza a população para a próxima iteração
    population = next_generation
else:
    print("\nFim das gerações. O algoritmo chegou ao limite sem encontrar a solução perfeita.")